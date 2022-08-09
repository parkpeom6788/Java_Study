package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {
	
	public static void main(String[] args) {
		
		//String은 이미 compare를 이미 구현되어 있어서 정렬이 된다
			TreeSet<String> tree = new TreeSet<String>();
			tree.add("aaa");
			tree.add("ccc");
			tree.add("bbb");
			System.out.println(tree);
			
			
	}
}
