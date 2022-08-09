package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap;
	public MemberHashMap() {
		hashMap = new HashMap<Integer,Member>();
	}
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(),member);
	}
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
			
			// 검색은 hashMap.get(key) -> value를 알아냄 
			// 추가는 put
			// key에 대한 전체 keySet()  - 키는 중복이 안되니 set반환
			// values() 모든 value반환 collection 
		}
		System.out.println(memberId + " 가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator(); // Iterator set을 가져옴set의 iterator 순회
		
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		
	}
}	
