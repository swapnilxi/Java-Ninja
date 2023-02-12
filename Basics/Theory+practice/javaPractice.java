public class javaPractice {
        public static void main (String[] args){
            // Lower  case String 
            String name= "swapnil";
            name=name.toUpperCase();
            System.out.println(name);
            //name replacement 
            String bio="Hi! this is <|Swapnil Gupta|>";
            bio= bio.replace("<|Swapnil Gupta|>","Ayush");
            System.out.println(bio);
            //space finder
            String space="This will show multiple spaces if  there is ";
            System.out.println(space.indexOf("  "));
            System.out.println(space.indexOf("   "));
            //Foramatting using escape
            String letter="She said,\n \t you are awesome";
            System.out.println(letter);
            
        }
    }
    

