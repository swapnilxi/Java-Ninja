package JavaDSA1;

public class insertionsort {
    public static void main(String[] args) {
        int[] intArray = { 22, 23, 35, -25, 27 };
         //int[] intArray={1,2,4,5,3};
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];// indexing
            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1]; // shifting
            }
            intArray[i] = newElement;// replacement

            System.out.println(" ");
            System.out.println("----------------------");
            System.out.println("array in " + firstUnsortedIndex +" pass");
            System.out.println("----------------------");
            for(int e: intArray){
            System.out.print(" "+ e+ " " );
            }
        }
        System.out.println("array after insertion sort");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(" " + intArray[i] + " ");
        }

    }
}
