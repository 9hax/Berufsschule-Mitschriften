import java.util.ArrayList;
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
               \s
               1. Twist word or sentence
               2. Untwist word or sentence
               3. Load additional datasets
               4. Quit the program
               >\s""");
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
            ArrayList<String> candidates = Twister.untwist(input, datasetManager);
            if (!candidates.isEmpty()) {
                System.out.println("The following candidates for untwisting were found:");
                for (String candidate : candidates) {
                    System.out.println(candidate);
                }
            } else {
                System.out.println("The program was unable to untwist this.");
            }
        }
        System.out.println("Going back to main menu...");
    }

    public void showLoadUI() {
        System.out.print("Please input a path to your dataset file. > ");
        String input = scanner.nextLine();
        System.out.print("Please choose the correct type of dataset:\n1. Plain Text List\n2. JSON Datafile\n3. CSV\n> ");
        String type = scanner.nextLine();
        if(!type.isEmpty()) {
            switch (type.substring(0, 1)) {
                case "1":
                    new WordDataFileLoader().loadDataset(input, datasetManager);
                    break;
                case "2":
                    new JsonDataFileLoader().loadDataset(input, datasetManager);
                    break;
                case "3":
                    new CsvDataFileLoader().loadDataset(input, datasetManager);
                default:
                    System.out.println("Please try again.");
                    break;
            }
        } else {
            System.out.println("Please input at least one character.");
        }
    }

    public void showUnloadUI() {
        System.out.println();
    }

    public void showDatasetManagerUI() {
        /**
         * Unloading Datasets is not implemented. Please restart the program to unload a dataset.
         */
        boolean exit = false;
        while (!exit) {
            int datasetCount = datasetManager.getDatasets().size();
            long wordCount = DatasetProcessor.getDatasetSize(datasetManager.mergeLoadedDatasets());
            System.out.printf("There are currently %d Datasets loaded, containing %d words.\n", datasetCount, wordCount);

            System.out.print("""
                    Dataset Manager Menu
                    Please select an option:\


                    1. Load another dataset\n"""+
                    //"""
                    // 2. Unload a dataset"""+
                    """
                    2. Return to main menu.
                    >\s""");
            String input = scanner.nextLine();
            if(!input.isEmpty()) {
                switch (input.substring(0, 1)) {
                    case "1":
                        showLoadUI();
                        break;
                    case "3":
                        //showUnloadUI();
                        break;
                    case "2":
                        exit = true;
                        break;
                    default:
                        System.out.println("Please try again.");
                        break;
                }
            } else {
                System.out.println("Please input at least one character.");
            }
        }
    }
}
