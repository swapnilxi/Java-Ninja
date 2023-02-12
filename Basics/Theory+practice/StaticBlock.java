import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;


public class StaticBlock {
public static int B,H;
public static boolean flag= false;
static{
    Scanner sc = new Scanner(System.in);
    B= sc.nextInt();
    H=sc.nextInt();
    if(B>0 && H>0){
        flag= true;
        System.out.println("The static block is excuted before main class, we can have as many static blocks");
    }
    else{
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
          
		}
      
	}//end of main

}//end of class


