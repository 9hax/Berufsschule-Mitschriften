public class Ladung {
    private String bezeichnung;
    private int menge;

    /**
     * Erzeugt ein leeres Ladungsobjekt. Leere Ladungsobjekte sollten nicht verwendet werden.
     */
    public Ladung(){}

    /**
     * Erzeugt ein neues Ladungsobjekt mit Bezeichnung und einer Menge.
     * @param bezeichnung Gibt den Namen der Ladung an.
     * @param menge Gibt die Menge der Ladung an.
     */
    public Ladung(String bezeichnung, int menge) {
        setBezeichnung(bezeichnung);
        setMenge(menge);
    }

    /**
     * Aktualisiert die Bezeichnung der Ladung mit einem neuen Wert.
     * @param bezeichnung Der neue Bezeichner der Ladung.
     */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /**
     * Gibt den Bezeichner der Ladung zurück.
     * @return Bezeichner der Ladung.
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Aktualisiert die Menge der Ladung mit einem neuen Wert.
     * @param menge die neue Menge für die Ladung. Muss 0 oder positiv sein.
     */
    public void setMenge(int menge) {
        if (menge >= 0) this.menge = menge;
        else throw new IllegalArgumentException("Menge kann nicht negativ sein!");
    }

    /**
     * Gibt die aktuelle Menge der Ladung zurück.
     * @return die Menge.
     */
    public int getMenge() {
        return menge;
    }

    /**
     * Gibt einen Beschreibungsstring mit allen Parametern der Ladung zurück.
     * @return Die Beschreibung des Objektes
     */
    @Override
    public String toString() {
        return "Ladung{" +
                "bezeichnung='" + bezeichnung + '\'' +
                ", menge=" + menge +
                '}';
    }
}
