package ch08_re;

public class _04_Member {
	
	private int memberId;
	private String memberName;
	
	public _04_Member() {
		super();
	}

	public _04_Member(int memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "회원 id : " + memberId + ", 회원명 : " + memberName;
	}
	
}
