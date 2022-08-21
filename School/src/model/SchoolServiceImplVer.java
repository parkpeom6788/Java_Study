package model;

import java.util.ArrayList;

public class SchoolServiceImplVer implements SchoolService {
		
	private ArrayList<Member> list;
	
	public SchoolServiceImplVer() {
		list = new ArrayList<Member>();
	}
	// 인덱스 
	@Override
	public int findIndexByTel(String tel) {
		int position = -1;
		for(int i=0; i<list.size(); i++) {
			if(tel.equals(list.get(i).getTel())) {
				position = i; // 중복값있으면 중복된 인덱스 리턴 
				break;
			}
//			return position; for문이 바로 리턴됨..
		}
		return position; // 없을시 -1 반환 
	}
	// 인덱스를 통해 사용자가 있나 
	@Override
	public Member findMemberByTel(String tel) {
		int index = findIndexByTel(tel);
		if(index == -1)
			return null;
		else 
			return list.get(index);
	}
	@Override
	public void addMember(Member member) {	
		if(findIndexByTel(member.getTel()) == -1) { // -1 값이 없다는것 추가가능 
			list.add(member);
		 } else  {
			 System.out.println("중복됩니다.");
		 }
	}
	@Override
	public void printAll() {
		for(Member member : list) {
			System.out.println(member.toString());
		}
	}
	@Override
	public void deleteMemberByTel(String tel) {
		int position = findIndexByTel(tel);
		if(position != -1) {
			list.remove(position);
			System.out.println("삭제가 완료되었습니다.");
		} else {
			System.out.println("값이 없습니다.");
		}
	}
	@Override
	public void updateMember(Member member) {
		int position = findIndexByTel(member.getTel());
		if(position != -1) {
			list.set(position, member);
			System.out.println("수정이 완료되었습니다.");
		} else {
			System.out.println("값이 없습니다");
		}
	}
}
