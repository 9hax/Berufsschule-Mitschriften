import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Rechner {
    public static void main(String[] args) {
        // Define local integer variables to store preliminary attributes.
        int zahl1;
        int zahl2;

        // Define local integer variable to store calculation results.
        int ergebnis;

        // Prepare Scanner instance and bind to STDIN
        Scanner tastatur = new Scanner(System.in);

        // Write out prompt to get first calculation attribute from user.
        System.out.print("Bitte geben Sie eine ganze Zahl ein: ");

        // Read first calculation attribute from user.
        // This is not safe, as invalid input crashes the program without a helpful error message.
        zahl1 = tastatur.nextInt();

        // Write out prompt to get second calculation attribute from user.
        System.out.print("Bitte geben Sie eine zweite ganze Zahl ein: ");

        // Read second calculation attribute from user.
        // This is not safe, as invalid input crashes the program without a helpful error message.
        zahl2 = tastatur.nextInt();

        // Calculate uncleaned user input into a new integer variable.
        // This is not safe, as two user inputs that barely fit the bounds of an int will cause an integer overflow.
        ergebnis = zahl1 + zahl2;

        // Print a blank line.
        System.out.println();

        // Print out the result from the calculation.
        System.out.println("Summe: " + ergebnis);

        /*
        Teardown stage
        Clean up after program execution.
         */

        // Dispose of the Scanner instance, as no future keyboard input is needed.
        tastatur.close();
    }
}