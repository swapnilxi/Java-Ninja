import java.util.Scanner;

class negativeRadiusException extends Exception {
    
    public String toString() {
        return "radius cannot be negative";
    }

    public String getMessage() {
        return "radius cannot be negative";
}
}

public class exceptionHandaling {

public static double area(int r) throws negativeRadiusException{
    if(r<0){
        throw new negativeRadiusException();
    }
 double Result= Math.PI*r*r;
 return Result;
}

 public static int divide(int a, int b) throws ArithmeticException
    {
   int result=  a/b;
   return result;
 }



    public static void main(String[] args) {
        int[] marks= new int[3];
        marks[0]= 27;
        marks[1]=56;
        marks[2]= 33;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the array index for marks in sub 1: ");
int ind = sc.nextInt();
System.out.println("Enter the 2nd index for marks 2");
int ind2 = sc.nextInt();
System.out.println("Enter the number you want to divide mark 1  ");
int number =  sc.nextInt();
System.out.println("enter the number 2 from which you want to divide mark2");
int number2= sc.nextInt();
sc.close();



try{
    System.out.println("the nubmer in subject 1: " + marks[ind]);
    System.out.println("the number after division: " +  marks[ind]/number);
     try
     {
        System.out.println( "marks in subject2 after division" + divide(ind2, number2));
     }
     catch(ArrayIndexOutOfBoundsException e){
         System.out.println(" Cannot to show the marks at "+ind2 + e);
     }
}
catch(ArithmeticException e){
    System.out.println(e);
}
catch(ArrayIndexOutOfBoundsException e){
    System.out.println(e);
}

catch(Exception e){
    System.out.println("some exception occured, Reasons"+ e);
}
    }
}
