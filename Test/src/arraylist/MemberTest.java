package arraylist;

public class MemberTest {
	
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		Member memberKim = new Member(101,"이순신");
		memberArrayList.addMember(memberKim);
		
		Member memberLee = new Member(102,"김유신");
		memberArrayList.addMember(memberLee);
		memberArrayList.showAll();
		
		System.out.println("---------");
		memberArrayList.removeMember(memberLee.getMemberId());
		memberArrayList.showAll();
		
	}
}
