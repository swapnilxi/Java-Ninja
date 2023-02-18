package JavaOOPs.Kunal_Kushwaha;

public class StaticInt {
    //static intialisation
    static int a=4;
    static int b;
    static {
        System.out.println("I am in static block");
        b=a*5;
    }
    public static void main(String[] args) {
        StaticInt obj= new StaticInt();
        System.out.println("a= " +StaticInt.a +"  "+ " b= "+ StaticInt.b);
        StaticInt.b= StaticInt.b+2;
        System.out.println(" after adding 2 in "+ " b= "+ StaticInt.b);
        StaticInt obj2= new StaticInt();
        System.out.println("a= " +StaticInt.a +"  "+ " b again= "+ StaticInt.b);
        System.out.println("the static block executed once");

    }
    
}
