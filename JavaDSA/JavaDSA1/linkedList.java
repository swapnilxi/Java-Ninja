package JavaDSA1;
class Employee {

    private String firstName;
    private String lastName;
    private int id;

    public Employee(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != employee.id) return false;
        if (!firstName.equals(employee.firstName)) return false;
        return lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + id;
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }

}

class EmployeeNode{
    private Employee employee;
    private EmployeeNode next;
    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }
public String toString(){
    return employee.toString();
}


}
class EmployeeLinkedList{
    private EmployeeNode head;
    private int size;

    public void addTofront(Employee employee){
        EmployeeNode node=new EmployeeNode(employee);
        node.setNext(head);
        head=node;
        size++;
    }
    
    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return head==null;
    }
public void printList(){
    EmployeeNode current= head;
    System.out.println("HEAD ->");
    while (current !=null){
        System.out.println(current);
        System.out.println("->");
        current= current.getNext();
    }
    System.out.println("null");
}
    }


public class linkedList {
    public static void main(String[] args) {
       
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeLinkedList list=new EmployeeLinkedList();
        list.addTofront(janeJones);
        list.addTofront(johnDoe);
        list.addTofront(marySmith);
        list.addTofront(mikeWilson);
        
       list.printList();
       System.out.println(list.getSize());
       System.out.println(list.isEmpty()); //isnull
       list.removeFromFront();
       System.out.println( list.getSize());
       list.printList();


    }
    
}
