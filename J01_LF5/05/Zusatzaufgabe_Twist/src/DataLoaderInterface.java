import java.nio.file.Path;
import java.util.List;

public interface DataLoaderInterface {
    public List<String> loadData(Path sourceFile);
    // returns null on errors and a list of words on successful load.

    public long getDataSize();
    // returns the amount of words.
}

