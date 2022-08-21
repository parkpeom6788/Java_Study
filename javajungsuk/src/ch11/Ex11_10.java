package ch11;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
public class Ex11_10 {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		for(int i=0; set.size() < 6; i++) { // size의 크기가 6보다 작은 동안  1~45 사이의 난수를 저장 
			int num = (int)(Math.random() * 45)+1; // 난수 
			//set.add(new Integer(num));
			set.add(num);
		}
		System.out.println(set); // 정렬되지 않은 상태로 결과가 나온다  -> 정렬하려면? 
		// sort 의 매개변수로 list 만 올수있다.   정렬을하려면  순서유지가 되야한다.  그러므로 set은 정렬불가 set을 list로 옮기고 list를 정렬해야함 
		List list = new LinkedList(set); // 1 set 의 모든 요소를 list 에 저장 
		Collections.sort(list);   // 2. list를 정렬
		System.out.println(list); // 3. list를 출력 
		
		
	}
}
