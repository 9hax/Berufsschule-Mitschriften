import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Zinsen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect values
        System.out.print("Einzahlung in Euro: ");
        double downPayment = scanner.nextDouble();

        System.out.print("Zinsen in Prozent: ");
        double interestPercentage = scanner.nextDouble();

        System.out.print("Jahre: ");
        int timeframe = scanner.nextInt();

        // Calculate outputs
        double interestValue = downPayment + downPayment*(interestPercentage/100)*timeframe;
        double compoundInterestValue = downPayment * Math.pow((1 + (interestPercentage / 100)), timeframe);

        // Output calculated values
        System.out.println("\nDer Investor hat insgesamt " + interestValue + " Euro erhalten");
        System.out.println("\nDer Investor hat insgesamt " + compoundInterestValue + " Euro erhalten (mit Zinseszins)");

        // We don't have tenths of a cent, so let's just not go there. Print only the most significant two decimals.
        System.out.printf("\nDer Investor hat insgesamt %.2f Euro erhalten (mit Zinseszins)", compoundInterestValue);

        // Tear down
        scanner.close();
    }
}