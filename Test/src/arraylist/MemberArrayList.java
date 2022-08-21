package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
	
	public ArrayList<Member> arrayList;
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	// 추가
	public void addMember(Member member) {
		arrayList.add(member);
	}
	// 제거
	public boolean removeMember(int memberId) {
		/*
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if(memberId == tempId) {
				arrayList.remove(i);
				return true;
			}
			return false;
		}
		*/
	// Iterator 사용 
		Iterator<Member> it = arrayList.iterator();
		while(it.hasNext()) {
			Member member = it.next();
			int tempId = member.getMemberId();
			if(memberId == tempId) {
				arrayList.remove(member);
				return true;
			}
		}
		System.out.println(memberId + " 가 존재 하지 않습니다.");
		return false;
	}
	
	public void showAll() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
	}
	
}
