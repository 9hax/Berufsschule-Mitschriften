import java.util.ArrayList;

public class JsonDataFileLoader extends DataFileLoader {

    public ArrayList<String> parseData(ArrayList<String> fileContent) {

        ArrayList<String> wordList = new ArrayList<>();

        String jsonObject = String.join("", fileContent);

        String[] words = jsonObject.split(",\\s*");

        for (String word: words) {
            wordList.add(word.substring(1, word.length()-1).strip());
        }

        return wordList;
    }
}