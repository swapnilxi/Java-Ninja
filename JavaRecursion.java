// class fibbonccinumber{


// }

public class JavaRecursion {
    public static int fib(int n){
         if (n==0 || n==1){
        return n;
    }
    else{  return fib(n-1)+fib(n-2);}
}

    public static void main(String[] args) {
       

int n =3;
System.out.println(fib(n)); 

    //   fibbonccinumber fibb= new fibb(4);
    //  System.out.println( fibb.fib);

        
    }
}
