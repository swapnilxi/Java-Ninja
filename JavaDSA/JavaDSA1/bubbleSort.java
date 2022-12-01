package JavaDSA1;
//Time complaxity : O(N^2)- quadratic algorithm
 
public class bubbleSort {
    public static void main(String[] args) {
        int[] intArray={20,35, -7, 15, 55, 1, -22};
        for(int lastUnsortedIndex=intArray.length-1; lastUnsortedIndex>0; lastUnsortedIndex--){
            for(int i=0; i< lastUnsortedIndex; i++){
                if(intArray[i]> intArray[i+1]){
                    swap(intArray, i, i+1);
                }
            }
        }
        display(intArray);
    }
    
public static void display(int[] array){
    System.out.println("Bubble Sorted Array is :");  
    for(int i : array)
    {   
         
        System.out.printf(" "+i+" ");
    
    }

}



public static void swap(int [] array, int i, int j ){
    if(i==j){
        return;
    }
    int temp = array[i];
    array[i]= array[j];
    array[j]= temp;

}
}

