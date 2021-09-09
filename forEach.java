/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class forEach
{
    public static void main(String[] args){
        int [] marks={98,45, 79, 99,80};
        System.out.println(marks.length);
        String [] students= {"ravi", "mohan", "swapnil "};
        
        // displaying the array
        
        for(int element : marks){
            System.out.println(element);
        };
        for(String i: students){
            System.out.println(i);
        }
        // element literal can be named anything 
        
    }
}