package arraylist_test;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
	// 선언만
	public ArrayList<Member> arrayList;
	
	// 기본 생성자에서 초기화 하는 경우가 많음
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	// 추가
	public void addMember(Member member) {
		arrayList.add(member);
	}
	// 제거
	public boolean removeMember(int memberId) {
		for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int temp = member.getMemberId();
			if(temp == memberId) {
				arrayList.remove(i);
				return true;
			}
		return false;	
		}
		// Iterator 이용하여 제거하기
		Iterator<Member> iterator = arrayList.iterator();
		
		while(iterator.hasNext()) {
			Member member = iterator.next();
			int temp = member.getMemberId();
			if( temp == memberId ) {
				arrayList.remove(member);
				return true;
			}
			return false;
		}
		System.out.println(memberId +" 가 존재 하지 않습니다.");
		return false;
	}
	public void showAll() {
		for(Member member : arrayList) {
			System.out.println(member.toString());
		}
	}
}
