package JavaOOPs.Kunal_Kushwaha;
public class ObjectLearn{
    static class Student{
        int rollno= 11;//always show 23 
        String name=  "1_swapnil";
        float marks=11f;
        //constructor
        public Student(int rollno, String name, float marks) {
            this.rollno=rollno;
            this.name= name;
            this.marks= marks;
        }
        // public Student() {
        // this.rollno=rollno;
        // this.name= name;
        // this.marks= marks;
        // }   
        public Student(){
            //internally : new Student(13, "person", 84f)
            this(1, "first", 90f);
        }
        
        public Student(Student insideStudent){
            this.rollno= insideStudent.rollno;
            this.name= "insideStudent";
            this.marks= insideStudent.marks;
            System.out.println("insideStudent.name"+ insideStudent.name);
        }  
    }
     public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student(2, "2_rahul", 88f);
        Student newStudent= new Student(25, "3_ravi", 89f);
        Student insideStudent= new Student("insideStudent");
        
        System.out.println("student1.name=" + student1.name);
        System.out.println("student2.name="+ student2.name);
        System.out.println("newStudent.name="+ newStudent.name);

        //an object of class made via this keyword
        Student first= new Student(); 
        System.out.println("first.name="+ first.name);

    }
}