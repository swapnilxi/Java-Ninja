package JavaDSA1;

public class quickSort {
    public static void main(String[] args) {
        int[] intArray={20, 35,-15, 7,55, 1 , -22};
        quickSortmethod(intArray, 0, intArray.length);
        
        System.out.println("the array after sorting is:" );
        for (int e : intArray) {
            System.out.print(e+ " ");
        }
    }


public static void quickSortmethod(int[] input, int start, int end ){
if (end-start<=1){
    return;
}
int pivotIndex= partition(input, start, end);//it will return position of the pivot 
quickSortmethod(input, start, pivotIndex);
quickSortmethod(input, pivotIndex+1, end);
//insted of mid in merge, we will take pivotIndex here
}
public static int partition(int[] input, int start, int end){
    // we will take first element as the pivot
int pivot= input[start];
int i= start;
int j= end;
while(i<j){
    //empty loop body
     while(i<j && input[--j]>= pivot);
     if (i<j){
         input[i]=input[j];
     }
    //empty loop body
    while(i<j && input[++i]<=pivot);
    if(i<j){
    input[j]= input[i];
     }
    }
input[j]= pivot;
return j;

}
}




