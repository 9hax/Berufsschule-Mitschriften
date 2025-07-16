public class RaumschiffTest {
    public static void main(String[] args) {
        Ladung l1, l2, l3, l4, l5, l6, l7;
        Raumschiff klingonen, romulaner, vulkanier;

        l1 = new Ladung("Ferengi Schneckensaft", 200);
        l2 = new Ladung("Borg-Schrott", 5);
        l3 = new Ladung("Rote Materie", 2);
        l4 = new Ladung("Forschungssonde", 35);
        l5 = new Ladung("Bat'leth Klingonen Schwert", 200);
        l6 = new Ladung("Plasma-Waffe", 50);
        l7 = new Ladung("Photonentorpedo", 3);

        klingonen = new Raumschiff(
                1, 100,
                100, 100,
                100, 2,
                "IKS Hegh'ta"
        );

        klingonen.addLadung(l1);
        klingonen.addLadung(l5);

        romulaner = new Raumschiff(
                2, 100,
                100, 100,
                100, 2,
                "IRW Khazara"
        );

        romulaner.addLadung(l2);
        romulaner.addLadung(l3);
        romulaner.addLadung(l6);

        vulkanier = new Raumschiff(
                0, 80,
                80, 50,
                100, 5,
                "Ni'Var"
        );

        vulkanier.addLadung(l4);
        vulkanier.addLadung(l7);

        // Ablauf Geschehnisse laut A4.3.1

        klingonen.photonentorpedoSchiessen(romulaner);
        romulaner.phaserkanoneSchiessen(klingonen);
        vulkanier.nachrichtAnAlle("Gewalt ist nicht logisch");
        System.out.println(klingonen);
        vulkanier.reparaturDurchfuehren(true, true, true, 10000);
        vulkanier.photonentorpedosLaden(2); vulkanier.ladungsverzeichnisAufraeumen();
        klingonen.photonentorpedoSchiessen(romulaner); klingonen.photonentorpedoSchiessen(romulaner);
        romulaner.photonentorpedoSchiessen(vulkanier);
        vulkanier.nachrichtAnAlle("Wir werden angegriffen!");
        vulkanier.nachrichtAnAlle("Wir wollen Frieden!");
        romulaner.removeLadung(l6, 35); romulaner.removeLadung(l3, 4);
        vulkanier.removeLadung(l4, 35);
        klingonen.removeLadung(l1, 100);
        romulaner.ladungsverzeichnisAufraeumen();
        vulkanier.ladungsverzeichnisAufraeumen();
        klingonen.ladungsverzeichnisAufraeumen();
        System.out.println(romulaner);
        System.out.println(vulkanier);
        System.out.println(klingonen);
        System.out.println("BroadcastKommunicator:");
        for (String entry: Raumschiff.eintraegeLogbuchZurueckgeben())
            System.out.printf(" - %s%n", entry);

    }
}
