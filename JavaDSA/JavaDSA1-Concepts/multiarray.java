package JavaDSA1;
import java.util.Scanner;;

public class multiarray {
    public static void main(String[] args) {    
        int[][] arr= takeInput(); // two dimensional array
        display(arr);
        //int[][] arr= {{1,23,24}, {1,2 ,44}, {4,56,76}};
       
        }
    
 private static int[][] takeInput(){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows= s.nextInt();
        int[][] arr= new int[rows][];
      
    
        for (int row=0; row< rows; row++){
            System.out.println("enter the number of columns for row : "+ row);
            int cols= s.nextInt();
            arr [row]= new int [cols];
    
            for (int col=0;col<cols;col++){
                System.out.println("enter the value or row "+ row + " col " + col);
                arr[row][col]=s.nextInt();
            }
        }
    return arr; 
   
    }
   
     
 public static void display(int[][] arr){
        for(int row=0; row< arr.length; row++){
            for(int col=0; col< arr[row].length; col++ ){
                System.out.println(arr[row][col]+" ");
            }
            System.out.println();
        }
   
    }   
    }

    