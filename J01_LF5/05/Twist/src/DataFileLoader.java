import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public abstract class DataFileLoader {
    public void loadDataset(String path, DatasetManager manager) {
        Path filePath = Paths.get(path);
        ArrayList<String> fileContent = new ArrayList<>();
        Scanner fileReadingScanner;
        try {
            fileReadingScanner = new Scanner(filePath);
            while (fileReadingScanner.hasNext()) {
                String line = fileReadingScanner.next();
                if (!line.isBlank()) fileContent.add(line);
                // This skips blank lines.
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
        manager.addDataset(parseData(fileContent), filePath.getFileName().toString());
    }

    public abstract ArrayList<String> parseData(ArrayList<String> lines);
}
