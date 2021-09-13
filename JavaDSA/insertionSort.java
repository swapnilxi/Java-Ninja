package JavaDSA;
//time complexity- O(N^2)
//stable algorithm 
public class insertionSort {
public static void main(String[] args) {
    int [] intArray={20,35,-15,7,55,1, -22};
// zero index position is in sorted position 
// the unsorted portion start from 1 and we travase and insert no. at their palce
    for( int firstUnsortedIndex=1; firstUnsortedIndex< intArray.length; firstUnsortedIndex++){
        int newElement=intArray[firstUnsortedIndex];
        int i;  
        
        for(i= firstUnsortedIndex; i>0 && intArray[i-1]> newElement; i-- ){
            intArray[i]= intArray[i-1];
        }

        intArray[i]= newElement;
    }



 for (int i; i< intArray.length; i++){
     System.out.println(intArray[i]);
 }
}   
}
