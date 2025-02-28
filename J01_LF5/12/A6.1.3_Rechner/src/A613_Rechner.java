import java.util.Scanner;

/**
 * Author: Lydia Vierkorn
 * Date: 2025-02-28, 10:00
 * License: The Unlicense 1.0
 */

public class A613_Rechner {
    public static void main(String[] args) {
        int x, y, m;

        Scanner s = new Scanner(System.in);

        hallo();
        x = eingabe(s, "Bitte geben Sie die erste ganze Zahl ein: ");
        y = eingabe(s, "Bitte geben Sie die zweite ganze Zahl ein: ");

        s.close();

        m = berechnen(x, y);
        ausgabe(x, y, m);

    }

    public static void hallo() {
        System.out.println("Willkommen zur Addition");
    }

    public static void ausgabe(int x, int y, int m) {
        System.out.printf("%d + %d = %d\n", x, y, m);
    }

    public static int berechnen(int x, int y) {
        return x + y;
    }

    public static int eingabe(Scanner s, String prompt) {
        System.out.print(prompt);
        int v = s.nextInt();
        return v;
    }
}