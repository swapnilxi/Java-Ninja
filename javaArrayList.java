import java.util.*;

public class javaArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> Li1= new ArrayList<>();
        ArrayList<Integer> Li2= new ArrayList<>();
        
        Li1.add(5);
        Li1.add(6);
        Li1.add(8);
        Li1.add(3);
        Li1.add(0,1);

        Li2.add(10);
        Li2.add(13);
        // Li2.add(15,10);//throwing error
        Li2.add(14);

        Li1.addAll(0, Li2); //0 is index

        for(int i=0; i< Li1.size(); i++){
            System.out.println(Li1.get(i));
        }
        System.out.println("is there 8 in the ArrayList: "+ Li1.contains(8) + " & index of 8 is: " + Li1.indexOf(8));
        System.out.println("Updating 8 with 11");
        Li1.set(6, 11);
        for(int i=0; i< Li1.size(); i++){
            System.out.println(Li1.get(i));
        }
        // for(int i=0; i< Li1.size(); i++){
        //     System.out.println(Li2.get(i));
        // }



    }
    
}
