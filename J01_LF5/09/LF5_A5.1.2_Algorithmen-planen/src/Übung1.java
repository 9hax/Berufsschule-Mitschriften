import java.util.Scanner;

public class Übung1 {
    public static void main(String[] args) {
        // Eingabe
        Scanner inputHelper = new Scanner(System.in);
        System.out.print("Geben Sie bitte Ihr Alter ein: ");
        int limit = inputHelper.nextInt();

        // Verarbeitung
        if (limit < 0) System.out.println("Sie sind zu jung zur Nutzung dieses Programmes. Bitte wenden Sie sich an Ihren Erziehungsberechtigten.");

        for (int evenNumber = 2; evenNumber <= limit; evenNumber += 2) {
            // Ausgabe
            System.out.println(evenNumber);
        }
    }
}