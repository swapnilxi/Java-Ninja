package JavaOOPs.Kunal_Kushwaha;

public class finalKey {
    public static void main(String[] args) {
         final keywordClass kc= new keywordClass();
        kc.name="new name for keyword class";
        System.out.println(kc.name);


        
    }
    class keywordClass{
        final int num=10;
        String name;

        public keywordClass(String name){
            this.name= name;
        }
        protected void finalize() throws Throwable{
            System.out.println("object Destroyed");
        }


    }
    
}
