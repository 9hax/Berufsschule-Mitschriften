import java.nio.file.Path;
import java.util.List;

public interface DataLoaderInterface {
    List<String> loadData(Path sourceFile);
    // returns null on errors and a list of words on successful load.

    long getDataSize();
    // returns the amount of words.
}

