package JavaDSA1;



public class javaHashtable {
     public static void main(String[] args) {
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
        class SimpleHashtable {
            private Employee[] hashtable;
        
            public SimpleHashtable() {
                hashtable = new Employee[10];
            }
        
            public void put(String key, Employee employee) {
                int hashedKey = hashKey(key);
                if (hashtable[hashedKey] != null) {
                    System.out.println("Sorry, there's already an employee at position " + hashedKey);
                }
                else {
                    hashtable[hashedKey] = employee;
                }
            }
        
            public Employee get(String key) {
                int hashedKey = hashKey(key);
                return hashtable[hashedKey];
            }
        
            private int hashKey(String key) {
                return key.length() % hashtable.length;
            }
        
            public void printHashtable() {
                for (int i = 0; i < hashtable.length; i++) {
                    System.out.println(hashtable[i]);
                }
            }
        }
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
       

        SimpleHashtable ht = new SimpleHashtable();
        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", mikeWilson);
        ht.put("Smith", marySmith);

        ht.printHashtable();

        //System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));


    }
    
}
