import java.util.Scanner;
public class Syntaxfehler {

	public static void main(String[] args) {
		/* Das Programm berechnet den Umfang eines Kreises. 
		 * Der Benutzer muss am Anfang den Durchmesser des Kreises eingeben.
		 * Beheben Sie die Fehler im Programm. Gehen Sie wie folgt vor:
		 * 1. Die Syntaxfehlern werden in der Regel sofort rot unterstrichen. 
		 * 2. Falls Sie nicht wissen, wieso etwas unterstrichen ist, koennen Sie 
		 *    mit der Maus auf die rote Markierung am Rand des Editors neben der 
		 *    Zeilennummer gehen, um den Tooltip zu oeffnen. Dies gibt Ihnen 
		 *    Hinweise ueber den Fehler und gibt haeufig Vorschlaege, wie Sie den 
		 *    Fehler beheben koennen.
		 * 3. Als naechstes kompilieren Sie Ihren Quellcode.
		 * 4. Lesen Sie die Fehlermeldungen in der Konsole. Orientieren 
		 *    Sie sich an der Zeilennummerierung, die angegeben wird 
		 *    Bsp. (Syntaxfehler.java:12) um die Stelle zu finden, wo der Fehler ist.
		 */
 

		Scanner sc = new Scanner(System.in);

		//Variablendeklaration

		double pi = 3.141;

		double durchmesser, umfang;

		
		//Eingabe

		System.out.println("Umfangsberechnung eines eckigen Kreises");

		System.out.println("Bitte geben Sie den Durchmesser ein: ");

		durchmesser = sc.nextInt();

		//Verarbeitung

		umfang = 2*pi * durchmesser;

		//Ausgabe

		System.out.println("Der Umfang betraegt " + umfang);

		sc.close();
	}

}
