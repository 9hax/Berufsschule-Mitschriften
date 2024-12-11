import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class MenuSystem {
    // This class is used in interactive mode.

    Scanner scanner;
    DatasetManager datasetManager;

    public MenuSystem(ArrayList<String> wordLists) {
        scanner = new Scanner(System.in);
        datasetManager = new DatasetManager(wordLists);
        showUI();
    }

    private void showMenuHelp() {
        System.out.print("""
                Twistor Main Menu
                Please select an option:
                
                1. Twist word or sentence
                2. Untwist word or sentence
                3. Load additional datasets
                4. Quit the program
                > """);
    }

    public void showUI() {

        boolean exit = false;
        while (!exit) {
            showMenuHelp();
            String input = scanner.nextLine();
            if(!input.isEmpty()) {
                switch (input.substring(0, 1)) {
                    case "1":
                        showTwistUI();
                        break;
                    case "2":
                        showUntwistUI();
                        break;
                    case "3":
                        showDatasetManagerUI();
                        break;
                    case "4":
                        exit = true;
                        break;
                    default:
                        System.out.println("Please try again.");
                        break;
                }
                showMenuHelp();
            } else {
                System.out.println("Please input at least one character.");
            }
        }
    }

    public void showTwistUI() {
        System.out.println("Please input a word or sentence to be twisted.\nEnter STOP to quit to the main menu.");
        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine();
            if (input.equals("STOP")) break;
            System.out.println(Twister.twist(input));
        }
        System.out.println("Going back to main menu...");
    }

    public void showUntwistUI() {
        System.out.println("Please input a twisted word or sentence to be untwisted.\nEnter STOP to quit to the main menu.");
        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine();
            if (input.equals("STOP")) break;
            System.out.println("The following candidates for untwisting were found:");
            ArrayList<String> candidates = Twister.untwist(input, datasetManager);
            for (String candidate : candidates) {
                System.out.println(candidate);
            }
        }
        System.out.println("Going back to main menu...");
    }

    public void showDatasetManagerUI() {
        int datasetCount = datasetManager.getDatasets().size();
        long wordCount = DatasetProcessor.getDatasetSize(datasetManager.mergeLoadedDatasets());
        System.out.println("There are currently " + datasetCount + " loaded, containing " + wordCount + " words.");
    }
}
