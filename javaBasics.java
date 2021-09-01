import java.util.Scanner; 
static float sum(double x, double y ){
    return (float) (x+y); //typecasting of method
}

class javaBasics1 {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner sc= new Scanner(System.in);
       System.out.println("Enter number 1");
      // int a = sc.nextInt();
       float a = sc.nextFloat();
       System.out.println("Enter number 2");
//       int b = sc.nextInt();
       float b = sc.nextFloat();

      // int sum = a +b;
       float sum = a +b;
       System.out.println("The sum of these numbers is");
       System.out.println(sum);
       System.out.println("Enter the boolean value:");
       boolean b1 = sc.hasNextInt();
       System.out.println(b1);

       //method  calling and typcasting
       double d= sum(3.0f, (float) 2.0);
       System.out.println(d);


    }

    public class javaBasics2{
        public static void main(String[] args){
        System.out.println("second class");}
    }
}
}

