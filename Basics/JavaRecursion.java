//import java.util.Scanner;
public class JavaRecursion {
public static void main(String[] args) {
//fibbbonaci series
int n =3;
System.out.println(fib(n)); 
//   fibbonaccinumber fibb= new fibb(4);
//  System.out.println( fibb.fib); 

            //check Sorted 
int[] input={1,2,3,4,5};
System.out.println(checkSorted(input));
}

public static int fib(int n){
        if (n==0 || n==1){
       return n;
   }
else{return fib(n-1)+fib(n-2);}
}
 //Array Recursion -check sorted 
 public static boolean checkSorted(int input[]){
     if(input.length<= 1){
        return true;
     }
int[] smallInput=new int[input.length-1];
for(int i=1; i<input.length; i++){
    smallInput[i-1]=input[i];
}
boolean smallans=checkSorted(smallInput);
if(!smallans){
    return false;
}

if(input[0]> input[1]){
 return false;
}
else if(input[0]< input[1]){
    return true;
}
else {
    return false;
}
     
 }
}

// public static int xpowN(int x){
    // Scanner sc= new Scanner(System.in);
    // int N=sc.nextInt();
// 
    // if(X<0|| x<1){
        // return;
    // }


