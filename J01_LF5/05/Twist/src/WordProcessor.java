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
        String sorted = StringSorter.sortStringMiddle(twistedWord);

        if (dataset.containsKey(sorted)) {
            return dataset.get(sorted);
        }

        // word isn't found in dataset, return the twistedWord.
        ArrayList<String> response = new ArrayList<>();
        response.add("["+twistedWord+"]");
        return response;
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
        ArrayList<String> responses = new ArrayList<>();
        ArrayList<String> firstWord = untwistCandidates.getFirst();

        if (untwistCandidates.isEmpty()) return responses;
        if (untwistCandidates.size() == 1) return firstWord;

        for (String permutation : permuteSentenceSet(new ArrayList<ArrayList<String>>(untwistCandidates.subList(1,untwistCandidates.size())))){
            for (String word : firstWord) {
                responses.add(word + " " + permutation);
            }
        }

        return responses;
    }
}
