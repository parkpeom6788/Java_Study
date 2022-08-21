package model;

import java.util.ArrayList;

public class SchoolServiceImpl implements SchoolService {
	
	private ArrayList<Member> list;
	
	public SchoolServiceImpl() {
		list = new ArrayList<Member>();
	}
	
	@Override
	public int findIndexByTel(String tel) {
		int index = -1;
		for(int i=0; i<list.size();i++) {
			if(tel.equals(list.get(i).getTel())){
				return index = i;
			}
		}
		return index;
	}
	@Override
	public void printAll() {
		for(Member member : list) {
			System.out.println(member);
		}
	}
	// Create
	public void addMember(Member member) {
		if(findIndexByTel(member.getTel()) == -1)
			list.add(member);
		else 
			System.out.println(member.getTel() + "중복되어 추가될수 없습니다.");
	}
	@Override
	public Member findMemberByTel(String tel) {
		Member member = null;
		int position = findIndexByTel(tel);
			if(findIndexByTel(tel) != -1) {
				System.out.println(tel +" 정보를 찾았습니다 !! ");
				return list.get(position);
			}
		return member;
	}
	@Override
	public void deleteMemberByTel(String tel) {
		int index = findIndexByTel(tel);
		if(findIndexByTel(tel) != -1) {
			// 있음
			list.remove(index);
			System.out.println("정보가 제거 되었습니다.");
		} else {
			System.out.println("정보가 없습니다.");
		}
	}
	@Override
	public void updateMemberByTel(Member member) {
		int index = findIndexByTel(member.getTel());
		if(findIndexByTel(member.getTel()) != -1) {
			// 있음
			list.set(index, member);
			System.out.println("수정되었습니다.");
		} 
		else 
			System.out.println("정보가 없습니다.");
	}
}
