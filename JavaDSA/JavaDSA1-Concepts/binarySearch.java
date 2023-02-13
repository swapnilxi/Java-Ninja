package JavaDSA1;
public class binarySearch{
public static void main(String[] args) {
    int[] intArray={-22,55,-15,1,7,20,35,55};
    System.out.println(iterativeBinarySearch(intArray,-15));
    System.out.println(iterativeBinarySearch(intArray, 2));


    System.out.println("recursive binary search of 55:"+ recursiveBinarySearch(intArray, 55));
    System.out.println("recursive binary search of 2:"+ recursiveBinarySearch(intArray, 2));
    
    
}
public static int iterativeBinarySearch(int[] input ,int value){

     int start =0;
     int end= input.length;

     while(start< end){
         int midpoint = (start+ end)/2;
         System.out.println("midpoint is "+ midpoint);
         if(input[midpoint]==value){
             return midpoint; 
         }
         else if (input[midpoint]<value){
             start=midpoint + 1;
         }

         else {
             end= midpoint;
         }
     }
     return -1;
}

public static int recursiveBinarySearch(int[] input ,int value ) {
    return recursiveBinarySearch(input, 0, input.length, value);
}
public static int recursiveBinarySearch(int[] input , int start, int end, int value) {
if(start>=end){
return -1; 
}
int midpoint =(start+end)/2;
System.out.println("midpoint:"+ midpoint);

if(input[midpoint]==value){
    return midpoint;
}
else if(input[midpoint]<value){
    return recursiveBinarySearch(input, midpoint+1, end, value);
}
else{
   return recursiveBinarySearch(input, start, midpoint, value);
}

}
}