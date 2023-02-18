package JavaOOPs.Coursera.Inheritence;

public class Inheritance2 {

     class Person {
        public String name;
        public Person (String n){
            super();
            this.name=n;
            System.out.println("#1");
        }
    }
  public class Student1 extends Person{
    public Student1(){
        System.out.println("default student name ");
        System.out.println("#2");
       }
        public Student1(String nameStudent){
        // super(); //wont work as name is private
        // this.name=nameStudent; 
        super(nameStudent);
        System.out.println("#3");
        }
      

    }
    public static void main(String[] args) {
    Student1 ravi= new Student1();
    //  Person swapnil= new Student1("swapnil");
     System.out.println(ravi.name);
        
        
    }
    
}
