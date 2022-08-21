package map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class TestGo {
	public static void main(String[] args) {
		Map<String,Object> map = new HashMap<String,Object>();
		// Map 문자열 데이터를 넣는다
		map.put("testStr", "테스트 데이터 입니다.");
		// Map에 정수 데이터를 넣는다
		map.put("testInt", 1234567890);
		System.out.println("문자열 데이터 표출 : " + map.get("testStr"));
		System.out.println("정수 데이터 표출 : " + map.get("testStr"));
		System.out.println("자료형 :: " + map.get("testStr").getClass().getName());
		System.out.println("자료형 :: " + map.get("testInt").getClass().getName());
		// map 데이터를 문자열로 셋팅
		String setStr = map.get("testStr").toString();
		// map 데이터를 int 에 셋팅
		int setInt = (int)map.get("testInt"); // 키를통해 value값을 가져옴 
//		System.out.println(setInt);
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			if(key.equals("testInt")) {
				Integer i =(Integer)map.get(key);
				System.out.println("value 값 : " + i);
			}
		}
		Set<Entry<String, Object>> set = map.entrySet();
		Iterator<Entry<String, Object>> iter = set.iterator();
		
		while(iter.hasNext()) {
			 Entry<String, Object> entry = iter.next();
			 System.out.println(entry.getKey());
			 System.out.println(entry.getValue());
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println(list.hashCode());
		list.add(1);
		System.out.println(list.hashCode());
		list.add(1);
		System.out.println(list.hashCode());
	}
}
