

//extending thread class
//implemneting runnable interface 


//extending the thread class 
class myThread extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i< 10){
            System.out.println("---------------------");
            System.out.println("Thread One is Running");
            i++;
        }
    }
}
class myThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i< 10){
        System.out.println("---------------------");
        System.out.println("Thread Two is running");
        i++;
    }
    }
}
// extending the runnable class
class myThreadRunnable1 implements Runnable{
    public void run(){
        int i=0;
        while(i<10){
        System.out.println("this is runnable thread 1");
    }
    }
}
class myThreadRunnable2 implements Runnable{
    public void run(){
        int i=0;
        while(i<10){
        System.out.println("this is runnable thread 2");
        }
    }

}






public class javaMultithreding {
public static void main(String[] args) {
    myThread mT1= new myThread();
    myThread2 mT2= new myThread2();
    mT1.start();
    mT2.start(); //start command is from thredding class
    //System.out.println("by run method");
    //mt.run(); //throws error
    
    myThreadRunnable1 mtR1= new myThreadRunnable1();
    //thread runnable has to implement in the thread object
    Thread tR1= new Thread(mtR1); 
    myThreadRunnable2 mtR2= new myThreadRunnable2();
    Thread tR2= new Thread(mtR2);
    tR1.start();
    tR2.start(); 
}    
}
