import java.util.Scanner;

public class Logikfehler {

    public static void main(String[] args) {
        /* TODO:Das Programm berechnet den Bruttowert nach Eingabe
         * vom Nettowert. Dabei zeigt das Programm keine Fehler an
         * und es laesst sich kompilieren ohne eine Fehlermeldung in der
         * Konsole auszugeben.
         * Leider liefert das Programm nicht das erwartete Ergebnis!
         * Gehen Sie wie folgt vor:
         * 1. Lokalisieren Sie den Fehler: Setzen Sie ein System.out.println()
         *    in den relevanten Code strategisch ein und geben Sie
         *    dabei die Variablen aus. um zu ueberpruefen, welche die aktuelle
         *    Belegung der einzelnen Variablen und der Berechnungen untereinander sind.
         * 2. Wiederholen Sie Ihr Vorgehen, bis Sie die Stelle fuer die Ursache
         *    des logischen Fehlers finden.
         */

        double nettowert, steuersatz;

        Scanner scan = new Scanner(System.in);

        System.out.print("Bitte Nettowert eingeben: ");
        nettowert = scan.nextDouble();

        steuersatz = 0.19;


        // Ausgabe
        System.out.print("Das Bruttowert beträgt: ");

        System.out.println(nettowert + (nettowert * steuersatz));

        scan.close();

    }

}
