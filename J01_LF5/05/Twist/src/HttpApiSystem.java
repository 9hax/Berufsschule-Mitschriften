import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Optional;

public class HttpApiSystem {

    DatasetManager datasetManager;

    public HttpApiSystem(ArrayList<String> wordLists, int port) {
        datasetManager = new DatasetManager(wordLists);

        HttpServer server = null;
        try {
            server = HttpServer.create(new InetSocketAddress(port), 0);
        } catch (IOException e) {
            System.out.println("There was an error starting up the Web Server.");
            throw new RuntimeException(e);
        }

        // Serve an HTML page
        server.createContext("/", new HtmlHandler());
        // API Endpoint
        server.createContext("/twist", new TwistHandler());
        server.createContext("/untwist", new UntwistHandler());
        server.createContext("/load", new LoadHandler());

        server.setExecutor(null); // Use default executor
        server.start();
        System.out.println("Server started on port " + port);
    }

    class HtmlHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String datasetCount = String.valueOf(datasetManager.getDatasets().size());
            String wordCount = String.valueOf(DatasetProcessor.getDatasetSize(datasetManager.mergeLoadedDatasets()));
            String response = """
                    <html>
                        <body>
                            <h1>Twistificator Web API</h1>
                            <h2>API Documentation</h2>
                            <p><code>/twist/[Your Text Here]</code> - Return the twisted version of a String.</p>
                            <p><code>/untwist/[Your Text Here]</code> - Return the untwisted version of a String.</p>
                            <p><code>/load/[type]/[filename]</code> - Load another Dataset</p>
                            <h2>Status</h2>
                            <p>There are currently\s"""+datasetCount+" Datasets loaded, containing "+wordCount+" words.</p>"+
                        """
                        </body>
                    </html>""";
            exchange.sendResponseHeaders(200, response.length());
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(response.getBytes());
            }
        }
    }

    static class TwistHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String path = exchange.getRequestURI().getPath();
            Optional<String> data = Optional.of(path.replace("/twist/", ""));
            String response = "<html><body><p>"+Twister.twist(data.orElse("No Data"))+"</p></br><a href=\"/\">[back]</a></body></html>";
            exchange.sendResponseHeaders(200, response.length());
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(response.getBytes());
            }
        }
    }

    class UntwistHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String path = exchange.getRequestURI().getPath();
            Optional<String> data = Optional.of(path.replace("/untwist/", ""));
            String response;
            ArrayList<String> candidates = Twister.untwist(data.orElse(""), datasetManager);
            if (!candidates.isEmpty()) {
                response = "<html><body><h1>The following candidates for untwisting were found:</h1><p>";
                for (String candidate : candidates) {
                    response += candidate + "</br>";
                }
                response += "</p></br><a href=\"/\">[back]</a></body></html>";
            } else {
                response = "The program was unable to untwist this.";
            }
            exchange.sendResponseHeaders(200, response.length());
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(response.getBytes());
            }
        }
    }

    class LoadHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String path = exchange.getRequestURI().getPath();
            String[] parts = path.split("/"); // Split into at most 3 parts: ["", "load", "a/b/c"]

            System.out.println(parts.length);
            String type = parts[2];
            String datasetPath = parts[3]; // Extract everything after "/load/type/"

            System.out.println(type);
            System.out.println(datasetPath);
            if (parts.length == 4) { // Expecting "/load/type/datasetPath/c"
                String response = "";
                switch (type.substring(0, 1)) {
                    case "1":
                        new WordDataFileLoader().loadDataset(datasetPath, datasetManager);
                        break;
                    case "2":
                        new JsonDataFileLoader().loadDataset(datasetPath, datasetManager);
                        break;
                    case "3":
                        new CsvDataFileLoader().loadDataset(datasetPath, datasetManager);
                    default:
                        response += "Invalid type identifier.";
                        break;
                }
                String datasetCount = String.valueOf(datasetManager.getDatasets().size());
                String wordCount = String.valueOf(DatasetProcessor.getDatasetSize(datasetManager.mergeLoadedDatasets()));
                response += "Loaded dataset "+datasetPath+". There are currently"+datasetCount+" Datasets loaded, containing "+wordCount+" words.";
                exchange.sendResponseHeaders(200, response.length());
                try (OutputStream os = exchange.getResponseBody()) {
                    os.write(response.getBytes());
                }
            } else {
                String response = "Invalid request format. Use /load/a/b (b can contain slashes)";
                exchange.sendResponseHeaders(400, response.length());
                try (OutputStream os = exchange.getResponseBody()) {
                    os.write(response.getBytes());
                }
            }
        }
    }

}
