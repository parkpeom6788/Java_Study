package model;

public interface SchoolService {
	
	public Member findMemberByTel(String tel); // 번호 검색 

	public int findIndexByTel(String tel); // 회원의 인덱스
	
	public void addMember(Member member); // 추가 
	
	public void printAll(); // 모두 출력
	
	public void deleteMemberByTel(String tel); // 삭제
	
	public void updateMember(Member member); // 수정 
	
}