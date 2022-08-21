package arraylist_test;
public class Member {
	private int memberId;
	private String memberName;
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
	// hashcode
	// equals
	@Override
	public int hashCode() {
		return this.memberId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			int temp = ((Member)obj).getMemberId();
			if(this.memberId == temp) {
				return true;
			}
			return false;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return memberId + "  " + memberName;
	}
}


