//import java.util.ArrayList;


class myGeneric<T1, T2>{
    int val;
    private T1 t1;
    private T2 t2;

public myGeneric(int val, T1 t1, T2 t2) {
        this.val=val;
        this.t1=t1;
        this.t2=t2;
    }
 public int getVal(){
        return val;
    }
public void setVal(int val){
        this.val=val;
    }
public T1 getT1(){
        return t1;
    }
public void setT1(T1 t1){
    this.t1=t1;
    }
public T2 getT2(){
        return t2;
    }
    public void setT2(T2 t2){
        this.t2=t2;
    }

}



public class javaGenerics {
    public static void main(String[] args) {
     /*  ArrayList<Integer> arraylist= new ArrayList();
       //arraylist.add("string1");
       arraylist.add(54);
       arraylist.add(23);
       arraylist.add(56);
       //arraylist.add("string2"); -- not accepted
       //int a= (int)arraylist.get(2);
       int a= arraylist.get(2);
    System.out.println(a);
    */
    myGeneric<String, Integer> g1 = new myGeneric(23, "MyString is my string", 45);
    String str = g1.getT1();
    Integer int1= g1.getT2();
    System.out.println(str + int1);    
}
    
}