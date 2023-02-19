package JavaOOPs.Kunal_Kushwaha.3Inheritance;

public class Box {
    int l=0;
    int w=0;
    int h=0;
    Box(){
        this.l=-1;
        this.w=-1;
        this.h=-1;
    }
    public Box( int l,  int w,  int h){
        this.l=l;
        this.w=w;
        this.h=h;
    }

    //cube
    public Box(int side){
        this.l=side;
        this.w=side;
        this.h=side;
    }
    public Box(Box box){
        this.l=box.l;
        this.w=box.w;
        this.h=box.h;
    }
    public void information(){
        System.out.println("running the box");
    }
    class BoxWeight extends Box{
        int boxWeight=0;
        public BoxWeight( int weight){
            this.boxWeight= weight;
        }

    }
}
