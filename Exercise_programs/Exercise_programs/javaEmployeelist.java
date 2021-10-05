package Exercise_programs;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
class employees{
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + id;
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        employees other = (employees) obj;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        if (id != other.id)
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        return true;
    }

    private String firstName;
    private String lastName;
    private int id;
//constructor 
    public employees(String firstName, String lastName, int id){
        this.firstName= firstName;
        this.lastName= lastName;
        this.id=id;
    }

//getterAndSetter
    public String getFirstName() {
        return firstName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
//tostring method
@Override
public
String  toString(){
    return "employees{"+ "firstName="+firstName+ 
    "\'"+ "lastName="+lastName + "\'"+
    "id="+ id;
}
}

public class javaEmployeelist {
    public static void main(String[] args) {
        List<employees> employeeList = new ArrayList<>();
        employeeList.add(new employees("swapnil", "gupta", 22));
        employeeList.add(new employees("vikash", "kumar", 23));

        employeeList.forEach(employees->  System.out.println(employees ) );
        System.out.println(employeeList.get(0));
        System.out.println(employeeList.isEmpty());
        
        //setting the index
        employeeList.set(1, new employees("jhon", "adams", 23));
        System.out.println("updated list");
        System.out.println(employeeList.get(1));
        System.out.println(employeeList.size());
    
//list to array
 employees[] employeeArray= employeeList.toArray(new employees[employeeList.size()]);

 for(employees employee : employeeArray){
     System.out.println(employee);
 }
    System.out.println(employeeList.contains(new employees("mary", "jane",  26)));

}

    
}
