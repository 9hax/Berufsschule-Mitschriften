import java.util.Scanner;

public class Übung2 {
    public static void main(String[] args) {
        // Eingabe
        Scanner inputHelper = new Scanner(System.in);
        System.out.print("Eingabe von Zahl 1: ");
        int number1 = inputHelper.nextInt();
        System.out.print("Eingabe von Zahl 2: ");
        int number2 = inputHelper.nextInt();

        // Verarbeitung
        int lowerLimit, upperLimit;
        if (number1 < number2) {
            lowerLimit = number1;
            upperLimit = number2;
        } else {
            lowerLimit = number2;
            upperLimit = number1;
        }

        lowerLimit++;

        for (; lowerLimit <= upperLimit; lowerLimit += 1) {
            if (lowerLimit%2 == 1) System.out.println(lowerLimit);
        }
    }
}