import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] zahlenArray = { 1, 5, 5, 7, 3, 11, 22, 23, 27 };
        //int[] zahlenArray = { 33, 5, 3, 5, 9, 7, 11, 23, 23, 3};

        System.out.print("Hello User! Please input the value you would like to search the array for!\n> ");
        int searchValue = sc.nextInt();

        suche(zahlenArray, searchValue);
    }

    private static void suche(int[] zahlenArray, int searchValue) {
        boolean found = false;
        for (int value: zahlenArray) {
            if (value == searchValue) { found = true; break;}
        }

        System.out.println(found ? "Gefunden." : "Nicht gefunden.");
    }
}