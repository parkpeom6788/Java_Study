package ch11;

import java.util.HashSet;
import java.util.Iterator;

public class Ex11_12 {
	
	public static void main(String[] args) {
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();
		
		setA.add("1"); setA.add("2"); setA.add("3"); 
		setA.add("4"); setA.add("5");
		System.out.println("A = " + setA);
		
		setB.add("4"); setB.add("5"); setB.add("6"); 
		setB.add("7"); setB.add("8");
		System.out.println("B = " + setB);
		
		// 교집합
		setA.retainAll(setB);
		System.out.println(setA); // 교집합 공통된 요소만 남기고 삭제 
		
		// 합집합
		setA.addAll(setB); // 합집합 . setB의 모든 요소를 추가 (중복 제외)
		// 차집합 
		setA.remove(setB); // 차집합 setB와 공통 요소를 제거 
		Iterator it = setB.iterator();
		
		while(it.hasNext()) {
			Object tmp = it.next();
			if(setA.contains(tmp)) { // 교집합
				setKyo.add(tmp); 
			}
		}
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp)); // 차집합
				setCha.add(tmp);
		}
		
		it = setA.iterator();
		while(it.hasNext()) {
			setHab.add(it.next()); // 합집합 A를 전부다 집어넣음
		}
		it = setB.iterator();
		while(it.hasNext()) {
			setHab.add(it.next()); // 합집합 B를 전부다 집어넣음 
		}
		
		System.out.println("A 교 B = " + setKyo);
		System.out.println("A 합 B = " + setHab);
		System.out.println("A 차 B = " + setCha);
	}
}
