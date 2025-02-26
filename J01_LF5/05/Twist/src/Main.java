import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> wordLists = new ArrayList<>();
        StringBuilder inputData = new StringBuilder();

        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "--add-list":
                case "-a":
                    if (i + 1 < args.length) {
                        wordLists.add(args[++i]); // Get the next argument as value
                    } else {
                        System.err.println("Error: Missing value for " + args[i]);
                        return;
                    }
                    break;
                case "-t":
                    while (i + 1 < args.length) {
                        inputData.append(args[++i]).append(" ");
                    }
                    Twister.twist(inputData.toString().trim());
                    break;
                case "-u":
                    while (i + 1 < args.length) {
                        inputData.append(args[++i]).append(" ");
                    }
                    Twister.untwist(inputData.toString().trim(), new DatasetManager());
                    break;
                case "--interactive":
                case "-i":
                    MenuSystem menu = new MenuSystem(wordLists);
                    return;
                case "--server":
                case "-s":
                    HttpApiSystem server = new HttpApiSystem(wordLists, 8124);
                    return;
                default:
                    System.err.println("Unknown argument: " + args[i]);
                    System.exit(1);
            }
        }
    }
}