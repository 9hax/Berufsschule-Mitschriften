import java.util.Scanner;

public class FahrzeitBerechnungAnfaenger {
    /* TODO:
     *  -Setze Haltepunkte unmittelbar nach den Stellen, an denen die Benutzereingaben
     *   verarbeitet werden, um sicherzustellen, dass die Werte für Entfernung und
     *   Geschwindigkeit korrekt eingelesen und interpretiert werden.
     *  -Setze Haltepunkte bei der Berechnung der Fahrzeit und der Aktualisierung
     *   der gesamtzeit.
     *  -Setze einen Haltepunkt nach Abschluss der Schleife, um den Endwert
     *   von gesamtzeit zu prüfen.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gesamtzeit = 0;

        System.out.println("Willkommen zur Fahrzeitberechnung!");
        System.out.println("Geben Sie die Entfernungen und Geschwindigkeiten für mehrere Streckenabschnitte an.");
        System.out.println("Hinweis: Geben Sie eine Entfernung von 0 ein, um die Berechnung zu beenden.");

        while (true) { // Schleife zur Eingabe der Streckenabschnitte
            System.out.print("Geben Sie die Entfernung (in km) ein: ");
            double entfernung = scanner.nextDouble();

            if (entfernung == 0) {
                break; // Schleife beenden, wenn die Entfernung 0 ist
            }

            System.out.print("Geben Sie die durchschnittliche Geschwindigkeit (in km/h) ein: ");
            double geschwindigkeit = scanner.nextDouble();


            double fahrzeit = entfernung / geschwindigkeit; // Fahrzeit für den Abschnitt
            gesamtzeit = fahrzeit; // Gesamtfahrzeit

            System.out.printf("Fahrzeit für diesen Abschnitt: %.2f Stunden\n", fahrzeit);
        }

        System.out.printf("Gesamte Fahrzeit: %.2f Stunden\n", gesamtzeit);
        System.out.println("Vielen Dank für die Nutzung des Programms!");
        scanner.close();
    }
}