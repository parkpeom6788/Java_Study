package arraylist_test;

public class MemberTest {
	
	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberKim = new Member(101,"김유신");
		Member memberLee = new Member(102,"이순신");
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberLee);
		
		memberArrayList.showAll();
		
		memberArrayList.removeMember(memberKim.getMemberId());
		memberArrayList.showAll();
		
	}
}
