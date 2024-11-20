import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DatasetProcessor {
    // This class implements methods to preprocess word list datasets.

    public HashMap<String, List<String>> prepare_hash_map(ArrayList<String> sourceList) {
        /* Convert a list of words into a deduplicated hash map of words.
        The key will be the words letters sorted alphabetically.
        All words that have the same letters will be inserted into the List stored under the key.
         */

        HashMap<String, List<String>> dataset = new HashMap<>();

        for (String word : sourceList) {
            // Sort the Word alphabetically.
            String sorted = new String(word.chars().sorted().toArray(), 0, word.length());

            // Enter the word into the HashMap if it doesn't exist already.

            if (dataset.containsKey(sorted)) {
                List<String> siblings = dataset.get(sorted);
                if (!siblings.contains(word)) {  // Skip word if it's already in the list of letter siblings.
                    siblings.add(word);
                    dataset.put(sorted, siblings);
                }
            } else {
                List<String> siblings = new ArrayList<String>();
                siblings.add(word);
                dataset.put(sorted, siblings);
            }
        }

        return dataset;
    }
}
