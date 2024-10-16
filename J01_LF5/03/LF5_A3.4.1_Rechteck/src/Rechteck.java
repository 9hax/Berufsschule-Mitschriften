import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Rechteck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect values
        System.out.print("SeiteA (in cm): ");
        int Side_A = scanner.nextInt();

        System.out.print("SeiteB (in cm): ");
        int Side_B = scanner.nextInt();

        // Calculate outputs
        int circumference = (Side_A * 2) + (Side_B * 2);
        int area = Side_A*Side_B;

        // Output calculated values
        System.out.println("Umfang = " + circumference + " cm");
        System.out.println("Flaeche = " + area + " cm^2");

        // Tear down
        scanner.close();
    }
}