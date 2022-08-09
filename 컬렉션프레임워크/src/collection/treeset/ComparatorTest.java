package collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

// 컴파라 레이터- 컴패러
class MyCompare implements Comparator<String> {

	@Override
	public int compare(String str1, String str2) {
		return str1.compareTo(str2) * (-1); //  -1 내림차순으로 반환
	}
}
public class ComparatorTest {
	
	public static void main(String[] args) {
		// 컴파라 레이터 - 컴패러 를 쓰고 싶으면 생성자 안에 new MyCompare() 추가 
		// 비교 하는 방식을 MyCompare 로 쓴다는 것이다.
		TreeSet<String> tree = new TreeSet<>(new MyCompare());
		tree.add("aaa");
		tree.add("ccc");
		tree.add("bbb");
		
		System.out.println(tree); 
	}
}
