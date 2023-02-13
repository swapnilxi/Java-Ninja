package JavaDSA1;

public class searchAlgorithm {
   public static void main(String[] args) {
    int[] intArray={20, 35, -15,7,55, 1, -22};
    
    System.out.println(linearSearch(intArray, 35));
    System.out.println(linearSearch(intArray, -22));
    System.out.println(linearSearch(intArray, 885));

     
    
   }


public static int linearSearch(int[] input, int value) {
    for(int i=0; i<input.length; i++){
        if(input[i]==value){
            return i;
        }
    }
    return -1;
    
}






    }

