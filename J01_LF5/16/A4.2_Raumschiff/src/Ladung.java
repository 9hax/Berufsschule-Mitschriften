public class Ladung {
    private String bezeichnung;
    private int menge;

    public Ladung(){};

    public Ladung(String bezeichnung, int menge) {
        setBezeichnung(bezeichnung);
        setMenge(menge);
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    public int getMenge() {
        return menge;
    }

    @Override
    public String toString() {
        return "Ladung{" +
                "bezeichnung='" + bezeichnung + '\'' +
                ", menge=" + menge +
                '}';
    }
}
