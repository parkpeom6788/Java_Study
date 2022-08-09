package collection;

import java.util.Comparator;

// TreeSet 정렬하기위해 Comparable 컴파라블  -> compareTo 컴파라투 구현
// Comparator -> compare 구현
public class Member implements Comparable<Member> , Comparator<Member> {	
	
	private int memberId;
	private String memberName;
	
	public Member() {
	}
	public Member(int memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return memberName + "회원님의 아이디는 " + memberId +"입니다.";
	}
	// hashSet에서 기존멤버와 새로들어가는 멤버와 같은지 비교해줘야함..
	// 아이디가 같으면 같다 
	@Override
	public int hashCode() {
		return memberId;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj; // object -> member 다운캐스팅 
			if(this.memberId == member.memberId) {
				return true;
			}
			else return false;
		}
		return false; // member가 아니면 
	}
	
	// 어떻게 비교해서 넣을지 
	// implements Comparable<Member>
	@Override
	public int compareTo(Member member) {
		// 추가되는 객체 this 와 기존의 트리구성 멤버들중에
		// 어느 한놈이랑 특이가 어떻게 구성되어있나
		// 어떻게 비교가 되는지 
		
		// 무엇을 기준으로 할것인지
		return 
				// 내꺼에서 넘어온 매개변수를 빼면 
				// 내가 큰경우 양수가 나오면 오름차순
				//(this.memberId - member.memberId); // 결과 양수 오름차순
				// (this.memberId - member.memberId) * (-1); // 내림차순 
			
				// 문자열 비교는? String.compareTo 이용 
				(this.memberName.compareTo(member.memberName));
	}
	
	// compare 를 부르려면 default 생성자를 호출해줘야함 
	@Override
	public int compare(Member member1, Member member2) { // 앞에 나 , 뒤 넘어옴
		return (member1.memberId - member2.memberId); // 양수 리턴시 오름차순
		// 문자열 비교를 하고싶다면?
		// new MemberTreeSet<Member>(new Member());
	}		
}
