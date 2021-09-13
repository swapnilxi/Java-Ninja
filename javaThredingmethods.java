class myNewThread1 extends Thread{
    public void run(){
        int i=0;
   for(i=0; i<=10;i++ ){
    System.out.println("good morning");
}
}
}
class  myNewThread2 extends Thread{
    public void run(){
    for(int i=0; i<10; i++ ){
        try {
            Thread.sleep(500);
        } 
        catch (Exception e) {
            System.out.println(e);
           
        }

    System.out.println("welcome");
}
}
}


public class javaThredingmethods {
 public static void main(String[] args) {
     myNewThread1 m1= new myNewThread1();
     m1.setPriority(6);
     myNewThread2 m2= new myNewThread2();
    //default priority is 5
     m1.start();
     //if we want to execute one function then other then we have to use join method
     //but if we simply use it, compiler throws warning to remove that we have to use exception handler
     //m1.join(); 
try{
    m1.join();
}
catch(Exception e){
    System.out.println(e);
}
     m2.start();
     System.out.println();
     int mp1= m1.getPriority();
     int mp2= m2.getPriority();
     System.out.println(Thread.currentThread().getState());//current thread
     System.out.println("the priority of m1 is "+ mp1 + " and default priority of m2 is "+ mp2 );
     System.out.println( m1.getState());
    

 }
    
}
