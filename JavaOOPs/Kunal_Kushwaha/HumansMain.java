package JavaOOPs.Kunal_Kushwaha;

import java.security.MessageDigest;

public class HumansMain {
    public static void main(String[] args) {
        Human swapnil =new Human(21, "swapnil", 90000, false);
        Human kunal =new Human(50, "kunal", 80000, true);
        System.out.println("swapnil.population: " + swapnil.population );
        System.out.println("kunal.population: " + kunal.population );
        Human.message();

        HumansMain funn= new HumansMain();
        funn.fun2();

        //singleTon
        private singleTon instance;

    }
    //static method- nonstatic 
    static void fun(){
        //it won't work
       // HumansMain.greeting();

        //to work 
        HumansMain obj= new HumansMain();
        obj.greeting();
    }
    //non static fun-static fun
    void fun2(){
        greeting();
        //this will later called by main
        //so no issue

    }


    //not static , belong to an object
    void greeting(){
        System.out.println("Hello I am non static greeting function");
    }
    
}
