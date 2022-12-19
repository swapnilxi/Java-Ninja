public class WithoutUsingSortMethod

{
    public static void main (String[] args){
        int temp;
        //int[] arrNumbers={14, 8, 5, 54, 41, 10, 1, 50};
        int[] arrNumbers={14, 8, 5, 54,41};
        System.out.println("Array before sorting:");
        for(int i: arrNumbers)
        {
            System.out.println(i);
        }
        //synatx: for(dataType element: arrayName){sout(element)};
        
        for(int b= 0; b<= arrNumbers.length-1; b++){
        System.out.println("time of travarsal:"+b);
            for(int a= 0; a<= arrNumbers.length-2; a++){
        System.out.println("the first number is:" +arrNumbers[a] );
        System.out.println("the second number is :"+ arrNumbers[a+1]);
              if(arrNumbers[a]> arrNumbers[a+1]){
                 temp= arrNumbers[a];
                 arrNumbers[a]= arrNumbers[a+1];
                 arrNumbers[a+1]= temp;
                 System.out.println("------------");
                 System.out.println(arrNumbers[a]+","+ arrNumbers[a+1]);
                 System.out.println("------------");
                 for (int i : arrNumbers){
            System.out.println(i);
                  }
                  System.out.println("------------");
                 
              }
            }
        }
        System.out.println("Array after sort: ");
        for (int i : arrNumbers){
            System.out.println(i);
        }
    
        
    }   
        
    }