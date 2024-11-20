import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class WordFileDataLoader implements DataLoaderInterface {

    ArrayList<String> loadedData = null;

    @Override
    public ArrayList<String> loadData(Path sourceFile) {
        //TODO: Implement your custom Word List Loader here!

        ArrayList<String> fileContent = new ArrayList<>();
        Scanner fileReadingScanner;
        try {
            fileReadingScanner = new Scanner(sourceFile);
        } catch (IOException e) {
            System.out.println("Error reading file.");
            return null;
        }

        while (fileReadingScanner.hasNext()) {
            String line = fileReadingScanner.next();
            if (!line.isBlank()) fileContent.add(line);
            // This skips blank lines.
        }

        return fileContent;
    }

    @Override
    public long getDataSize() {
        if (loadedData != null) return loadedData.size();
        return -1;
    }
}