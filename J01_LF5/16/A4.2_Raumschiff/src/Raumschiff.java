import java.util.ArrayList;

public class Raumschiff {
    private String schiffsname;
    private int zustandSchildeInProzent, energieversorgungInProzent,
            zustandHuelleInProzent, zustandLebenserhaltungssystemeInProzent,
            photonentorpedoAnzahl, androidenAnzahl;
    private static ArrayList<String> broadcastKommunikator = new ArrayList<>();
    private ArrayList<Ladung> ladungsverzeichnis;

    public Raumschiff() {
        ladungsverzeichnis = new ArrayList<>();
    }

    public Raumschiff(int photonentorpedoAnzahl, int zustandSchildeInProzent,
                      int energieversorgungInProzent, int zustandHuelleInProzent,
                      int zustandLebenserhaltungssystemeInProzent,
                      int androidenAnzahl, String schiffsname) {
        ladungsverzeichnis = new ArrayList<>();
        setPhotonentorpedoAnzahl(photonentorpedoAnzahl);
        setSchildeInProzent(zustandSchildeInProzent);
        setEnergieversorgungInProzent(energieversorgungInProzent);
        setHuelleInProzent(zustandHuelleInProzent);
        setLebenserhaltungssystemeInProzent(zustandLebenserhaltungssystemeInProzent);
        setAndroidenAnzahl(androidenAnzahl);
        setSchiffsname(schiffsname);
    }

    public int getPhotonentorpedoAnzahl() {
        return photonentorpedoAnzahl;
    }

    public void setPhotonentorpedoAnzahl(int photonentorpedoAnzahlNeu) {
        this.photonentorpedoAnzahl = photonentorpedoAnzahlNeu;
    }

    public int getSchildeInProzent() {
        return zustandSchildeInProzent;
    }

    public void setSchildeInProzent(int zustandSchildeInProzentNeu) {
        this.zustandSchildeInProzent = capPercentage(zustandSchildeInProzentNeu);
    }

    public int getEnergieversorgungInProzent() {
        return energieversorgungInProzent;
    }

    public void setEnergieversorgungInProzent(int energieversorgungInProzentNeu) {
        this.energieversorgungInProzent = capPercentage(energieversorgungInProzentNeu);
    }

    public int getHuelleInProzent() {
        return zustandHuelleInProzent;
    }

    public void setHuelleInProzent(int zustandHuelleInProzentNeu) {
        this.zustandHuelleInProzent = capPercentage(zustandHuelleInProzentNeu);
    }

    public int getLebenserhaltungssystemeInProzent() {
        return zustandLebenserhaltungssystemeInProzent;
    }

    public void setLebenserhaltungssystemeInProzent(int zustandLebenserhaltungssystemeInProzentNeu) {
        this.zustandLebenserhaltungssystemeInProzent = capPercentage(zustandLebenserhaltungssystemeInProzentNeu);
    }

    public int getAndroidenAnzahl() {
        return androidenAnzahl;
    }

    public void setAndroidenAnzahl(int androidenAnzahl) {
        this.androidenAnzahl = androidenAnzahl;
    }

    public String getSchiffsname() {
        return schiffsname;
    }

    public void setSchiffsname(String schiffsname) {
        this.schiffsname = schiffsname;
    }

    public void addLadung(Ladung neueLadung) {
        ladungsverzeichnis.add(neueLadung);
    }

    /*public void addLadung(Ladung neueLadung) {
        boolean hasAdded = false;
        for (int index = 0; index < ladungsverzeichnis.size(); index++) {
            Ladung tempLadung = ladungsverzeichnis.get(index);
            if (tempLadung.getBezeichnung().equals(neueLadung.getBezeichnung())) {
                tempLadung.setMenge(neueLadung.getMenge());
                ladungsverzeichnis.set(index, tempLadung);
                hasAdded = true;
                break;
            } // else continue;
        }
        if (!hasAdded) ladungsverzeichnis.add(neueLadung);
    }*/

    public void removeLadung(Ladung ladung, int menge) {
        boolean gefunden = false;
        for (int i = 0; i < ladungsverzeichnis.size(); i++) {
            Ladung aktuelleLadung = ladungsverzeichnis.get(i);

            if (aktuelleLadung.getBezeichnung().equals(ladung.getBezeichnung())) {
                gefunden = true;
                int vorhandeneMenge = aktuelleLadung.getMenge();

                if (menge <= vorhandeneMenge) {
                    aktuelleLadung.setMenge(vorhandeneMenge - menge);
                    System.out.printf("[%s] Die gewünschte Ladung %s vom Ladungsverzeichnis konnte entladen werden.%n", this.schiffsname, ladung.getBezeichnung());

                    if (aktuelleLadung.getMenge() > 0) {
                        System.out.printf("[%s] Noch %d Einheiten von der Ladung %s vorhanden.%n", this.schiffsname, aktuelleLadung.getMenge(), ladung.getBezeichnung());
                    } else {
                        ladungsverzeichnis.remove(i);
                        System.out.printf("[%s] Es sind keine Einheiten mehr von der Ladung im Raumschiff vorhanden.\n", this.schiffsname);
                    }

                } else {
                    ladungsverzeichnis.remove(i);
                    System.out.printf("[%s] Nur %d Ladung %s vom Ladungsverzeichnis konnte entladen werden.%n", this.schiffsname, vorhandeneMenge, ladung.getBezeichnung());
                    System.out.printf("[%s] Es sind keine Einheiten mehr von der Ladung im Raumschiff vorhanden.%n", this.schiffsname);
                }
                break;
            }
        }
        if (!gefunden) {
            System.out.printf("[%s] Die Ladung %s ist nicht vorhanden!%n", this.schiffsname, ladung.getBezeichnung());
        }
    }

    public void photonentorpedoSchiessen(Raumschiff r) {
        if (photonentorpedoAnzahl <= 0) {
            nachrichtAnAlle("-=*Click*=-");
        } else {
            photonentorpedoAnzahl--;
            nachrichtAnAlle("Photonentorpedo abgeschossen");
            treffer(r);
        }
    }

    public void phaserkanoneSchiessen(Raumschiff r) {
        if (energieversorgungInProzent < 50) {
            nachrichtAnAlle("-=*Click*=-");
        } else {
            energieversorgungInProzent -= 50;
            nachrichtAnAlle("Phaserkanone abgeschossen");
            treffer(r);
        }
    }

    private void treffer(Raumschiff r) {
        r.nachrichtAnAlle(r.getSchiffsname() + " wurde getroffen!");
        r.setSchildeInProzent(r.getSchildeInProzent() - 50);

        if (r.getSchildeInProzent() <= 0) {
            r.setSchildeInProzent(0);
            r.setHuelleInProzent(r.getHuelleInProzent() - 50);
            r.setEnergieversorgungInProzent(r.getEnergieversorgungInProzent() - 50);

            if (r.getHuelleInProzent() <= 0) {
                r.setHuelleInProzent(0);
                r.setLebenserhaltungssystemeInProzent(0);
                r.nachrichtAnAlle("Alle Lebenserhaltssysteme sind ausgefallen. " + r.getSchiffsname() + " wurde zerstört!");
            } else {
                r.nachrichtAnAlle("Die Schilde sind zusammengebrochen! Die Hülle wurde beschädigt.");
            }
        } else {
            r.nachrichtAnAlle("Die Schilde wurden getroffen.");
        }
    }

    public void nachrichtAnAlle(String message) {
        System.out.printf("%s sendet: \"%s\"\n", this.schiffsname, message);
        broadcastKommunikator.add(message);
    }

    public static ArrayList<String> eintraegeLogbuchZurueckgeben() {
        return broadcastKommunikator;
    }

    public void photonentorpedosLaden(int anzahlTorpedos) {
        // Suche nach Ladung "Photonentorpedo"
        Ladung torpedoLadung = null;
        for (Ladung l : ladungsverzeichnis) {
            if ("Photonentorpedo".equalsIgnoreCase(l.getBezeichnung())) {
                torpedoLadung = l;
                break;
            }
        }

        if (torpedoLadung == null || torpedoLadung.getMenge() <= 0) {
            System.out.println("["+this.schiffsname+"] Keine Photonentorpedos gefunden!");
            nachrichtAnAlle("-=*Click*=-");
            return;
        }

        int vorhandeneMenge = torpedoLadung.getMenge();
        int zuLaden = Math.min(anzahlTorpedos, vorhandeneMenge);

        // Ladung reduzieren und Torpedos erhöhen
        torpedoLadung.setMenge(vorhandeneMenge - zuLaden);
        setPhotonentorpedoAnzahl(getPhotonentorpedoAnzahl() + zuLaden);

        System.out.printf("[%s] %d Photonentorpedos geladen. Verfügbare Photonentorpedos: %d%n", this.schiffsname, zuLaden, torpedoLadung.getMenge());
    }

    public void reparaturDurchfuehren(boolean schutzschilde, boolean energieversorgung,
                                      boolean schiffshuelle, int anzahlDroiden) {
        int zuReparierendeTeile = 0;
        if (schutzschilde) zuReparierendeTeile++;
        if (energieversorgung) zuReparierendeTeile++;
        if (schiffshuelle) zuReparierendeTeile++;

        if (zuReparierendeTeile == 0 || anzahlDroiden <= 0) return;

        int eingesetzteDroiden = Math.min(anzahlDroiden, this.androidenAnzahl);
        int zufallszahl = (int) (Math.random() * 101); // 0-100 inkl.

        int reparaturwert = (zufallszahl * eingesetzteDroiden) / zuReparierendeTeile;

        if (schutzschilde) setSchildeInProzent(getSchildeInProzent() + reparaturwert);
        if (energieversorgung) setEnergieversorgungInProzent(getEnergieversorgungInProzent() + reparaturwert);
        if (schiffshuelle) setHuelleInProzent(getHuelleInProzent() + reparaturwert);
    }

    public void ladungsverzeichnisAusgeben() {
        System.out.printf("[%s] Das Ladungsverzeichnis beinhaltet die folgenden %d Objekte:", this.schiffsname, ladungsverzeichnis.size());
        for (int i = 0; i<ladungsverzeichnis.size(); i++) {
            Ladung currentElement = ladungsverzeichnis.get(i);
            System.out.printf("  %2d. %-16s (%d%n)", i+1, currentElement.getBezeichnung(), currentElement.getMenge());
        }
    }

    public void ladungsverzeichnisAufraeumen() {
        ladungsverzeichnis.removeIf(ladung -> ladung.getMenge() == 0);
    }

    @Override
    public String toString() {
        return "Raumschiff{\n" +
                "  schiffsname='" + schiffsname + '\'' +
                ",\n  zustandSchildeInProzent=" + zustandSchildeInProzent +
                ",\n  energieversorgungInProzent=" + energieversorgungInProzent +
                ",\n  zustandHuelleInProzent=" + zustandHuelleInProzent +
                ",\n  zustandLebenserhaltungssystemeInProzent=" + zustandLebenserhaltungssystemeInProzent +
                ",\n  photonentorpedoAnzahl=" + photonentorpedoAnzahl +
                ",\n  androidenAnzahl=" + androidenAnzahl +
                ",\n  ladungsverzeichnis=" + ladungsverzeichnis +
                "\n}";
    }

    private int capPercentage(int percentage) {
        return Math.min(100, Math.max(0, percentage));
    }
}
