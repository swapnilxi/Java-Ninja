package JavaOOPs.Kunal_Kushwaha;
class testOUT{
    static String name;
    public testOUT (String name){
        testOUT.name=name;
    }
}

public class InnerClass {
    // it  will not depend on the object of the above class
    public static class testIN{
        String name;
        public testIN (String name){
            this.name=name;
        }
    }
    public static void main(String[] args) {
     testIN ai= new testIN("kunal");
     testIN bi= new testIN("swapnil");
     System.out.println(ai.name);
     System.out.println(bi.name);

     testOUT ao= new testOUT("kunal");
     testOUT bo= new testOUT("swapnil");
     System.out.println(ao.name);
     System.out.println(bo.name);
     //both name are same

    }
    
}
