class cellphone {
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }      
    public void callFriend(){
        System.out.println("calling Ayush...");
    }
}

class square{
    int side;
    public void area(){
        System.out.println("area of square is: " +side*side);
        }
    public int cperimeter(){
        return 4*side;   
         }
    public void perimeter(){
        int p= cperimeter();
        System.out.println("the perimeter of square :"+p);
        }
}
// use  of getter and setter :access modifier
class myEmployee{
    private String name;
    private int age;

    public void setName(String n){
        name=n;
    }
    public void setAge(int i){
        age= i;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    
}

// consturctor employeee class
class consEmployee{
    private String cname;
    private int cage;
    private String cname1;

    // public void setcName(String cn){
    //     cname=cn;
    // }
    // public void setcAge(int ci){
    //     cage= ci;
    // }
    public String getcName(){return cname;}
    public int getcAge(){return cage;}
    public consEmployee(String myName, int myAge){
        cname= myName;
        cage= myAge;
    }// method inside the class 
    public consEmployee(String myName1){
        cname1 = myName1; 
    }
 public String getCname1(){
     return cname1;
 }
}  



public class javaObject {
public static void main(String[] args){
 cellphone phoneState= new cellphone();
 phoneState.callFriend();
 phoneState.vibrate();
 phoneState.ring();

//square object 
System.out.println("--Area and Perimeter of a square--");
square sq= new square();
sq.side= 5;
sq.area();
sq.perimeter();

// Receiving name and age of an Employee - object
myEmployee E= new myEmployee();
E.setName("swapnil");
E.setAge(23);
System.out.println("name and age of Employee: "+E.getName()+" "+E.getAge());    

// getting Employee name nd age using constructor
consEmployee cE = new consEmployee("Cswapnil", 23);
// cE.setcName("ayush");
// cE.setcAge(14);
System.out.println(cE.getcName());
System.out.println(cE.getcAge());

System.out.println("Constructor Overloading");
consEmployee cE1= new consEmployee("anupam");
System.out.println(cE1.getCname1());// costructor overloading 



}
}