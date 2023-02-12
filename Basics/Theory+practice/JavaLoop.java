import java.util.Scanner;

public class JavaLoop {
    
public static void main(String args[]) 
        {
        //printing Stars 
              int no=4;
            for (int i=no;  i>0 ; i--){
                for (int j=0; j<i; j++){
         System.out.print("*");
                }
                 System.out.print("\n");
            }
//while loop : song on the repeat
boolean isOnRepeat= true;
  while(isOnRepeat){
    System.out.println("The Song is playing in the Loop");
    System.out.println("to exit out of the loop, write 'exit' ");
    Scanner sc= new Scanner(System.in);
    String userInput= sc.next(); //takes one word as input
    if(userInput.equals("exit")){
      isOnRepeat= false;
    }
  
  }
 System.out.println(" Playing next song");
 



        }
    }
    

