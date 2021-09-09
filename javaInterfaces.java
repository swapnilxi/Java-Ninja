interface bycycle{
    int a=45;
    void applyBrakes(int decrement);
    void speedUp(int increment);
}
interface turnBycycle{
    void turnLeft();
    void turnRight();
}
// multiple interfaces can be implemented but cannot be extended 

class Avoncycle implements bycycle, turnBycycle{
    void ringBell(){
        System.out.println("ringing bell");
    }
    public void applyBrakes( int decrement){
        System.out.println("applying brakes");
    }

   public  void speedUp(int increment){
        System.out.println("speeding up");
    }
    public void turnLeft(){
        System.out.println("turning left");
    }
    public void turnRight(){
        System.out.println("turning right");
    }//we have to make methods public to get access
}

public class javaInterfaces {
    public static void main(String[] args) {
        Avoncycle Ac= new Avoncycle();
        Ac.applyBrakes(1);
        Ac.turnLeft();
        //Properties can be created in interfaces 
        System.out.println(Ac.a);
        //you cannot modify the properties in interfaces as they are final
        // Ac.a=454; //--error: The final field bycycle.a cannot be assigned
        // System.out.println(Ac.a);

        
    }
    
}
