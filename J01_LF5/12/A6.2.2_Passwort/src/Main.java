public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (checkPasscode(i)) System.out.printf("Das Passwort %d ist für die Originalfunktion gültig!\n", i);
            if (checkPasscodeDeobf(i)) System.out.printf("Das Passwort %d ist für die Reimplementierung gültig!\n", i);
        }
    }

    public static boolean checkPasscode(int H4X0R) {
        // gibt true zurück, falls das Passwort korrekt ist.
        boolean result = false;
        for (int E1337 = 42; E1337 <= (52 ^ (0x6c)); E1337 += (3 << (14 % 6))) {
            if (result = ((++E1337 | E1337 + (2 >>> 1)) ^ (1 + H4X0R)) == (123456789 & 0)){
                break;
            }
        }
        return result;
    }

    public static boolean checkPasscodeDeobf(int passcode) {
        return passcode == 46 || passcode == 56 || passcode == 70 || passcode == 82;
    }
}