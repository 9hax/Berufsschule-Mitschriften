
public class TestCaptain {

	public static void main(String[] args) {
		// Erzeugen der Objekte
		Captain cap1 = new Captain("Jean Luc", "Picard", 1364, 4500.0);
		Captain cap2 = new Captain("Azetbur", "Gorkon", 2373, 0.0);

		Captain cap3 = new Captain("Müller", "Heinz", 2245, 1820.3);

		Captain cap4 = new Captain("Mustercaptain", "Max");
		Captain cap5 = new Captain("Fliegtschlecht", "Bursche");

		Captain cap6 = new Captain();

		// Setzen der Attribute

		cap4.setCaptainYearsSince(2457);
		cap4.setSalary(1234.5);

		cap5.setCaptainYearsSince(2244);
		cap5.setSalary(80.0);

		// Bildschirmausgabe
		printCaptain(cap1, "Foederationsdukaten");
		printCaptain(cap2, "Darsek");
		printCaptain(cap3, "Foederationsdukaten");
		printCaptain(cap4, "Foederationsdukaten");
		printCaptain(cap5, "Foederationsdukaten");

		// Die nicht-initialisierten Attribute werden als "null" auf der Konsole ausgegeben
		printCaptain(cap6, "Foederationsdukaten");

	}

	private static void printCaptain(Captain captain, String waehrung) {
		System.out.printf("Name: %s\nVorname: %s\nKapitän seit: %d\nGehalt: %.2f %s\nVollname: %s\n",
				captain.getSurname(),
				captain.getName(),
				captain.getCaptainYearsSince(),
				captain.getSalary(), waehrung,
				captain.vollname());
		System.out.println(captain + "\n"); // Die toString() Methode wird aufgerufen
	}

	/* private static void printCaptain(Captain captain, String waehrung) {
		System.out.println("Name: " + captain.getSurname());
		System.out.println("Vorname: " + captain.getName());
		System.out.println("Kapitaen seit: " + captain.getCaptainYearsSince());
		System.out.println("Gehalt: " + captain.getSalary() + " " + waehrung);
		System.out.println("Vollname: " + captain.vollname());
		System.out.println(captain + "\n"); // Die toString() Methode wird aufgerufen
	} */

}