import java.util.Scanner;

public class A525_Treppe {
    public static void main(String[] args) {

        // Eingabe
        Scanner input = new Scanner(System.in);
        System.out.print("Treppenhöhe: ");
        int height = input.nextInt();
        System.out.print("Stufenbreite: ");
        int width = input.nextInt();

        // Verarbeitung
        for (int y = 0; y <= height; y++) {
            // Ausgabe
            System.out.println(
                    " ".repeat((height-y)*width)
                  + "*".repeat(y*width)
            );
        }
    }
}