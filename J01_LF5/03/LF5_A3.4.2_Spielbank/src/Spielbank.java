import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Spielbank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect values
        System.out.print("Anzahl an 5 Euro Chips: ");
        int FiveEuroChips = scanner.nextInt();

        System.out.print("Anzahl an 10 Euro Chips: ");
        int TenEuroChips = scanner.nextInt();

        System.out.print("Anzahl an 20 Euro Chips: ");
        int TwentyEuroChips = scanner.nextInt();

        System.out.print("Anzahl an 50 Euro Chips: ");
        int FiftyEuroChips = scanner.nextInt();

        System.out.print("Anzahl an 100 Euro Chips: ");
        int HundredEuroChips = scanner.nextInt();

        // Calculate outputs
        int PayoutValue =
                (FiveEuroChips * 5) +
                        (TenEuroChips * 10) +
                        (TwentyEuroChips * 20) +
                        (FiftyEuroChips * 50) +
                        (HundredEuroChips * 100);

        // This indenting is actually what IntelliJ does. I don't know either.

        // Output calculated values
        System.out.println("\nIhr Auszahlungebetrag beträgt: " + PayoutValue + " Euro");

        // Tear down
        scanner.close();
    }
}