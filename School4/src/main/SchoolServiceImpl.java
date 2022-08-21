package main;

import java.util.ArrayList;

public class SchoolServiceImpl implements SchoolService {

	private ArrayList<Member> list;
	
	public SchoolServiceImpl() {
		list = new ArrayList<Member>();
	}
	
	@Override
	public int findIndexByTel(String tel) {
		int index = -1;
		for(int i=0; i<list.size(); i++) {
			if(tel.equals(list.get(i).getTel())) {
				index = i;
				break;
			}
		}
		return index;
	}
	@Override
	public Member findMemberByTel(String tel) {
		Member member = null;
		int index = findIndexByTel(tel);
		if(index != -1)  // -1 이 아니면 있는 것이다. 
			member = list.get(index);
		return member;
	}
	@Override
	public void addMember(Member member) {
		if(findIndexByTel(member.getTel()) == -1) 
			list.add(member);
		else 
			System.out.println("중복됩니다.");
	}

	@Override
	public void printAll() {
		for(Member member : list) {
			System.out.println(member);
		}
	}
	@Override
	public void deleteMemberByTel(String tel) {
		if(findIndexByTel(tel) != -1) {
			list.remove(findIndexByTel(tel));
			System.out.println("삭제 되었습니다.");
		}
		else 
			System.out.println("사용자가 없습니다.");
	}
	@Override
	public void updateMemberByTel(Member member) {
		if(findIndexByTel(member.getTel()) != -1) {
				list.set(findIndexByTel(member.getTel()), member);
				System.out.println("수정되었습니다.");
		}
		else 
			System.out.println("사용자가 없습니다");
	}
}
