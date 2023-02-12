@FunctionalInterface
interface IdemoAno{
    public void method1();
   // public void method2();
}
//  class anonyDemo implements interface1{
//     public void display(){
//         System.out.println("the data to display");
//     }
//     @override
//     public void method1(){
//         System.out.println("I am method 1");
//     }
//     public void method2(){
//         System.out.println("I am method 2");
// }
//}

public  class javaLambda {
    public static void main(String[] args) {
        // anonyDemo obj = new anonyDemo();
        // obj.method1();
        // obj.method2();


  /*      // anonymous object Class//
    IdemoAno obj = new IdemoAno(){
//object and class created without the name 
        @Override
        public void method1() {
            System.out.println("i am method 1");
            
        }

        @Override
        public void method2() {
            System.out.println("I am method 2");
        }
     
    };
  
    obj.method1(); 
    obj.method1(); 
 */  // no need to make a different this class name without the name will work
                                 //Lambda Expression//                   
 IdemoAno obj= ()->{
 System.out.println(" I am method one from the lambda");
};
obj.method1();

}
    
   
}
