package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;
import collection.Member;
public class MemberTreeSet {
	private TreeSet<Member> treeset;

	// TreeSet 에서 compare 문자열 비교 
	public MemberTreeSet() {
		// 기본생성자를 만들어줘야 compare 이 불러진다.  
		treeset = new TreeSet<Member>(new Member()); 
	}
	
	// 추가는 ArrayList와 똑같다 
	public void addMember(Member member) {
		treeset.add(member);
	}
	// 제거 
	public boolean remove(int memberId) {
		// hashSet은 get(i) 가 안됨 
//		Member member = new Member();
//		for(int i=0; i<hashset.size(); i++) {
//			if(memberid == member.getMemberId()) {
//				hashset.remove(member);
//				return true;
//			}
//		}
//		return false;
		// Iterator 는 인터페이스 이므로 new 해서 생성 못함
		// set은 get() 이 없어서 iterator 를 돌린다 
		Iterator iterator = treeset.iterator();
		while(iterator.hasNext()) {
			Member member = (Member)iterator.next();
			int tempId = member.getMemberId();
			if(memberId == tempId) {
				treeset.remove(member);
				return true;
			}
		}
		System.out.println(memberId +"가 존재하지 않습니다.");
		return false;
	}
	// 모두 출력 
	public void showAll() {
		for(Member member : treeset) {
			System.out.println(member);
		}
		System.out.println();
	}
}
