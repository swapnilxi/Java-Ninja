public class tryCatch{
    static class Student{
        private static String name= "mohit";
        private int age= 20;
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
      public static String getName(){
        return name;
      }
      public static String setName(String name){
        this.name= name;
      }
    
    }

        public static void main(String[] args) {
            Student s1=  new Student("ravi", 20);
            System.out.println(s1.getName());
        }

   
}

