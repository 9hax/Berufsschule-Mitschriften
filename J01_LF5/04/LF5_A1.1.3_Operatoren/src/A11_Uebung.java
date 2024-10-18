import java.sql.SQLOutput;

public class A11_Uebung {


    public static void main(String[] args) {

        // Übung 1

        byte cent;
        cent = 70;
        cent = 80;
        System.out.println(cent);

        double maximum = 95.50;
        System.out.println(maximum);

        // Übung 2

        boolean uebung2_var1 = true;
        short uebung2_var2 = -1000;
        float uebung2_var3 = (float)1.255;
        //float uebung2_var3 = 1.255F;
        char uebung2_var4 = '#';
        byte uebung2_var5 = 8;
        long uebung2_var6 = 2147483648L;
        //long uebung2_var6 = (long)2147483648; will not work!

        // Übung 3

        String uebung3_var1 = "No hablo español.";
        System.out.println(uebung3_var1);

        final short check_nr = 8755;
        System.out.println(check_nr);

        /*
        Übung 4

        Die Verwendung von Datentypen erleichtert dem Compiler und der Runtime das Speichermanagement und Fehlerchecking.
         */

        // A1.1.3 Übung 1

        // 1.
        short ergebnis = 4 + (8 * 9) - 1;
        System.out.println(ergebnis);

        // 2.
        int zaehler = 1;
        zaehler++;
        System.out.println(zaehler);

        // 3.
        System.out.println(22/6);

        /*
        4.

        Wird a++ verwendet, wird zuerst der Wert der Variable a abgerufen und für die evaluierung des Programmes verwendet.
        Erst im Anschluss wird die Variable inkrementiert.

        Wird stattdessen ++a verwendet, wird die Variable erst inkrementiert und dann in der evaluierung des Prgrammes verwendet.

        Beispiel:
          a = 1; 5 + a++ => 6
          a = 1; 5 + ++a => 7
         */

    }
}