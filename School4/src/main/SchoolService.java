package main;
public interface SchoolService {
	public int findIndexByTel(String tel);
	public Member findMemberByTel(String tel);
	public void addMember(Member member);
	public void printAll();
	public void deleteMemberByTel(String tel);
	public void updateMemberByTel(Member member);
}