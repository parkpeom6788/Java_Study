package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
/*
 * Map의 성질을 그대로 가지고 있다
 * Map은 key , value  구성된 Entry 객체를 저장하는 구조
 * 키와 값은 모두 객체
 * 값은 중복될수있지만 키는 중복 저장될 수 없다
 * --- 수정 ---
 * 키와 동일한 키로 값을 저장하면 기존의 값은 없어지고 새로운 값으로 대치
 * HashMap은 이름 그대로 해싱(Hashing)을 사용
 * 많은 양의 데이터를 검색 하는데 있어서 뛰어난 성능을 보인다 
 */
public class Main {
	
	public static void main(String[] args) {
		
		// 초기에 저장할 데이터 개수를 알고 있다면
		// Map의 초기 용량을 지정해주는 것이 좋습니다
		HashMap<String,String> map1 = new HashMap<String,String>();
		HashMap<String,String> map2 = new HashMap<>();
		HashMap<String, String> map3 = new HashMap<>(map1);
		HashMap<String,String> map4 = new HashMap<>(10); // 초기 용량 지정
		HashMap<String,String> map5 = new HashMap<>(10, 0.7f);
		HashMap<String,String> map6 = new HashMap<String,String>() {{
			put("a","b");
		}};
		// HashMap 값 추가
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1, "사과");
		map.put(2, "바나나");
		map.put(3, "포도");
		// 만약 입력되는 키 값이 HashMap 내부에 존재한다면
		// 기존의 값은 새로 입력되는 값으로 대치 된다.
		
		// HashMap 값 삭제
		HashMap<Integer,String> map7 = new HashMap<Integer,String>(){{
			put(1,"사과");
			put(2,"바나나");
			put(3,"포도");
		}};
		map7.remove(1); // key값 에 1 제거
		map7.clear(); // 모든 값을 제거함
		
		// HashMap 값 출력
		HashMap<Integer,String> map8 = new HashMap<Integer,String>(){{
			put(1,"사과");
			put(2,"바나나");
			put(3,"포도");			
		}};
		System.out.println(map); // 전체 출력 : {1=사과, 2=바나나, 3=포도}
		System.out.println(map.get(1)); // key값1의 value 얻기 : 사과
		
		// entrySet() 활용
		for(Entry<Integer,String> entry : map8.entrySet()) {
			System.out.println("key : " + entry.getKey() + " value : " + entry.getValue());
		}
		// keySet() 활용
		for(Integer i : map.keySet()) {
			System.out.println("key : " + i + " value : " + map.get(i));
		}
		// 특정  key 값의 value 를 가져오고 싶다면 get(key) 사용
		// 전체를 출력하려면 entrySet() 이나 keySet() 메서드 활용
		// key 값을 이용해서 value를 찾는 과정에서 시간이 많이 소요되므로
		// 많은 양의 데이터를 가져와야 한다면 entrySet() 이 좋다
		
		// Iterator 사용
		HashMap<Integer,String> map9 = new HashMap<Integer,String>(){{
			put(1,"사과");
			put(2,"바나나");
			put(3,"포도");
		}};
		
		// entrySet().iterator()
		Iterator<Entry<Integer, String>> entries = map9.entrySet().iterator();
		while(entries.hasNext()) {
			Map.Entry<Integer, String> entry  = entries.next();
			System.out.println("key : " + entry.getKey() + " value : " + entry.getValue());
		}
	}
}