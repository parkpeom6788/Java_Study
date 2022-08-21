package map_exam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class HashMapExam2 {
	public static void main(String[] args) {
		Map<Student,Integer> map = new HashMap<Student,Integer>();
		map.put(new Student(1,"Jolie"),100);
		map.put(new Student(1, "Jolie"),200);
		System.out.println("총 Entry 수 : " + map.size());
		
		Set<Integer> set = new TreeSet<Integer>();
		set.add(6);
		set.add(5);
		set.add(8);
		set.add(3);
		set.add(1);
		
		Iterator<Integer> id = set.iterator();
		while(id.hasNext()) {
			System.out.println(id.next() + " ");
		}
		
		
	}
}
