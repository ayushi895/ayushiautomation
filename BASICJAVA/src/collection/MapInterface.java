package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) 
	{
		//HASHMAP
		
		/*
		 * Map<String,Integer> map= new HashMap<String,Integer>(); map.put("Anand", 30);
		 * map.put("Abhishek", 27); map.put("Ayushi", 24); map.put(null, 50);
		 * System.out.println(map.get("null"));
		 */
		 
		//HASHTABLE
		
		  Map<String,Integer> map= new Hashtable<String,Integer>(); 
		  map.put("Anand",
		  30); 
		  map.put("Abhishek", 27);
		  map.put("Ayushi", 24); 
		  //map.put(null, 50);
		  map.put("Abhishek", 28);
		  System.out.println(map.get("Abhishek"));
		  Set<String> set=map.keySet();
		  for (String s:set)
		  {
			  System.out.println(map.get(s));
		  }
		 
		

	}

}
