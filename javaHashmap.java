
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class javaHashmap {
    
    private static void hashMapDemo() {
		System.out.println("\n\nInside hashMapDemo ...");
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("John", 25);
		map1.put("Raj", 29);
		map1.put("Anita", null);
        map1.put("Swapnil", 22);
		
		System.out.println(map1);
		
		map1.put("Anita", 23);
		System.out.println(map1);

		//contains
		System.out.println("contains john?: "+ map1.containsKey("John"));
		System.out.println("John's age/value:"+ map1.get("John"));

		//iterating using the key-set method 

		System.out.println("Iterating using the keySet......");
		Set<String> names= map1.keySet();
		System.out.println("setting key");
		System.out.println(names);
		for(String name :names){
			System.out.println("name: " +name + ", age: "+  map1.get(name));
		}

 
		//iterating using the Entry-set method 
  System.out.println("iterating using entryset");
  Set<Map.Entry<String, Integer>> mappings =map1.entrySet();
  System.out.println("//after entry set //");
  System.out.println(mappings);
  for(Map.Entry<String, Integer> mapping: mappings){
	  System.out.println("Name"+ mapping.getKey() + ", Age:"+ mapping.getValue());
  }

  names.remove("Anita");
  System.out.println(map1);

  Map <String,Map<String, Object>> userProfile= new HashMap<>();
  Map<String , Object> profile= new HashMap<>();

  profile.put("age", 25);
  profile.put("deppt", "CS");
  profile.put("city", "new york");
  userProfile.put("John", profile );

profile = new HashMap<>();
  profile.put("age", 29);
  profile.put("deppt", "EE");
  profile.put("city", "South Africa"); 
userProfile.put("Raj", profile);

System.out.println("userProfile"+ userProfile);

Map<String, Object> Profile1= userProfile.get("John");
int age= (Integer) Profile1.get("age");
System.out.println("Age: "+ age);









    }
    public static void main(String[] args) {
        hashMapDemo();	
    }

   
}
