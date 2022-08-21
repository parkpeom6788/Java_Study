package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest1 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("Jackie", 30);
		int score = map.get("Jackie"); // get(key) -> value값 반환
		map.remove("Jackie"); // remove(key) -> true면 제거됨 
		// 첫 번째는 keySet() 메서드로 모든 키를 Set 컬렉션으로 얻은 
		// 다음 반복자를 통해 키를 하나씩 얻고 get() 메서드를 통해 값을 얻음
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator(); // key -> String
		while(it.hasNext()) {
			String key = it.next();
			Integer i = map.get(key);
		}
	}
}
