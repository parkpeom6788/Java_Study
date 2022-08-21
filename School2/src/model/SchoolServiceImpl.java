package model;

import java.util.ArrayList;

public class SchoolServiceImpl implements SchoolService {

	private ArrayList<Member> list;
	
	public SchoolServiceImpl() {
		list = new ArrayList<Member>();
	}
	@Override
	public int indexByTel(String tel) {
		int index = -1;
		for(int i=0; i<list.size();i++) {
			if(tel.equals(list.get(i).getTel())) {
				index = i;
				break;
			}
		}
		return index;
	}
	@Override
	public void addMember(Member member) {
		if(indexByTel(member.getTel()) == -1) {
			list.add(member);
		}
		else {
			System.out.println(member.getTel() + "중복되서 추가할수 없습니다.");
		}
	}
	@Override
	public void printAll() {
		for(Member member : list) {
			System.out.println(member);
		}
	}
	@Override
	public Member findmemberByTel(String tel) {
		// 찾을때 인덱스 리턴 , 못찾으면 null;
		Member position = null;
		int index = indexByTel(tel);
		if(index != -1) {
			// 있을때
			System.out.println(tel + " 멤버를 찾았습니다.");
			return list.get(index);
		}
		return position;
	}

	@Override
	public void deleteMemberByTel(String tel) {
		int index = indexByTel(tel);
		if(indexByTel(tel) != -1) {
			list.remove(index);
			System.out.println(tel + " 멤버가 삭제되었습니다.");
		}
		else {
			System.out.println("멤버가 없습니다.");
		}
	}

	@Override
	public void updateMember(Member member) {
		int index = indexByTel(member.getTel());
		if(indexByTel(member.getTel()) != -1) {
			list.set(index, member);
			System.out.println(member.getTel() + " 멤버가 수정되었습니다.");
		} else {
			System.out.println("멤버가 없습니다.");
		}
	}
}
