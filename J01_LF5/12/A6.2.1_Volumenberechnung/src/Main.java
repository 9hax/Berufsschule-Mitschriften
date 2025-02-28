public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int laenge = 3;
        System.out.printf("Das Volumen eines Würfels mit Länge %dcm beinhaltet %dcm³.", laenge, volumenWuerfel(laenge));
    }

    public static double volumenWuerfel(double kantenlaenge) {
        return kantenlaenge * kantenlaenge * kantenlaenge;
    }

    public static int volumenWuerfel(int kantenlaenge) {
        return (int) volumenWuerfel((double) kantenlaenge);
    }
}