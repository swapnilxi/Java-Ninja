package JavaOOPs.Kunal_Kushwaha.3Inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Box box1= new Box();
        Box box2= new Box(22, 23, 24);
        Box box3 = new Box(box2);
        Box box4= new BoxWeight();
        System.out.println("length" + box1.l+ "width" + box1.w+"height"+ box1.h);
        System.out.println("weight of the box"+ box4.boxWeight);
    }
    
}
