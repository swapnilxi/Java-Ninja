package JavaOOPs.Coursera.memoryModel;

public class memModel2 {
    public static void main(String[] args){
        double lat=-15.5;
        SimpleLocation lima=new SimpleLocation(lat, 77.0);
        lat=12.2;//no change 15.5
        //lima.latitude=12.2; gives 12.2
        System.out.println(lima.latitude);
    }
    
}
