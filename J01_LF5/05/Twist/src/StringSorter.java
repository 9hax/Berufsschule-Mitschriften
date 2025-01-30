public class StringSorter {
    public static String sortStringMiddle(String unsorted) {
        /**
         * This function sorts a string alphabetically, but leaves the first and last characters in place.
         */
        if (unsorted.length() <= 2) return unsorted;
        return unsorted.charAt(0)+new String(
                unsorted.substring(1,unsorted.length()-1).chars().sorted().toArray(),
                0,
                unsorted.length()-2
        )+unsorted.charAt(unsorted.length()-1);

    }
}
