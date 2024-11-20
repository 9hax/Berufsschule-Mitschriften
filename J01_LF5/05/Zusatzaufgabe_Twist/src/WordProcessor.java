import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
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
            int j = random.nextInt(i + 1);
            char temp = middleChars[i];
            middleChars[i] = middleChars[j];
            middleChars[j] = temp;
        }

        return firstLetter + new String(middleChars) + lastLetter;
    }

    public static List<String> getUntwistCandidates(String twistedWord, HashMap<String, List<String>> dataset) {
        String sorted = new String(twistedWord.chars().sorted().toArray(), 0, twistedWord.length());

        if (dataset.containsKey(sorted)) {
            return dataset.get(sorted);
        }

        // word isn't found in dataset.
        return null;
    }

    public static List<String> splitSentence(String sentence) {
        // This is an advanced split wrapper to handle punctuation.

        List<String> result = new ArrayList<>();

        // Regular expression to match words and punctuation
        Pattern pattern = Pattern.compile("[a-zA-Z]+|[.,!?;]");
        Matcher matcher = pattern.matcher(sentence);

        while (matcher.find()) {
            result.add(matcher.group());
        }

        return result;
    }

}
