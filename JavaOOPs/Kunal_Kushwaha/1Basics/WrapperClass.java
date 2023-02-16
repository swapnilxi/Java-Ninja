package JavaOOPs.Kunal_Kushwaha;

public class WrapperClass {
    public static void main(String[] args) {
    int a=10;
    int b=20;
    //Integer num= new Integer(num);
    Integer num=10;
    Integer A=5;
    Integer B=15; 
    //do not work, because a and b are primitive, pass by Value
    swap(a,b);
    //this will change original intuitvely but it is Integer are final so it //will not swap that value too, objects pass by reference
    swapObj(A, B);
   

    System.out.println("no swap in primitives"+ " a:"+ a+ " b:" +b);
    //as INTEGER B is final, even by reference
    System.out.println("no swap in objects"+ " A in main:"+ A+ " B in main:" +B);
    }

private static void swap(int a, int b) {
    int temp=a;
    a=b;
    b=temp;
    System.out.println("swapping inside function only"+ " a:"+ a+ " b:" +b);
    }

    private static void swapObj(Integer A, Integer B) {
        int temp=A;
        A=B;
        B=temp;
        System.out.println("swapping both places"+ " A in Func:"+ A+ " B in Func:" +B);
        }
    
}
