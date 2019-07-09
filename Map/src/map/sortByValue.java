package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class sortByValue {
	
    // This map stores unsorted values 
	static Map<String,Integer> map= new HashMap<>();
	
	//Function to sort map by Key
    public static void sortbyKey() {
			
			//TreeMap to store values of HashMap
			TreeMap<String,Integer> sorted= new TreeMap<>();
			
			//copy all data from HashMap into TreeMap
			sorted.putAll(map);
			
			LinkedHashMap<String,Integer> sortedMap= new LinkedHashMap<>();
			
			//Display the value which is naturally sorted
			map.entrySet()          //set <Entry<String, Integer>>
			.stream()               //Stream<Entry<String,Integer>>
			.sorted(Map.Entry.comparingByKey()) //Stream<Entry<String,Integer>>
			.forEachOrdered(x->sortedMap.put(x.getKey(),x.getValue()));
			
			System.out.println(sortedMap);
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
