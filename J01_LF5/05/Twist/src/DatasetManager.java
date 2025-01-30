import java.util.ArrayList;
import java.util.HashMap;

public class DatasetManager {

    HashMap<String, HashMap<String, ArrayList<String>>> datasets;

    public DatasetManager(ArrayList<String> wordLists) {
        datasets = new HashMap<>();
        for (String wordList: wordLists) {
            new WordDataFileLoader().loadDataset(wordList, this);
        }
    }

    public DatasetManager() {
        datasets = new HashMap<>();
    }

    public void addDataset(ArrayList<String> wordList, String name) {

        HashMap<String, ArrayList<String>> newDataset = DatasetProcessor.prepare_hash_map(wordList);

        if (!datasets.containsValue(newDataset))
            datasets.put(name, newDataset);
    }

    public void loadDefaultDataset() {
        new WordDataFileLoader().loadDataset("wordlist_default.txt", this);
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
