package ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map; 

public class Ex11_18 {
	
	public static void main(String[] args) {
		
		String[] data = {"A","K","A","K","D","K","A","K","K","K"};
		HashMap map = new HashMap();

		for(int i=0; i<data.length; i++) {
			if(map.containsKey(data[i])) { // 포함하고있으면
				int value = (int)map.get(data[i]); // get 키값을 통해 value를 구함 
				map.put(data[i], value + 1); // key A이면  value는 중복되는 갯수
			} else {
				map.put(data[i], 1); // 중복되는 값이 없으면 한개 
			}
		}
		
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry entry =(Map.Entry)it.next();
			int value = (int)entry.getValue();
			System.out.println(  " : " +
					printBar('#',value) + entry.getKey());
		}
	}
	public static int printBar(char c , int value) {
		
		for(int i= 0; i < value; i++) {
			System.out.print(c);
		}
		return value;
	}
}
