import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

public class DatasetManager {

    HashMap<String, HashMap<String, ArrayList<String>>> datasets;

    public void loadDataset(String path) {

        WordFileDataLoader loader = new WordFileDataLoader();

        Path wordListFilePath = Paths.get(path);
        ArrayList<String> wordList =  loader.loadData(wordListFilePath);

        HashMap<String, ArrayList<String>> newDataset = DatasetProcessor.prepare_hash_map(wordList);

        if (!datasets.containsValue(newDataset))
            datasets.put(wordListFilePath.getFileName().toString(), newDataset);
    }

    public void loadDefaultDataset() {
        loadDataset("wordlist_default.txt");
    }

    public ArrayList<String> getDatasets() {
        return new ArrayList<String>(datasets.keySet());
    }
}
