import java.util.Objects;
import java.util.Scanner;

public class MenuSystem {
    // This class is used in interactive mode.

    Scanner scanner;
    DatasetManager datasetManager;

    public MenuSystem() {
        scanner = new Scanner(System.in);
        datasetManager = new DatasetManager();
        showUI();
    }

    public void showUI() {
        while (true) {
            System.out.print(
                    """
                            Twistor Main Menu
                            Please select an option:
                            
                            1. Twist word or sentence
                            2. Untwist word or sentence
                            3. Load additional datasets
                            4. Quit the program
                            > 
                            """);
            switch (scanner.nextLine().substring(0,1)) {
                case "1":
                    showTwistUI();
                case "2":
                    showUntwistUI();
                case "3":
                    showDatasetManagerUI();
                case "4":
                    break;
                default:
                    System.out.println("Please try again.");
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
            for (String candidate : Twister.untwist(input)) {
                System.out.println(candidate);
            }
        }
        System.out.println("Going back to main menu...");
    }

    public void showDatasetManagerUI() {
        System.out.println("There are currently "+datasetManager.getDatasets());
    }
}
