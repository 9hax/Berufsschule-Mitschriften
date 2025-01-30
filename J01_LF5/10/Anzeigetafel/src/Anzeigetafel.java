import java.util.Scanner;

public class Anzeigetafel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bitte eben Sie einen Wert ein: ");
        int seite = input.nextInt();
        int i = 1;

        while (i <= seite) {
            System.out.print("X ");
            i++;
        }

        System.out.print("\n");

        i = 1;

        while (i <= seite - 2) {
            System.out.print("X");
            int space = 2;
            while (space <= seite - 1) {
                System.out.print("  ");
                space++;
            }
            System.out.print(" X\n");
            i++;
        }

        i = 1;

        while (i <= seite) {
            System.out.print("X ");
            i++;
        }

        System.out.print("\n");

    }
}