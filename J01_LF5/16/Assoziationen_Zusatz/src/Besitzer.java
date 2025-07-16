public class Besitzer {
    private String name, vorname;
    private Konto konto1, konto2;

    private void initKonten () {
        konto1 = new Konto();
        konto1.setBesitzer(this);
        konto2 = new Konto();
        konto2.setBesitzer(this);
    }
    public Besitzer() {
        initKonten();
    }

    public Besitzer(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
        initKonten();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setKonto1(Konto konto1) {
        this.konto1 = konto1;
    }

    public Konto getKonto1() {
        return konto1;
    }

    public void setKonto2(Konto konto2) {
        this.konto2 = konto2;
    }

    public Konto getKonto2() {
        return konto2;
    }

    public void gesamtUebersicht() {
        System.out.println(this);
    }

    public double gesamtGeld() {
        double vermoegen = this.konto1.getKontostand() + this.konto2.getKontostand();
        System.out.println(vermoegen);
        return vermoegen;
    }

    @Override
    public String toString() {
        return "Besitzer { name='" + name + "', vorname='" + vorname + '\'' +
                ",\n  konto1=" + konto1 +
                ",\n  konto2=" + konto2 +
                "\n}";
    }
}
