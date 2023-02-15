package JavaOOPs.Coursera.memoryModel;

public class ArrayLocation {
    private double coords[];
    public ArrayLocation(double coords[]){
        this.coords=coords;
    }
    public static void main(String[] args) {
        double[] coords={5.0, 0.0};
        ArrayLocation accra= new ArrayLocation(coords);
        coords[0]=12;//updated in non primitive
        coords[1]=32;
        System.out.println(accra.coords[0]);
    }
}
