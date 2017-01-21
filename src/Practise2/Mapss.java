package Practise2;
//Hashtable works for multi threaded objects but hashmap cant work
// Map<interface>
//Hashtable                    Hashmap(unsorted/unordered)
							//LinkedHashMap Unsorted/Ordered
							//TreeMap 
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class Mapss {
	public static void main(String[] args){
	//	Hashtable<Integer, Integer> n = new Map<Intger,Integer>();
	Map<String, String> a = new LinkedHashMap<String, String>();
	a.put("a", "kidaaaa");
	a.put("z", "hi");
	a.put("b", "jaskanwal");
	a.put("n", "hello");
	a.put("i", "bhandari");
	a.put("e", "sid");	
	
	//System.out.print(a.containsKey("i"));
	//System.out.print(a.entrySet());
 }
}
