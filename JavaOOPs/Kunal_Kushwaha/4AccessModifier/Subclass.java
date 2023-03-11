public class Subclass extends A{
    public  Subclass(int num, String name){
        super(num, name);
    }
    public class SubSubClass extends A{
        public  SubSubClass(int num, String name){
            super(num, name);
        }

    public static void main(String[] args) {
        Subclass obj= new Subclass(20,"ravi");
        System.out.println(obj.num);
        //Below will not work, in case of protected
        //as parent, A , has no idea about subclasses

        A objP=new A(100, "swapnil");

        System.out.println( objP.num);
    }
    public  SubClass2 extends A{
     public SubClass2(int num, String name){
        super(num, name);
            }
        public static void main(String[] args){
         Subclass2 obj= new Subclass2(23."swapnil");
            }
        }


}