import java.util.ArrayList;

public class WordDataFileLoader extends DataFileLoader {

    public ArrayList<String> parseData(ArrayList<String> fileContent) {

        ArrayList<String> wordList = new ArrayList<>();

        for (String line : fileContent) {
            if(!line.isBlank()) wordList.add(line.trim());
        }

        return wordList;
    }
}