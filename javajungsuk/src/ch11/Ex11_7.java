package ch11;

import java.util.Arrays;
import java.util.Comparator;

public class Ex11_7 {
	public static void main(String[] args) {
		String[] strArr = {"cat","Dog","lion","tiger"};
		Arrays.sort(strArr); // String 클래스에서 Comparable<String> 이 구현되어 있다
		System.out.println("strArr = " + Arrays.toString(strArr)); // 오름차순 
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분안함
		System.out.println("strArr = " + Arrays.toString(strArr));
		Arrays.sort(strArr, new Descending()); // 역순 정렬
	}
}
class Descending implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		if( o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c2.compareTo(c1);
			// return c1.compareTo(c2); * -1 // -1을 곱해서 기본정렬 방식의 역으로 변경한다  또는 c2.compareTo(c1) 와 같이 순서를 바꿔도 된다 
		}
		return -1;
	}		
}
