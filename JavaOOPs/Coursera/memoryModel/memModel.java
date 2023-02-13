package JavaOOPs.Coursera.memoryModel;



public class memModel {
    
    public static void main(String[] args) {
        SimpleLocation ucsd= new SimpleLocation(32.9,-117.2);
        SimpleLocation kumamoto= new SimpleLocation(32.0,130.0);
        ucsd=kumamoto;
        kumamoto=ucsd;//does nothing
        System.out.println(ucsd.latitude);
        
    }
   

    
}
