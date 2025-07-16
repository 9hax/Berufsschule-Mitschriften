import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Main {
    private static ArrayList<Integer> myList;
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        myList = new ArrayList<>();

        System.out.println("Array-List Demo!");

        // Fill List with 20 random numbers from 1 to 9
        fillList();

        printList();

        // Search List for number of occurrences of user specified digit
        int searchKey = scanner.nextInt();

        countOccurences(searchKey);

        findAllIndices(searchKey);

        System.out.println("This value will now be removed.");
        myList.removeIf(n -> n == searchKey);

        printList();

        appendZeroes();

        printList();

    }



    private static void appendZeroes() {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) == 5) {
                myList.add(i + 1, 0);
                i++;
            }
        }
    }

    private static void findAllIndices(int searchKey) {
        System.out.print("It appears at the following indices: ");
        for(int index = 0; index < myList.size(); index++)
            if (myList.get(index).equals(searchKey))
                System.out.printf("%d, ", index);
        System.out.println();
    }

    private static void countOccurences(int searchKey) {
        int occurences = 0;
        for(int element: myList)
            if (element == searchKey)
                occurences++;
        System.out.printf("The digit %d appears %d times in the ArrayList.\n", searchKey, occurences);
    }

    public static void fillList() {
        /*
         * Makes the list contain 20 random digits between 1 and 9.
         */
        Random r = new Random();
        myList.clear();
        for(int counter = 0; counter < 20; counter++) {
            myList.add(r.nextInt(9)+1);
        }
    }

    public static void printList() {
        for (int i = 0; i < myList.size(); i++)
            System.out.printf("myList %2d : %3d\n", i, myList.get(i));
    }
}