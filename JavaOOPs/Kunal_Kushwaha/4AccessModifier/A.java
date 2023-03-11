public class A{
    protected  int num;
    String name;
    int[] arr;

    private int getNum(){
        return num;
    }
    public  void setNum(){
        this.num= num;
    }
    public  A(int num,String Name ){
        this.num=num;
        this.name=name;
        this.arr=new int[num];
    }
}