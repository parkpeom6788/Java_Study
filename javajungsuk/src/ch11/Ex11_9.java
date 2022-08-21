package ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set; // 순서 x 중복 x -> 순서유지하려면 LinkedHashSet 를 이용한다 

public class Ex11_9 {
	
	public static void main(String[] args) {
		
			Object[] objArr = {"2",new Integer(1),"2","1","4","4"};  // 객체 배열 
			Set set = new HashSet();
			
			for(int i=0; i<objArr.length; i++) {
//				set.add(objArr[i] +  "=" +  set.add(objArr[i])); // HashSet 에 objArr의 요소들을 저장한다.
				System.out.println(objArr[i] +  "=" +  set.add(objArr[i]));
			}
			// HashSet에 저장된 요소들을 출력한다 
			System.out.println(set);
			// HashSet에 저장된 요소들을 출력한다.(Iterator 이용)
			Iterator it = set.iterator();
			while(it.hasNext()) { // 읽을 요소가 남아있는지 확인 while문으로 읽어올 요소를 
				System.out.print(it.next()+" "); // 요소를 하나씩 꺼내오기 
			}
		}
	}