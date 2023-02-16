package JavaOOPs.Kunal_Kushwaha;

public class Human {
    int age ;
    String name;
    int salary;
    boolean married;

   static long population;
   static void message(){
    System.out.println("this is message to all humans");
    //cannot do
    //System.out.println(this.age);
   }




    public Human(int age, String name, int salary, boolean married ) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        //this.population +=1 //not conventional
        Human.population += 1;
        Human.message();
    }

}
