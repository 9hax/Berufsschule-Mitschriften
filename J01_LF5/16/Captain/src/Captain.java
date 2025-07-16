
public class Captain {

	// Attribute
	private String surname, name;
	private int captainYearsSince;
	private double salary;

	// Konstruktoren

	public Captain() {}

	public Captain(String surname, String name) {
		this.surname = surname;
		this.name = name;
	}

	public Captain(String surname, String name, int captainYearsSince, double salary) {
		this.surname = surname;
		this.name = name;
		this.setCaptainYearsSince(captainYearsSince);
		this.setSalary(salary);
	}

	// Verwaltungsmethoden
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSalary(double salary) {
		if (salary > 0) this.salary = salary;
		else {
			System.out.println("[!] Gehalt zu niedrig, wird auf 10.00 gesetzt.");
			this.salary = 10;
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void setCaptainYearsSince(int captainYearsSince) {
		if (captainYearsSince>2232) this.captainYearsSince = captainYearsSince;
		else {
			System.out.println("[!] Jahr zu niedrig, wird auf 2233 gesetzt!");
			this.captainYearsSince = 2233;
		}
	}

	public int getCaptainYearsSince() {
		return captainYearsSince;
	}

	// Weitere Methoden

	public String vollname() {
		return this.name + ' ' + this.surname;
	}

	@Override
	public String toString() {
		return "Captain{" +
				"surname='" + surname + "', name='" + name + "'\n" +
				", captainYearsSince=" + captainYearsSince +
				", salary=" + salary +
				'}';
	}
}