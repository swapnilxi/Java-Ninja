public class ObjSubclass extends Object {
    public ObjSubclass(int num){
        this.num=num;
    }
    //@Override
    public int hashCode(){
        return super.hashcode();
    }
    //@Override
    public boolean equals(Object obj){
        return super.equals(obj);
    }
    protected Object clone() throws CloneNotSupportedException{
        return  super.clone();
    }

    public static void main(String[] args) {
        ObjectSubclass obj1= new ObjectSubclass(34);
        ObjectSubclass obj2= new ObjectSubclass(34);
        ObjectSubclass obj= obj1;
        System.out.println(obj1.hascode);//some random hashed  value
        System.out.println(obj2.hascode);//another random hased value
        System.out.println(obj.hascode);//same as obj1

        System.out.println(obj1 instanceof  Object );
        System.out.println(obj1.getClass().getName);
    }

}