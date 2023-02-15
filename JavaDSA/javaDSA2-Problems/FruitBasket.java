package javaDSA2;

import java.util.HashMap;

class FruitBasket {
    public static int totalFruit(int[] fruits) {
        int max1=0;
        int max2=0;
        HashMap <Integer, Integer> map= new HashMap<>();
         //map(fruittype, times)   
        for(int i:fruits){
             if(map.containsKey(i)){
                 map.put(i, map.get(i)+1);
                 max1= map.get(i);
            }else{
                map.put(i, 1);
            }
        }
     
       for(int key: map.keySet()){ 
          if(map.get(key)> max1){
              max2= max1;
              max1=map.get(key);
            }
        }
        return max1+max2;
    }
    public static void main(String[] args) {
        int[] fruits={1,2,3,2,2};
        totalFruit(fruits);
        System.out.println(totalFruit(fruits)); 

    }
}

