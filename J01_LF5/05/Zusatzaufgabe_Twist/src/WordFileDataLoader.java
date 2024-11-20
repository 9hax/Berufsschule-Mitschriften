import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class WordFileDataLoader implements DataLoaderInterface {

    List<String> loadedData = null;

    @Override
    public List<String> loadData(Path sourceFile) {
        //TODO: Implement your custom Word List Loader here!

        ArrayList<String> fileContent = new ArrayList<String>();
        Scanner fileReadingScanner;
        try {
            fileReadingScanner = new Scanner(sourceFile);
        } catch (IOException e) {
            System.out.println("Error reading file.");
            return null;
        }

        while (fileReadingScanner.hasNext()) {
            fileContent.add(fileReadingScanner.next());
        }

        return fileContent;
    }

    @Override
    public long getDataSize() {
        if (loadedData != null) return loadedData.size();
        return -1;
    }
}