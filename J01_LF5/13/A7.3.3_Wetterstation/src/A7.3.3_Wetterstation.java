public class Main {
    public static void main(String[] args) {
        double[] wetterdaten = { -15.55, -2.55, -11.44, -8.6, -14.4, -5.17, 1.48, -3.47, 2.00,
                2.14, 4.05, 7.45, 3.25, 5.04, 11.4, 7.67, 8.64, 13.28, 6.87, 15.54, 12.45, 16.55,
                20.42, 22.38, 19.58, 18.85, 23.84, 24.42, 25.54, 28.35, 30.16, 32.44, 26.55,
                22.13, 16.64, 13.33, 16.45, 17.34, 15.33, 11.13, 15.16, 11.44, 6.55, 2.13, 6.64,
                3.33, 6.45, -1.34, 5.33, -11.15 };

        wetter(wetterdaten);
    }

    private static void wetter(double[] wetterdaten) {
        double durchschnittstemparatur = 0;
        double hoechsttemparatur = 0;
        double mindesttemparatur = 400;
        int umschwungIndex = 0;
        double umschwungDifferenz = Math.abs(wetterdaten[0] - wetterdaten[1]);

        System.out.println("Anzahl an Daten: " + wetterdaten.length);

        for(int i = 0; i < wetterdaten.length; i++) {
            double value = wetterdaten[i];
            durchschnittstemparatur += value;
            if(hoechsttemparatur < value) hoechsttemparatur = value;
            if(mindesttemparatur > value) mindesttemparatur = value;

            if (i < wetterdaten.length - 1) if (Math.abs(wetterdaten[i] - wetterdaten[i+1]) > umschwungDifferenz) umschwungIndex = i;
        }

        durchschnittstemparatur /= wetterdaten.length;

        System.out.printf("Durchschnittstemperatur: %.2f\nMinimum: %.2f\nMaximum: %.2f\nUmschwung geschah an Tag %d mit einem Delta von %.2f°C.",
                durchschnittstemparatur, mindesttemparatur, hoechsttemparatur, umschwungIndex + 1, umschwungDifferenz);
    }
}