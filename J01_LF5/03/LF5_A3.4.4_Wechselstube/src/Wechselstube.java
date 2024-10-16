import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Wechselstube {
    public static void main(String[] args) {
        // inialize Scanner
        Scanner scanner = new Scanner(System.in);

        // get Values from User

        System.out.print("Wie vie Euro haben Sie? ");
        int amountEuro = scanner.nextInt();

        System.out.print("Wie vie Cent haben Sie? ");
        int amountCents = scanner.nextInt();

        // calculate payout splits

        int totalCents = (amountEuro * 100) + amountCents;

        int runningValue = totalCents;

        int twoEuroCoins = runningValue / 200;
        runningValue = runningValue % 200;

        int oneEuroCoins = runningValue / 100;
        runningValue = runningValue % 100;

        int fiftyCentCoins = runningValue / 50;
        runningValue = runningValue % 50;

        int twentyCentCoins = runningValue / 20;
        runningValue = runningValue % 20;

        int tenCentCoins = runningValue / 10;
        runningValue = runningValue % 10;

        int fiveCentCoins = runningValue / 5;
        runningValue = runningValue % 5;

        int twoCentCoins = runningValue / 2;
        runningValue = runningValue % 2;

        System.out.println("Sie bekommen " + totalCents + " Cent als:");
        System.out.println(twoEuroCoins + " 2-Euro-Münzen");
        System.out.println(oneEuroCoins + " 1-Euro-Münzen");
        System.out.println(fiftyCentCoins + " 50-Cent-Münzen");
        System.out.println(twentyCentCoins + " 20-Cent-Münzen");
        System.out.println(tenCentCoins + " 10-Cent-Münzen");
        System.out.println(fiveCentCoins + " 5-Cent-Münzen");
        System.out.println(twoCentCoins + " 2-Cent-Münzen");
        System.out.println(runningValue + " 1-Cent-Münzen");

    }
}