public class A722_ArrayUebung {
    public static void main(String args[]) {

        // 1. Deklaration eines Arrays für ganze Zahlen.
        int[] array;

        // 2. Initialisierung des Arrays mit 100 Elementen.
        array = new int[100];

        // 3. Durchlaufen des gesamten Arrays und Ausgabe des Inhalts.
        System.out.println("Inhalt des Arrays:");
        for(int temp: array) System.out.print(temp + ", ");

        // 4. Das Array mit allen ganzen Zahlen von 1 bis 100 befüllen.
        for(int i = 1; i <= 100; i++) array[i-1] = i;

        // 5. Geben Sie den Wert an der 89. Position des Arrays aus.
        System.out.println(array[89]);

        // 6. Ändern Sie den Wert des Arrayelements mit dem Index 49 zu 1060.
        array[49] = 1060;

        // Außerdem ändern Sie den Wert an der ersten und der letzte Stelle des Arrays zu 2023.
        array[0] = 2023;
        array[99] = 2023;

        // 7. Erneutes Ausgeben des Arrayinhalts.  Darstellung: Index und zugehöriger Inhalt (z.B. Index 6 - Inhalt: 7)
        System.out.println("Inhalt des Arrays:");
        for(int i = 0; i < array.length; i++) System.out.printf("Index: %d - Inhalt: %d\n", i, array[i]);

        // 8. Berechnung des Durchschnitts aller Arrayelemente
        double runningTotal = 0;
        for(int temp: array) runningTotal += temp;
        double meanAverage = runningTotal / array.length;

        // Ausgabe des Durchschnittes
        System.out.println(meanAverage);
    }
}