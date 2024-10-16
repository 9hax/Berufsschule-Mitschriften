
public class LogikfehlerII {

	public static void main(String[] args) {
		/* TODO:Das Programm tauscht den Inhalt von zwei Variablen aus.
		 * Dabei zeigt das Programm keine Fehler an
		 * und es laesst sich kompilieren ohne eine Fehlermeldung in der 
		 * Konsole auszugeben.
         * Leider liefert das Programm nicht das erwartete Ergebnis! 
		 * Gehen Sie wie folgt vor:
		 * 1. Lokalisieren Sie den Fehler: Setzen Sie ein System.out.println() 
		 *    in den relevanten Code strategisch ein und geben Sie 
		 *    dabei die Variablen aus. um zu ueberpruefen, welche die aktuelle 
		 *    Belegung der einzelnen Variablen und der Berechnungen untereinander sind. 
		 * 2. Wiederholen Sie Ihr Vorgehen, bis Sie die Stelle fuer die Ursache 
		 *    des logischen Fehlers finden. 
		 */
		int a = 5, b = 7;
		int tmp;
		
		tmp = b;
		b = a;
		a = tmp;
		
		System.out.println("a: " + a + "\nb: " + b);
		

	}

}
