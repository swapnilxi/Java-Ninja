import java.util.Scanner; 





class javaBasics1 {
    static double sum(double x, double y){
        return x+y;
    }
 //we  cannot access varibable from static varible from non-static, but with static method it is possible. static-static
//other instances can access stuff from static, as static methods are global
    
   
  
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

       sc.close();

       
// method 
       
    //    method  calling and typcasting
       float d= (float) sum(3.0f, (float) 2.0);
       System.out.println(d);



    }


    public class javaBasics2{
        public  void main(String[] args){
        System.out.println("second class");}
    }
}



