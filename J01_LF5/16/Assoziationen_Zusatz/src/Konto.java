import java.util.Random;

public class Konto {
    private Besitzer besitzer;
    private String iban;
    private double kontostand;

    public void initKonto() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder("DE22 1001 0100 ");
        for (int i = 0; i < 4 + 4 + 2; i++) {
            if (i == 4 || i == 8) sb.append(' ');
            sb.append(random.nextInt(10));
        }
        this.iban = sb.toString();
    }

    public Konto() {
        initKonto();
    }

    public Konto(String iban, double kontostand) {
        this.iban = iban;
        this.kontostand = kontostand;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
    public String getIban() {
        return iban;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void setBesitzer(Besitzer besitzer) {
        this.besitzer = besitzer;
    }
    public Besitzer getBesitzer() {
        return besitzer;
    }

    public boolean abheben(double betrag) {
        if (betrag > 0) {
            if (kontostand - betrag > 0) {
                kontostand -= betrag;
                return true;
            } return false;
        } else throw new IllegalArgumentException("Betrag kann nicht kleiner als 0 sein!");
    }

    public void einzahlen(double betrag) {
        if (betrag > 0) kontostand+=betrag;
        else throw new IllegalArgumentException("Betrag kann nicht kleiner als 0 sein!");
    }

    public void ueberweisen(double betrag, Konto konto) {
        if (abheben(betrag)) konto.einzahlen(betrag);
        else throw new IllegalArgumentException("Kontostand reicht nicht aus!");
    }

    @Override
    public String toString() {
        return "Konto{" +
                "besitzer=" + besitzer.getName() + ", " + besitzer.getVorname() +
                ", iban='" + iban + '\'' +
                ", kontostand=" + kontostand +
                "}";
    }
}
