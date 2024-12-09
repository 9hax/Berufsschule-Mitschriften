import java.nio.file.Path;
import java.util.ArrayList;

public interface DataLoaderInterface {
    ArrayList<String> loadData(Path sourceFile);
    // returns null on errors and a list of words on successful load.
}

