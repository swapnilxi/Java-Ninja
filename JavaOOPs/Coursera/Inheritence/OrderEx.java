package JavaOOPs.Coursera.Inheritence;

public class OrderEx {
    public class Person 
{
    private String name;
    public Person( String n ) {
        this.name = n;
        System.out.print("#1 ");
    }
}
public class Student extends Person {
    public Student () {
        this("Student"); 
        System.out.print("#2 ");
    }
    public Student( String n ) 
    { 
        super(n);
        System.out.print("#3 ");
    }
}
public static void main(String[] args) {
    Student s = new Student();
}
    
}
