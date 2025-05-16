public class A7_3_4_Selection_Sort {
    public static void main(String[] args) {
        int[] mainArray = {3,6,12,2,1,50};

        for(int sorted = 0; sorted < mainArray.length; sorted++) {
            int swapIndex = sorted;
            for(int start = sorted;start<mainArray.length;start++) if (mainArray[start]<mainArray[swapIndex]) swapIndex=start;
            int temp = mainArray[sorted];
            mainArray[sorted] = mainArray[swapIndex];
            mainArray[swapIndex] = temp;
        }

        System.out.println("Sortiertes Array:");
        for(int value:mainArray) System.out.print(value + " ");
    }
}