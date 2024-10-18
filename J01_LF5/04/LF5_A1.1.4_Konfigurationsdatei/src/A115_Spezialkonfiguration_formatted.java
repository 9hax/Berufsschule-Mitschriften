public class
A115_Spezialkonfiguration_formatted {
    public static void
    main(String[] args) {
        String typ = "Automat AVR";
        String bezeichnung = "Q2021_FAB_A";
        String name;
        name = typ + " " + bezeichnung;

        char sprachModul = 'd';

        final byte PRUEFNR = 4;

        double maximum = 100.00;
        double patrone = 46.24;
        double prozent;
        prozent = maximum - patrone;

        int muenzenEuro = 130;
        int muenzenCent = 1280;
        int summe;
        summe = muenzenCent + muenzenEuro * 100;
        int euro;
        euro = summe / 100;
        int cent;
        cent = summe % 100;

        boolean status;
        status = (euro <= 150)
                && (euro >= 50)
                && (cent != 0)
                && (sprachModul == 'd')
                && (prozent >= 50.00)
                && (!(PRUEFNR == 5 || PRUEFNR == 6));

        System.out.println("Name: " + name);
        System.out.println("Sprache: " + sprachModul);
        System.out.println("Prüfnummer : " + PRUEFNR);
        System.out.println("Füllstand Patrone: " + prozent + " %");
        System.out.println("Summe Euro: " + euro + " Euro");
        System.out.println("Summe Rest: " + cent + " Cent");
        System.out.println("Status: " + status);
    }
}
