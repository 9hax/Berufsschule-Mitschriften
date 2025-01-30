import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

public class DatasetManager {

    HashMap<String, HashMap<String, ArrayList<String>>> datasets;

    public DatasetManager(ArrayList<String> wordLists) {
        datasets = new HashMap<>();
        for (String wordList: wordLists) {
            loadDataset(wordList);
        }
    }

    public DatasetManager() {
        datasets = new HashMap<>();
    }

    public void loadDataset(String path) {

        DataLoaderInterface loader = new WordFileDataLoader();

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

    public HashMap<String, ArrayList<String>> mergeLoadedDatasets() {
        HashMap<String, ArrayList<String>> fullDataset = new HashMap<>();
        for (HashMap<String, ArrayList<String>> dataset : datasets.values()) {
            for (String key: dataset.keySet()) {
                if (fullDataset.containsKey(key)) {
                    ArrayList<String> siblings = fullDataset.get(key);
                    for (String newSibling : dataset.get(key)) {
                        if (!siblings.contains(newSibling)) siblings.add(newSibling);
                    }
                } else {
                    fullDataset.put(key, dataset.get(key));
                }
            }
        }
        return fullDataset;
    }
}
