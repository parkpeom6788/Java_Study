package model;

public interface SchoolService {
	
	public int findIndexByTel(String tel);
	public void printAll();
	public Member findMemberByTel(String tel);
	public void deleteMemberByTel(String tel);
	
	public void addMember(Member member);
	public void updateMemberByTel(Member member);
	
}