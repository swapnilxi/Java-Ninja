abstract class parent1{
    public parent1(){
        System.out.println("I am the constructor of parent");
    }
    public void hello(){
        System.out.println("Hello Everyone!");
    }
    abstract public void greet();
    abstract public void greet1();
}// an abstract class, used as reference 

class child1 extends parent1{
 @Override
 public void greet(){
     System.out.println("Good Morning!");
        }
@Override
public void greet1() {
 System.out.println("Good Afternoon!");
        }
} // child class by overriding 

abstract class child2 extends parent1{
    public void ask(){
        System.err.println("I am good, How are you!?");
    }
} //only abstract class can be created from abstract, with differnt method or else you have to create the saem abstract class.



public class javaAbstract {
    public static void main(String[] args) {
        //parent1 p = new parent(); // throws an error
        child1 c1 = new child1();
        c1.greet();
        // child2 c2 = new child2 c2(); --not possible
       
        
    }
    
}
