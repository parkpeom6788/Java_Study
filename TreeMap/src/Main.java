import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {	
		TreeMap<Integer,String> map1 = new TreeMap<Integer,String>();
		TreeMap<Integer,String> map2 = new TreeMap<>();
		TreeMap<Integer,String> map3 = new TreeMap<>(map1);
		TreeMap<Integer,String> map4 = new TreeMap<>() {{
			put(3,"b");
			put(1,"a");
			put(5,"c");
			put(2,"d");
		}
	};
	// EntrySet 활용
	for(Entry<Integer,String> entry : map4.entrySet()) {
		System.out.println("key : " + entry.getKey()  + " value : " + entry.getValue());
	}
	// EntrySet Iterator 활용 
	Iterator<Entry<Integer,String>> entrys = map4.entrySet().iterator();
		while(entrys.hasNext()) {
			Map.Entry<Integer,String> entry = entrys.next();
			System.out.println(" key : " + entry.getKey());
			System.out.println(" value : " + entry.getValue());
	}
	// KeySet 활용
	for(Integer i : map4.keySet()) {
		System.out.println("key : " + i + "value : " + map4.get(i));
	}	
	// KeySet Iterator 활용 
	Iterator<Integer> keys= map4.keySet().iterator();
		while(keys.hasNext()) {
			int key = keys.next();
			System.out.println("key : " + key + " value: " + map4.get(key));
		}
	}
}
