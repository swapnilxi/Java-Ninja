package JavaDSA1;

public class mergeSort {
    public static void main(String[] args) {
        int[] intArray={1,22, -23, 25,27,35, 15};

        mergeSortMethod(intArray, 0, intArray.length);

        for(int i=0; i< intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

 public static void mergeSortMethod(int[] input, int start, int end){
    if(end- start <=1 ){
        return;
     } 
    
int mid = (start+end)/2;
 // left array sort 
mergeSortMethod(input, start, mid );
// right array sort 
mergeSortMethod(input, mid, end);
merge(input, start , mid ,end);
 }

 public static void merge(int[] input, int start, int mid, int end) {
     if(input[mid-1]<= input[mid]){
 return;
     }// this means left array is aleady sorted with right side array
     int i= start;
     int j= mid;
     int tempIndex=0;

     int[] temp = new int[end -start];
while (i< mid && j< end){
    temp[tempIndex++]= input[i]<=input[j]? i++ : input[j++] ;
}
//System.arraycopy(source_arr[], sourcePos[], destArr[], dest pos, length)
System.arraycopy(input, i, input, start+tempIndex, mid -i );
System.arraycopy(temp, 0 , input, start, tempIndex);
System.out.println("-------------------------------------");
System.out.println("Temproray Array is: ");
for(int element: temp){
    System.out.println(element);
}
System.out.println("-------------------------------------");

 }
    }

   
    

   