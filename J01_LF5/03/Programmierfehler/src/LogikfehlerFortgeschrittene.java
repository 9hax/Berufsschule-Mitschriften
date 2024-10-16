
public class LogikfehlerFortgeschrittene {
	public static void main(String[] args) {
		/* TODO: Das Programm gibt die kleinste Zahl 
		 * von sechs ganze Zahlen in der Konsole aus.
		 * Das Programm zeigt keine Fehler an und es laesst sich 
		 * kompilieren ohne eine Fehlermeldung in der Konsole auszugeben.
         * Leider liefert das Programm nicht das erwartete Ergebnis. 
		 * Gehen Sie wie folgt vor:
		 * 1. Lokalisieren Sie den Fehler: Setzen Sie strategisch ein  
		 *    System.out.println() in den relevanten Code ein und geben Sie 
		 *    dabei die Variable erg aus, um zu ueberpruefen, welche die aktuelle 
		 *    Belegung der Variable ist. 
		 * 2. Wiederholen Sie Ihr Vorgehen, bis Sie die Stelle fuer die Ursache 
		 *    des logischen Fehlers finden. 
		 */
		

		int zahl1 = 8, zahl2 = 4, zahl3 = 3, zahl4 = 2, zahl5 = 1, zahl6 = 12;
		int erg = zahl1;

		System.out.println("Das Programm gibt die kleinste Zahl von sechs ganze Zahlen in der Konsole aus.");

		if (zahl2 < zahl1) {
			erg = zahl2;
		} if (zahl3 < erg) {
			erg = zahl3;
		} if (zahl4 < erg) {
			erg = zahl4;
		} if (zahl5 < erg) {
			erg = zahl5;
		} if (zahl6 < erg) {
			erg = zahl6;
		}
		
		System.out.println("Die kleinste Zahl ist: " + erg);
	}

}
