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

    public static String htmlHeader = "<html>\n  <body>\n    <p>";
    public static String htmlFooter = "</p>\n  </body>\n</html>";
    public static String htmlFooterBacklink = "</p>\n    </br>\n    <a href=\"/\">[back to main page]</a>\n  </body>\n</html>";

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
        System.out.printf("Server started on port %d.\nYou can access the web api at: http://127.0.0.1:%d/\n", port, port);
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
                            <p><code>/load/[type]/[filename]</code> - Load another Dataset (Types: 1 - Plain, 2 - JSON, 3 - CSV)</p>
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
            String response = htmlHeader+Twister.twist(data.orElse("No Data"))+htmlFooterBacklink;
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
                response = htmlHeader + "<h1>The following candidates for untwisting were found:</h1>";
                for (String candidate : candidates) {
                    response += candidate + "</br>";
                }
                response += htmlFooterBacklink;
            } else {
                response = formatToHtml("The program was unable to untwist this.");
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
                        response += formatToHtml("Invalid type identifier.");
                        break;
                }
                String datasetCount = String.valueOf(datasetManager.getDatasets().size());
                String wordCount = String.valueOf(DatasetProcessor.getDatasetSize(datasetManager.mergeLoadedDatasets()));
                response += formatToHtml("Loaded dataset "+datasetPath+". There are currently "+datasetCount+" Datasets loaded, containing "+wordCount+" words.");
                exchange.sendResponseHeaders(200, response.length());
                try (OutputStream os = exchange.getResponseBody()) {
                    os.write(response.getBytes());
                }
            } else {
                String response = formatToHtml("Invalid request format. Use /load/a/b (b can contain slashes)");
                exchange.sendResponseHeaders(400, response.length());
                try (OutputStream os = exchange.getResponseBody()) {
                    os.write(response.getBytes());
                }
            }
        }
    }

    public static String formatToHtml(String bodyContent) {
        return formatToHtml(bodyContent, true);
    }

    public static String formatToHtml(String bodyContent, boolean includeBack) {
        if (includeBack) return htmlHeader + bodyContent + htmlFooterBacklink;
        else return htmlHeader + bodyContent + htmlFooter;
    }

}
