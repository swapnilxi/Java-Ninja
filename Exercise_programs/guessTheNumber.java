
import java.util.Random;
import java.util.Scanner;

class game{
    public int number;
    public int inputNumber;
    public int noofGuesses;

public void setnog(int n){
    this.noofGuesses=n;
     }
public int getnog(){
    return noofGuesses;
}
 game(){
    Random rando= new Random();
    this.number= rando.nextInt(100);
  
}

void takeUserInput(){
    System.out.println("Input the Gusssed number: " );
       Scanner sc= new Scanner(System.in);
       inputNumber= sc.nextInt();
      
    }
    boolean isCorrectNumber(){
        noofGuesses++;
        if (inputNumber==number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts \n", number, noofGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too low...");
        }
        else if(inputNumber>number){
            System.out.println("Too high...");
        }
        return false;
    }

}

public class guessTheNumber {
    public static void main(String[] args) {
        game g= new game();
        boolean b= false;
        while(!b){
        g.takeUserInput();
        b= g.isCorrectNumber();
        System.out.println(b);
    }
  
    }
    
}
