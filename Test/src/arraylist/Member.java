package arraylist;
public class Member implements Comparable<Member> {
	private int memberId;
	private String memberName;
	public Member(int memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}
	public Member() {
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
	public int hashCode() {
		return this.memberId;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId == member.memberId) {
				return true;
			}
			return false;
		}
		return false;
	}
	@Override
	// hashSet 오름차순
	public int compareTo(Member member) {
		return (this.memberId - member.getMemberId()); // 양수 시 오름차순
	}
	@Override
	public String toString() {
		return memberId + " " + memberName; 
	}
}
