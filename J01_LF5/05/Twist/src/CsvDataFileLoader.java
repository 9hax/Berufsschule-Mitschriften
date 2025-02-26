import java.util.ArrayList;

public class CsvDataFileLoader extends DataFileLoader {

    public ArrayList<String> parseData(ArrayList<String> fileContent) {

        ArrayList<String> wordList = new ArrayList<>();

        String csvList = String.join("", fileContent);
        System.out.println(csvList);

        String[] words = csvList.split(",\\s*");

        for (String word: words) {
            wordList.add(word.strip());
        }

        return wordList;
    }
}