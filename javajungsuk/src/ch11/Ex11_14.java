package ch11;

import java.util.TreeSet;

public class Ex11_14 {
	
	public static void main(String[] args) {
		TreeSet set = new TreeSet(); // 범위 검색에 유리 . (from~to) 
		String from = "b";
		String to = "d";
		
		set.add("abc"); set.add("alien"); set.add("bat");
		set.add("Car"); set.add("car"); set.add("disc");
		set.add("dance"); set.add("dZZZZZ"); set.add("dzzzzz");
		set.add("elephant"); set.add("elevator"); set.add("fan");
		set.add("flower");
		
		System.out.println(set);
		System.out.println("range search : from " + from +" to " + to); // b 부터 d보다 앞에있는 것보다 앞에 있는것까지 
		System.out.println("result1 : " + set.subSet(from, to)); // b ~ c
		System.out.println("result2 : " + set.subSet(from, to + "zzz")); // 그외에 zzz가 들어간 단어를 찾고 싶으면 
	}
}
