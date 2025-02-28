import java.util.Scanner;

public class Primzahl {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Scanner globalScanner = new Scanner(System.in);

        int startNumber = inputInt("Bitte geben Sie die erste Zahl ein: ", globalScanner);
        int endNumber = inputInt("Bitte geben Sie die zweite Zahl ein: ", globalScanner);

        if (startNumber > endNumber) {
            int temp = endNumber;
            endNumber = startNumber;
            startNumber = temp;
        }

        globalScanner.close();

        printPrim(startNumber, endNumber);
    }

    public static boolean isPrim(int candidate) {
        if (candidate <= 1)
            return false;
        for (int i = 2; i < candidate / 2 + 1; i++)
            if (candidate % i == 0)
                return false;
        return true;
    }

    public static int inputInt(String text, Scanner scanner) {
        System.out.print(text);
        int input = scanner.nextInt();
        if (input < 0) input *= -1;
        return input;
    }

    public static void printPrim(int number1, int number2) {
        System.out.printf("Primzahlen zwischen %d und %d:%n", number1, number2);
        double averageSum = 0;
        int primeCount = 0;
        for (int iterator = number1; iterator <= number2; iterator++) {
            if (isPrim(iterator)) {
                System.out.println(iterator);
                averageSum += iterator;
                primeCount++;
            }
        }
        System.out.printf("Durchschnitt: %.2f", averageSum / primeCount);
    }
}