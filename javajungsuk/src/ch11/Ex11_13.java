package ch11;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex11_13 {
	
	public static void main(String[] args) {
		
		Set set = new TreeSet(new TestComp()); // 정렬되어서 나온다. 범위검색 가능 정렬 필요없음  -> 정렬을 하려면 새로만든 비교기준 Comparator를 상속받아서 구현한 TestComp()를 생성해준다 
		//Set set = new HashSet(); // 정렬이 안됨  , 정렬이 필요함 
//		
//		for(int i=0; set.size() < 6;i++) {
//			
//			int num = (int)(Math.random()*45)+1;
			set.add(new Test()); // set.add(new Integer(num));
			set.add(new Test()); // set.add(new Integer(num));
			set.add(new Test()); // set.add(new Integer(num));
			set.add(new Test()); // set.add(new Integer(num));
			set.add(new Test()); // set.add(new Integer(num));
//		}
		System.out.println(set);
	}
}
class Test implements Comparable {
// set.add()는 비교기준이 있어서 set.add(new Test()) 정렬을 하는데 비교기준이 없으면 에러가 생긴다 
// 저장하는 객체가 Comparable 를 가지고 있으면 됨 또는 비교기준을 위한 TreeSet에서 Comparator를 구현한 클래스 TestComp를 생성하면 됨
	@Override
	public int compareTo(Object o) {
		return -1;
	}
}
class TestComp implements Comparator { // 비교기준을 위한 Comparator 인터페이스의 compare 메서드를 구현한다.
	@Override
	public int compare(Object o1, Object o2) {
//		return 0; // 0 이면 객체를 하나로만 판단
		return -1; // -1이면 같은객체가 아니므로 여러개 저장
	}
	
}