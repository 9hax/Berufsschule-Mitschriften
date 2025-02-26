import java.util.Scanner;

public class A524_Matrix {
    public static void main(String[] args) {
        // Eingabe

        Scanner input = new Scanner(System.in);
        int blocked;
        while (true) {
            System.out.println("Bitte geben Sie eine Zahl zwischen 2 und 9 ein:");
            blocked = input.nextInt();
            if(blocked > 1 && blocked < 10) {
                break;
            } else System.out.println("Ungültige Eingabe.");
        }

        // Verarbeitung

        for (int zeile = 0; zeile < 10; zeile ++) {
            for (int spalte = 0; spalte < 10; spalte++) {
                int zahl = zeile*10 + spalte;
                if (
                        String.valueOf(zahl).contains(String.valueOf(blocked))
                        || zahl%blocked == 0
                        || String.valueOf(zahl).chars().map(c -> c-'0').sum() == blocked
                ) {
                    // Ausgabe
                    System.out.print("*       ");
                } else System.out.printf("%-8d", zahl);
            }
            System.out.println();
        }
    }
}