public class KontoTest {
    public static void main(String[] args) {
        Besitzer u_1234190 = new Besitzer("Müller", "Heinz");
        u_1234190.getKonto1().einzahlen(12.34);
        u_1234190.getKonto2().einzahlen(23.45);
        u_1234190.gesamtUebersicht();

        Besitzer u_1234172 = new Besitzer("Mustermann", "Max");
        u_1234172.getKonto1().einzahlen(1000);
        u_1234172.gesamtUebersicht();
        u_1234172.getKonto1().ueberweisen(500, u_1234190.getKonto2());

        u_1234190.gesamtUebersicht();
        u_1234172.gesamtUebersicht();
    }
}