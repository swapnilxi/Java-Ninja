//Relatively better than bubble sort in most of the cases
//time complexity- O(N^2)
//unstable sort
package JavaDSA;




public class selectionSort {
public static void main(String[] args) {
    int[] intarray={20,35,-15,7,55,1,-22};
    for(int lastUsortedindex=intarray.length-1; lastUsortedindex>0; lastUsortedindex--){
        int largest=0;
        for (int i=1; i<=lastUsortedindex; i++){
            //in bubble sort we need index n-1, but here we will need all the index 
            if (intarray[i]> intarray[largest]){
                largest=i;
            }
        }
        swap(intarray, largest, lastUsortedindex);  
    }
   display(intarray);
}   

public static void display(int[]array){
    for (int i: array){
        System.out.print(" "+i+" ");
    }

}
public static void swap(int [] array,int i, int j){
    int temp;             
    temp =array[i];
    array[i]=array[j];
    array[j]= temp;    
}
}