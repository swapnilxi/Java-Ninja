
class Employee{
    int id;
    String name;
    int salary;
    public void getDetails(){
        System.out.println("Id of "+ name +"is: " + id);
        System.out.println("Full Name: "+ name);
    }   

    public int getSalary(){
        return salary;
    }
}
public class javaClass {
    public static void main(String[] args){
//Creating a custom class 
System.out.println("Creating the new object ");
Employee Swapnil = new Employee(); //instantiating the new employee object  
Employee Ayush= new Employee(); 
//setting attributes
Swapnil.id= 1;
Swapnil.name= "Swapnil Gupta";
Swapnil.salary= 2100000;
Ayush.id= 2;
Ayush.name= "Ayush Gupta";

Swapnil.getDetails();
Ayush.getDetails();

//multiple methods can be called
int salary= Swapnil.getSalary();
System.out.println("Salary of "+ Swapnil.name +" is " +salary);
 

//System.out.println("id: " +Swapnil.id);
//System.out.println("name:" + Swapnil.name);
    }
}
