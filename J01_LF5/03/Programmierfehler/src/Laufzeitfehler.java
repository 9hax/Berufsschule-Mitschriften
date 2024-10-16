
public class Laufzeitfehler {

	public static void main(String[] args) {
		/* TODO: Beheben Sie die Fehler im Programm. Gehen Sie wie folgt vor:
		 * 1. Fuehren Sie Ihr Programm aus.
		 * 2. Was beobachten Sie in der Konsolenausgabe?
		 * 3. Lesen Sie die Fehlermeldungen in der Konsole. Orientieren 
		 *    Sie sich an der Zeilennummerierung, die angegeben wird 
		 *    Bsp. (Syntaxfehler.java:12) um die Stelle zu finden, wo der Fehler ist.
		 *    Eine Ausnahme (Exception) wurde ausgeloest.
		 * 4. Recherchieren Sie die angegebene Exception um herauszufinden,
		 *    welche Ursache dieser Fehler verursacht und das Programm anzupassen.   
		 */

		int zahl1 = 8, zahl2 = 4, zahl3 = 1, zahl4 = 0, zahl5 = 3, zahl6 = 12;
		
		System.out.println("Das Programm dividiert zwei ganze Zahlen und gibt das Ergebnis in der Konsole aus.");
		
		System.out.println("Erste Division: " + zahl1/zahl2 );
		System.out.println("Zweite Division: " + zahl2/zahl3 );
		System.out.println("Dritte Division: " + zahl2/zahl1 );
		System.out.println("Vierte Division: " + zahl2/zahl4 );
		System.out.println("Fuenfte Division: " + zahl1/zahl5 );
		System.out.println("Sechste Division: " + zahl6/zahl2 );
		
	}

}
