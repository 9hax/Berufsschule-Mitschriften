import java.util.Scanner;

public class FahrzeitBerechnungExperte {
    /* TODO:
     *  -Setze Haltepunkte unmittelbar nach den Stellen, an denen die Benutzereingaben
     *   verarbeitet werden, um sicherzustellen, dass die Werte für Entfernung und
     *   Geschwindigkeit korrekt eingelesen und interpretiert werden.
     *  -Setze einen Haltepunkt am Anfang der Schleife, um die Werte der
     *   Schleifenvariablen zu überprüfen.
     *  -Setze Haltepunkte bei der Berechnung der Fahrzeit und der Aktualisierung
     *   der gesamtzeit.
     *  -Setze einen Haltepunkt nach Abschluss der Schleife, um den Endwert
     *   von gesamtzeit und den Zustand der Schleifenvariablen zu prüfen.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Willkommen zur Fahrzeitberechnung!");
        System.out.print("Geben Sie die Anzahl der Streckenabschnitte ein: ");
        int anzahlAbschnitte = scanner.nextInt();

        double gesamtzeit = 0.0;


        for (int abschnitt = 1; abschnitt <= anzahlAbschnitte; abschnitt++) {
            System.out.printf("Streckenabschnitt %d\n", abschnitt);
            System.out.print("Geben Sie die Entfernung (in km) ein: ");
            double entfernung = scanner.nextDouble();

            System.out.print("Geben Sie die durchschnittliche Geschwindigkeit (in km/h) ein: ");
            double geschwindigkeit = scanner.nextDouble();

            if (geschwindigkeit <= 0) {
                System.out.println("Ungültige Geschwindigkeit! Bitte geben Sie einen Wert größer als 0 ein.");
                continue;
            }

            double fahrzeit = entfernung / geschwindigkeit;


            if (abschnitt == anzahlAbschnitte) {
                gesamtzeit += fahrzeit;
                abschnitt--;
            } else {
                gesamtzeit += fahrzeit;
            }

            System.out.printf("Fahrzeit für diesen Abschnitt: %.2f Stunden\n", fahrzeit);
        }

        System.out.printf("Gesamte Fahrzeit: %.2f Stunden\n", gesamtzeit);
        System.out.println("Vielen Dank für die Nutzung des Programms!");
        scanner.close();
    }
}