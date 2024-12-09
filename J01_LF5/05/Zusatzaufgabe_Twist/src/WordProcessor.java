import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordProcessor {
    public static String twistWord(String word) {
        if (word.length() < 4) { // word cannot be twisted, skip it
            return word;
        }

        char firstLetter, lastLetter;

        firstLetter = word.charAt(0);
        lastLetter = word.charAt(word.length() - 1);

        char[] middleChars = word.substring(1, word.length() - 1).toCharArray(); // word now only contains the letters to twist.

        Random random = new Random();

        for (int i = middleChars.length - 1; i > 0; i--) {
            //Pick a random character and swap the two.
            //TODO: Implement "twistedness"-value
            //int j = i+random.nextInt(twistedness);
            int j = random.nextInt(i + 1);
            char temp = middleChars[i];
            middleChars[i] = middleChars[j];
            middleChars[j] = temp;
        }

        return firstLetter + new String(middleChars) + lastLetter;
    }

    public static ArrayList<String> getUntwistCandidates(String twistedWord, HashMap<String, ArrayList<String>> dataset) {
        String sorted = new String(twistedWord.chars().sorted().toArray(), 0, twistedWord.length());

        if (dataset.containsKey(sorted)) {
            return dataset.get(sorted);
        }

        // word isn't found in dataset.
        return null;
    }

    public static ArrayList<String> splitSentence(String sentence) {
        // This is an advanced split wrapper to handle punctuation.

        ArrayList<String> result = new ArrayList<>();

        Pattern pattern = Pattern.compile("[a-zA-Z\\wäöüÄÖÜß]+|[.,!?;]");
        Matcher matcher = pattern.matcher(sentence);

        while (matcher.find()) {
            result.add(matcher.group());
        }

        return result;
    }

    public static ArrayList<String> permuteSentenceSet(ArrayList<ArrayList<String>> untwistCandidates) {
        // Initialize a queue to hold partial sentences
        if (untwistCandidates == null) return null;

        Queue<String> queue = new LinkedList<>();
        queue.add(""); // Start with an empty sentence

        // Iterate over each group of words
        for (ArrayList<String> group : untwistCandidates) {
            int currentLevelSize = queue.size(); // Number of partial sentences to process at this level

            // Process all partial sentences in the queue for the current group
            for (int i = 0; i < currentLevelSize; i++) {
                String currentSentence = queue.poll(); // Remove the front of the queue

                // Append each word from the current group to the partial sentence
                for (String word : group) {
                    // If the current sentence is empty, don't add a space
                    String newSentence = currentSentence.isEmpty() ? word : currentSentence + " " + word;
                    queue.add(newSentence); // Add the new sentence back to the queue
                }
            }
        }

        // After processing all groups, the queue contains all possible sentences
        return new ArrayList<>(queue);
    }
}
