import java.util.ArrayList;

/**
 * Dies implementiert die Klasse Raumschiff mit allen wichtigen (und unwichtigen) Methoden :)
 *
 * @author 9hax
 * @version 0.1-beta-unstable
 */
public class Raumschiff {
    /**
     * Beinhaltet den Schiffsnamen zu Kommunikationszwecken zwischen den Schiffen
     */
    private String schiffsname;

    private int zustandSchildeInProzent, energieversorgungInProzent,
            zustandHuelleInProzent, zustandLebenserhaltungssystemeInProzent,
            photonentorpedoAnzahl, androidenAnzahl;
    private static final ArrayList<String> broadcastKommunikator = new ArrayList<>();
    private ArrayList<Ladung> ladungsverzeichnis;

    /**
     * Initialisiert ein neues Raumschiff sowie ein zugehöriges Ladungsverzeichnis.
     */
    public Raumschiff() {
        ladungsverzeichnis = new ArrayList<>();
    }

    /**
     * Initialisiert ein neues Raumschiff sowie zugehörige Daten.
     * @param photonentorpedoAnzahl Anzahl der geladenen Photonentorpedos
     * @param zustandSchildeInProzent Zustand der Schilde in Prozent
     * @param energieversorgungInProzent Zustand der Energieversorgung in Prozent
     * @param zustandHuelleInProzent Zustand der Schiffshülle in Prozent
     * @param zustandLebenserhaltungssystemeInProzent Zustand der Lebenserhaltungssysteme in Prozent
     * @param androidenAnzahl Anzahl der auf dem Schiff vorhandenen Androiden
     * @param schiffsname Name des Schiffes
     */
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

    /**
     * Informiert über die Anzahl der geladenen Torpedos.
     * @return die Anzahl geladener Torpedos.
     */
    public int getPhotonentorpedoAnzahl() {
        return photonentorpedoAnzahl;
    }

    /**
     * Setzt die Anzahl der geladenen Torpedos auf einen neuen Wert.
     * @param photonentorpedoAnzahlNeu neuer Wert für die Anzahl geladener Torpedos.
     */
    public void setPhotonentorpedoAnzahl(int photonentorpedoAnzahlNeu) {
        this.photonentorpedoAnzahl = photonentorpedoAnzahlNeu;
    }

    /**
     * Gibt eine Prozentwert (0-100) zurück, der den Zustand der Schilde repräsentiert.
     * @return Der Prozentwert
     */
    public int getSchildeInProzent() {
        return zustandSchildeInProzent;
    }

    /**
     * Setzt einen neuen Prozentwert für den Zustand der Schilde.
     * @param zustandSchildeInProzentNeu Der neue Prozentwert
     */
    public void setSchildeInProzent(int zustandSchildeInProzentNeu) {
        this.zustandSchildeInProzent = capPercentage(zustandSchildeInProzentNeu);
    }

    /**
     * Gibt eine Prozentwert (0-100) zurück, der den Zustand der Energieversorgung repräsentiert.
     * @return Der Prozentwert
     */
    public int getEnergieversorgungInProzent() {
        return energieversorgungInProzent;
    }

    /**
     * Setzt einen neuen Prozentwert für den Zustand der Energieversorgung.
     * @param energieversorgungInProzentNeu Der neue Prozentwert.
     */
    public void setEnergieversorgungInProzent(int energieversorgungInProzentNeu) {
        this.energieversorgungInProzent = capPercentage(energieversorgungInProzentNeu);
    }

    /**
     * Gibt eine Prozentwert (0-100) zurück, der den Zustand der Hülle repräsentiert.
     * @return Der Prozentwert
     */
    public int getHuelleInProzent() {
        return zustandHuelleInProzent;
    }

    /**
     * Setzt einen neuen Prozentwert für den Zustand der Schiffshülle.
     * @param zustandHuelleInProzentNeu Der neue Prozentwert.
     */
    public void setHuelleInProzent(int zustandHuelleInProzentNeu) {
        this.zustandHuelleInProzent = capPercentage(zustandHuelleInProzentNeu);
    }

    /**
     * Gibt eine Prozentwert (0-100) zurück, der den Zustand der Lebenserhaltungssysteme repräsentiert.
     * @return Der Prozentwert
     */
    public int getLebenserhaltungssystemeInProzent() {
        return zustandLebenserhaltungssystemeInProzent;
    }

    /**
     * Setzt einen neuen Prozentwert für den Zustand der Lebenserhaltungssysteme.
     * @param zustandLebenserhaltungssystemeInProzentNeu Der neue Prozentwert.
     */
    public void setLebenserhaltungssystemeInProzent(int zustandLebenserhaltungssystemeInProzentNeu) {
        this.zustandLebenserhaltungssystemeInProzent = capPercentage(zustandLebenserhaltungssystemeInProzentNeu);
    }

    /**
     * Gibt die Anzahl der Reparaturandroiden auf dem Schiff zurück.
     * @return Die Anzahl der Reparaturandroiden
     */
    public int getAndroidenAnzahl() {
        return androidenAnzahl;
    }

    /**
     * Aktualisiert die Anzahl der Androiden auf dem Schiff.
     * @param androidenAnzahl Die neue Anzahl der Androiden auf dem Schiff.
     */
    public void setAndroidenAnzahl(int androidenAnzahl) {
        this.androidenAnzahl = androidenAnzahl;
    }

    /**
     * Gibt den Namen des Schiffes zurück.
     * @return Der Name des Schiffes (nicht eindeutig)
     */
    public String getSchiffsname() {
        return schiffsname;
    }

    /**
     * Aktualisiert den Namen des Schiffes mit einem neuen Wert.
     * @param schiffsname Der neue Name für das Schiff.
     */
    public void setSchiffsname(String schiffsname) {
        this.schiffsname = schiffsname;
    }

    /**
     * Fügt Ladung zum Ende des Ladungsverzeichnisses hinzu
     * @param neueLadung ein Objekt des Typs Ladung.
     */
    public void addLadung(Ladung neueLadung) {
        ladungsverzeichnis.add(neueLadung);
    }

    /**
     * Fügt Ladungsmengen zum Ladungsverzeichnis hinzu.
     * @param neueLadung ein Objekt des Typs Ladung.
     */
    public void loadLadung(Ladung neueLadung) {
        boolean added = false;
        for (Ladung ladung : ladungsverzeichnis) {
            if (ladung.getBezeichnung().equals(neueLadung.getBezeichnung())) {
                ladung.setMenge(ladung.getMenge() + neueLadung.getMenge());
                added = true;
                break;
            }
        }
        if (!added) ladungsverzeichnis.add(neueLadung);
    }

    /**
     * Entfernt die angegebene Menge einer Ladung des gleichen Typs.
     * Ist die angeforderte Menge der Ladung nicht vorhanden, wird eine Fehlermeldung an System.out gesendet
     * Achtung! Diese Methode wirft bei unmöglichen Parametern keine Fehler!
     * @param ladung Der Typ der Ladung, die entfernt werden soll.
     * @param menge Die Menge der Ladung, die entfernt werden soll.
     */
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

    /**
     * Feuert einen Photonentorpedo auf ein Raumschiff ab.
     * @param r Das angeschossene Raumschiff.
     */
    public void photonentorpedoSchiessen(Raumschiff r) {
        if (photonentorpedoAnzahl <= 0) {
            nachrichtAnAlle("-=*Click*=-");
        } else {
            photonentorpedoAnzahl--;
            nachrichtAnAlle("Photonentorpedo abgeschossen");
            treffer(r);
        }
    }

    /**
     * Feuert die Phaserkanone auf ein Schiff ab.
     * @param r Das angeschossene Raumschiff.
     */
    public void phaserkanoneSchiessen(Raumschiff r) {
        if (energieversorgungInProzent < 50) {
            nachrichtAnAlle("-=*Click*=-");
        } else {
            energieversorgungInProzent -= 50;
            nachrichtAnAlle("Phaserkanone abgeschossen");
            treffer(r);
        }
    }

    /**
     * Registriert einen Treffer auf ein Raumschiff.
     * @param r das angeschossene Raumschiff.
     */
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

    /**
     * Sendet eine Nachricht an alle anderen Raumschiffe über den BroadcastKommunikator.
     * @param message Enthält die zu sendende Nachricht
     */
    public void nachrichtAnAlle(String message) {
        System.out.printf("%s sendet: \"%s\"\n", this.schiffsname, message);
        broadcastKommunikator.add(message);
    }

    /**
     * Gibt den BroadcastCommunicator zurück.
     * @return die ArrayList mit String-Objekten, eine georderte Liste der Nachrichten.
     */
    public static ArrayList<String> eintraegeLogbuchZurueckgeben() {
        return broadcastKommunikator;
    }

    /**
     * Lädt Photonentorpedos aus dem Ladungsverzeichnis in die Kanonen und macht diese damit Feuerbereit.
     * @param anzahlTorpedos Die Anzahl der Torpedos, die aus dem Ladungsverzeichnis geladen werden sollen.
     */
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

    /**
     * Repariert die angegebene Teile des Schiffes.
     * Je mehr Schiffsteile repariert werden müssen, desto weniger wird pro Aufruf repariert.
     * @param schutzschilde Gibt an, ob die Schutzschilde repariert werden sollen.
     * @param energieversorgung Gibt an, ob die Energieversorgung repariert werden soll.
     * @param schiffshuelle Gibt an, ob die Schiffshülle repariert werden sollen.
     * @param anzahlDroiden Gibt an, wie viele Androiden zur Reparatur verwendet werden sollen.
     */
    public void reparaturDurchfuehren(boolean schutzschilde, boolean energieversorgung,
                                      boolean schiffshuelle, int anzahlDroiden) {
        int zuReparierendeTeile = 0;
        if (schutzschilde) zuReparierendeTeile++;
        if (energieversorgung) zuReparierendeTeile++;
        if (schiffshuelle) zuReparierendeTeile++;

        if (zuReparierendeTeile == 0 || anzahlDroiden <= 0) return;

        int eingesetzteDroiden = Math.min(anzahlDroiden, this.androidenAnzahl);
        int zufallszahl = (int) (Math.random() * 101); // 0-100 inklusive

        int reparaturwert = (zufallszahl * eingesetzteDroiden) / zuReparierendeTeile;

        if (schutzschilde) setSchildeInProzent(getSchildeInProzent() + reparaturwert);
        if (energieversorgung) setEnergieversorgungInProzent(getEnergieversorgungInProzent() + reparaturwert);
        if (schiffshuelle) setHuelleInProzent(getHuelleInProzent() + reparaturwert);
    }

    /**
     * Gibt den aktuellen Zustand des Ladungsverzeichnisses aus.
     */
    public void ladungsverzeichnisAusgeben() {
        System.out.printf("[%s] Das Ladungsverzeichnis beinhaltet die folgenden %d Objekte:%n", this.schiffsname, ladungsverzeichnis.size());
        for (int i = 0; i<ladungsverzeichnis.size(); i++) {
            Ladung currentElement = ladungsverzeichnis.get(i);
            System.out.printf("  %2d. %-16s (%d)%n", i+1, currentElement.getBezeichnung(), currentElement.getMenge());
        }
    }

    /**
     * Entfernt Ladungseinträge mit der Menge 0 aus dem Ladungsverzeichnis.
     */
    public void ladungsverzeichnisAufraeumen() {
        ladungsverzeichnis.removeIf(ladung -> ladung.getMenge() <= 0);

        ArrayList<Ladung> tempVerzeichnis = new ArrayList<>();
        for (Ladung ladung : ladungsverzeichnis) {
            boolean added = false;
            for (Ladung ladung1 : tempVerzeichnis) {
                if (ladung1.getBezeichnung().equals(ladung.getBezeichnung())) {
                    ladung1.setMenge(ladung1.getMenge() + ladung.getMenge());
                    added = true;
                    break;
                }
            }
            if (!added) tempVerzeichnis.add(ladung);
        }
        ladungsverzeichnis = tempVerzeichnis;
    }

    /**
     * Repräsentiert ein Raumschiff als String, mit Zeilenumbrüchen.
     * @return Der Beschreibungsstring.
     */
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

    /**
     * Hilfsmethode zum Begrenzen vom Prozentwerten in einen Bereich zwischen 0 und 100.
     * @param percentage eine unbehandelte Prozentzahl
     * @return eine Prozentzahl zwischen 0 und +100.
     */
    private int capPercentage(int percentage) {
        return Math.min(100, Math.max(0, percentage));
    }
}
