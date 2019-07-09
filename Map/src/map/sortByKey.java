package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class sortByKey {
// This map stores unsorted values
	static Map<String,Integer> map= new HashMap<>();
	
	//Function to sort map by Key
	public static void sortbyKey() {
		
		//TreeMap to store values of HashMap
		TreeMap<String,Integer> sorted= new TreeMap<>();
		
		//copy all data from HashMap into TreeMap
		sorted.putAll(map);
		
		//Display the TreeMap which is naturally sorted
		for (Map.Entry<String,Integer>entry:sorted.entrySet())
			System.out.println("Key= "+entry.getKey()+", Value= "+entry.getValue());
		
	}
	public static void main(String[] args) {
		{
		//putting values in the Map
		map.put("Rishada", 100);
		map.put("Meera", 90);
		map.put("Sabra", 100);
		map.put("Ansa", 85);
		map.put("Rose", 55);
		
		
		//Calling the function to sortbyKey
		sortbyKey();
	    }
	}
	
}
