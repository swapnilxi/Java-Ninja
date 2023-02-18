package JavaOOPs.Coursera.Inheritence;

public class Inheritance {
    public class Person {
        private String name;
        public String getName() {return name;}
    }
    public class Student extends Person {
        private int id;
        public int getID() {return id;}
    }
    public class Faculty extends Person {
        private String id;
        public String getID() {return id;}
    }
    public static void main(String[] args) {
        Student s = new Student();
        Person p = new Person();
        Person q = new Person();
        Faculty f = new Faculty();
        Object o = new Faculty();
        String n = s.getName();
        p=s;
        int m=p.getID();
        // int m = ((Student)p).getID();
        // f=q;
        o=s;
        System.out.println("this is inheritance file");
        System.out.println("n:"+n+ "m:"+ m);
    }
}