import java.util.Scanner;
public class javaCondition {
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     int age=57; //default entry
     System.out.println("Please Enter your age to check Experiece level:");
      age= sc.nextInt(); //input your age 
     if (age>56){
         System.out.println("You are  Experienced!");
     }
     else if(age>46){
         System.out.println("You are semi experienced!");
         
     }
     else if(age>36){
         System.out.println("You have some experienced!");
         
     }
     else{
         System.out.println("you are not experienced!");
     }
     
     if (age>18){
         System.out.println("(this is your experience level)");
     }
     else{
         System.out.println("you need more experience to check the level");
     }
     
    }
}
    

