import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.HashMap;

public class Twister {

    public static String twist(String input) {
        ArrayList<String> words = WordProcessor.splitSentence(input);
        ArrayList<String> twistedWords = new ArrayList<>();
        for (String word : words) {
            twistedWords.add(WordProcessor.twistWord(word));
        }
        return String.join(" ", twistedWords);
    }

    public static ArrayList<String> untwist(String input, DatasetManager datasetManager) {
        if (datasetManager.getDatasets().isEmpty()) {
            datasetManager.loadDefaultDataset();
            System.out.println("Loaded default dataset because no dataset was loaded..");
        }
        ArrayList<String> words = WordProcessor.splitSentence(input);
        HashMap<String, ArrayList<String>> dataset = datasetManager.mergeLoadedDatasets();

        ArrayList<ArrayList<String>> untwistCandidates = new ArrayList<>();
        for (String word: words) {
            untwistCandidates.add(WordProcessor.getUntwistCandidates(word, dataset));
        }

        return WordProcessor.permuteSentenceSet(untwistCandidates);
    }
}
