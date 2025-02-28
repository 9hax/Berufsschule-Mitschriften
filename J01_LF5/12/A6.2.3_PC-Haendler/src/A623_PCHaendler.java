import java.util.Scanner;

public class A623_PCHaendler {

    public static void main(String[] args) {

        Scanner tastatur = new Scanner(System.in);

        // Eingabe
        String artikel = liesString(tastatur, "Was moechten Sie bestellen: ");
        int anzahl = liesInt(tastatur, "Geben Sie die Anzahl ein: ");
        double nettopreis = liesDouble(tastatur, "Geben Sie den Nettopreis ein: ");
        double mwst = liesDouble(tastatur, "Geben Sie den Mehrwertsteuersatz in Prozent ein: ");

        // Verarbeitung
        double nettogesamtpreis = berechneNettopreis(anzahl, nettopreis);
        double bruttogesamtpreis = berechneBruttopreis(nettogesamtpreis, mwst);

        // Ausgabe
        rechnungausgeben(artikel, anzahl, nettogesamtpreis, bruttogesamtpreis, mwst);

        tastatur.close();
    }
    public static String liesString(Scanner tastatur, String text) {
        System.out.print(text);
        return tastatur.next();
    }
    public static int liesInt(Scanner tastatur, String text) {
        System.out.print(text);
        return tastatur.nextInt();
    }
    public static double liesDouble(Scanner tastatur, String text) {
        System.out.print(text);
        return tastatur.nextDouble();
    }
    public static double berechneNettopreis(int anzahl, double nettopreis) {
        return anzahl * nettopreis;
    }
    public static double berechneBruttopreis(double nettogesamtpreis, double mwst) {
        return nettogesamtpreis * (1 + mwst / 100);
    }
    public static void rechnungausgeben(String artikel, int anzahl, double nettogesamtpreis, double bruttogesamtpreis, double mwst) {
        System.out.println("Rechnung");
        System.out.printf("Netto:  %-20s %6d %10.2f %n", artikel, anzahl, nettogesamtpreis);
        System.out.printf("Brutto: %-20s %6d %10.2f (%.1f%s)%n", artikel, anzahl, bruttogesamtpreis, mwst, "%");

    }
}