package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		
		System.out.println(set); // hashSet 은 toString이 구현이 되어있어서 
		
		boolean b = set.add("aaa");
		System.out.println(set); // hashSet 은 toString이 구현이 되어있어서 
		// 중복안돼서 나옴
		
	}
}
