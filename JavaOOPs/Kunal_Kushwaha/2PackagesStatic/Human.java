package JavaOOPs.Kunal_Kushwaha;

public class Human {
    int age ;
    String name;
    int salary;
    boolean married;
   static long population;
    public Human(int age, String name, int salary, boolean married ) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        population += 1;
    }

}
