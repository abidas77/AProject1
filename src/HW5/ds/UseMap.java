package ds;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class UseMap {
	public static void main(String[] args) {
		// Declare a Map to store key value pair and then use for each loop to retrieve it.
    	
        HashMap<Integer,String> nameMap = new HashMap<Integer,String>();     
        
        nameMap.put(1, "John Smith");
        nameMap.put(2, "Carl Zeiss");
        nameMap.put(3, "Megan Stewart");        
       
        String name = nameMap.get(1);
        System.out.println("The key 1 has the value: "+name);        
        
        System.out.println("All the names are: "+nameMap.values());        
        
        System.out.println("All the keys are: "+nameMap.keySet());        
       
        nameMap.put(1,"A different Name");
        System.out.println("Now 1 has: "+nameMap.get(1));
        
        for ( Entry<Integer, String> et : nameMap.entrySet() ){
			System.out.println(et.getKey() + "......." + et.getValue());
		}      
               
        
    }
}
