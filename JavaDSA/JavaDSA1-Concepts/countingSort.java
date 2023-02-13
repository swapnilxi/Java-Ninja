package JavaDSA1;

public class countingSort {
    public static void  main(String[] args){
        int[] intArray={2,4,5,6,8,8,7,2,4,8};

        for (int e : intArray) {
            System.out.println(e);
        }

    }
public static void CountingSortmethod(int[] input, int max, int min){
    int[] countArray= new int[(max-min)+1];

    for(int i=0; i< input.length; i++){
        countArray[input[i]- min]++;
    }
    int j=0;
    for (int i= min; i<=max; i++){
        while (countArray[i-min]>0)
        {
            input[j++]=i;
            countArray [i- min]--;
        }
    }


}
    
}
