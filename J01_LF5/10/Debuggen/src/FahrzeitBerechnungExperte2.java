import java.util.Scanner;

public class FahrzeitBerechnungExperte2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gesamtzeit = 0.0;

        System.out.println("Willkommen zur Fahrzeitberechnung!");
        System.out.println("Geben Sie die Entfernungen und Geschwindigkeiten für mehrere Streckenabschnitte an.");
        System.out.println("Hinweis: Geben Sie eine Entfernung von 0 ein, um die Berechnung zu beenden.");

        int abschnitt = 0;

        while (true) {
            abschnitt++;
            System.out.printf("Streckenabschnitt %d\n", abschnitt);
            System.out.print("Geben Sie die Entfernung (in km) ein: ");
            double entfernung = scanner.nextDouble();

            // Scary!
            if (entfernung == 0) {
                break; // Schleife beenden, wenn die Entfernung 0 ist
            }

            System.out.print("Geben Sie die durchschnittliche Geschwindigkeit (in km/h) ein: ");
            double geschwindigkeit = scanner.nextDouble();

            if (geschwindigkeit <= 0) {
                System.out.println("Ungültige Geschwindigkeit! Bitte geben Sie einen Wert größer als 0 ein.");
                abschnitt--; // Abschnittsnummer korrigieren
                continue;
            }

            // Fahrzeit berechnen
            double fahrzeit = entfernung / geschwindigkeit;

            // Die Berechnung hier ist.. fragwürdig. Da wir uns in einer Dimension mit linearer Zeit befinden, werde ich sie austauschen.
            // Sorry, Einstein!
            /*
            if (abschnitt % 3 == 0) {
                gesamtzeit += fahrzeit * 0.9;
            } else {
                gesamtzeit += fahrzeit;
            }*/
            gesamtzeit += fahrzeit;

            System.out.printf("Fahrzeit für diesen Abschnitt: %.2f Stunden\n", fahrzeit);
        }

        System.out.printf("Gesamte Fahrzeit: %.2f Stunden\n", gesamtzeit);
        System.out.println("Vielen Dank für die Nutzung des Programms!");
        scanner.close();
    }


}
