
public class JavaArray {
public static void main( String[] args){
    //int scores[]= new int[]{90,70, 80,100}; // do not specify array size here as 
    //it would throw compilation error
// Student student1 = new Student();//making a class
// student1.id ="1";
// student1.name="swapnil";
// student1.gender="male";
// student1.phone="9918726383";
// student1.International=true;
// student1.compute();
class Student{
    int id;
    String name;
} // creating class and declaring below 

    int[] scores= {90,80, 70, 100};

System.out.println("first term: " + scores[0]);
System.out.println("Length of the array: " + scores.length);

//array from object 
// Student[] students= new Student[];
Student[] students= new Student[] {new Student(), new Student(), new Student()};
students[0]= new Student(); 
students[1]= new Student(); 
students[2]= new Student(); 
students[0].id=1; 
students[0].name= "raj";
students[1].id=2; 
students[1].name="amit";
students[2].id=3; 
students[2].name="ayush";
System.out.println("name of first student: " +students[0].id+" "+students[0].name);
System.out.println("name of first student: " +students[1].id+" "+students[1].name);
System.out.println("name of first student: " +students[2].id+" "+students[2].name);

}    
}
