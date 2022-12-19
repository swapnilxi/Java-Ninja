import java.io.File;
//import java.io.FileWriter;
import java.util.Scanner;

public class javaFileHandling {
    public static void main(String[] args) {
        /* File myfile= new File("swapnil.txt");
       //code to create a new file
        try {
            myfile.createNewFile(); 
        } catch (Exception e) {
            System.out.println("unanble to create this File");
            e.printStackTrace();
        }   
        //code to write a new file
        try {
            FileWriter myfileWriter= new FileWriter("swapnil.txt");
            myfileWriter.write("this is filenamed swapnil, created using java");
            myfileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        File myfile= new File("swapnil.txt");
        try {
            Scanner sc= new Scanner(myfile);
            while(sc.hasNextLine()){
                String Line= sc.nextLine();
                System.out.println(Line);
            }
            sc.close();
        } catch (Exception e) {
           e.printStackTrace();
           System.out.println("file cannot take inputs");
        }
           */
    // deleting the file
    File myFile= new File("swapnil.txt");
    if(myFile.delete()){
        System.out.println(" file deletd"+ myFile.getName());
    }
    else{
    System.out.println("unable to delete the file");
}
    }
}
