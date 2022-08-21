package ch11;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ex11_5 {
	public static void main(String[] args) {
		TreeSet c = new TreeSet();
		//Collection c = new TreeSet(); // Set은 Collection 의 자손
		c.add("1");
		c.add("2");
		c.add("3");
		c.add("4");
		c.add("5");	
		Iterator it = c.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj); // 1 , 2 , 3 , 4 , 5
		}
		Map map = new TreeMap();
		map.put("1", 1);
		map.put("2", 2);
		map.put("3", 3);
		Iterator iter = map.keySet().iterator();
		while(iter.hasNext()) {
			Object obj = iter.next();
			System.out.println(obj); // 1 , 2 , 3
		}
	}
}
