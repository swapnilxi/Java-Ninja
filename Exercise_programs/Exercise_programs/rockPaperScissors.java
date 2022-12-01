package Exercise_programs;

import java.util.Scanner;

import java.util.Random;

public class rockPaperScissors {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please Enter a number: \n 0 for Rock | 1 for Paper | 2 for Scissors");
        int userInput= sc.nextInt();
        System.out.println("input of user: "+ userInput);

        Random random= new Random();
        int computerInput= random.nextInt(3);
        // Alternatively, you can use this formula
        //Math.random() * (max - min + 1) + min ,a

        switch (computerInput) {
            case 0:
            System.out.println("Computer output:Rock"); 
            break;
            case 1:
            System.out.println("Computer output:paper");
            break;
            case 2:
            System.out.println("Computer output:Scissors");
            break;
        }

        if(userInput== computerInput){
            System.out.println("This is a draw");
        }
        else if(userInput==0 && computerInput==2 || userInput==1 && computerInput==0 || userInput==2 && computerInput==1 ){
            System.out.println("you win!");
        }
        else{
            System.out.println("computer won!");
        }
        sc.close();


    }
}
