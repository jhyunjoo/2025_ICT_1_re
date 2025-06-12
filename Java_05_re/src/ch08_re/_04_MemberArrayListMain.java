package ch08_re;

public class _04_MemberArrayListMain {
	
	public static void main(String[] args) {
		
		_04_MemberArrayList mlist = new _04_MemberArrayList();
		
		_04_Member lee = new _04_Member(1001,"이화윤");
		_04_Member son = new _04_Member(1002,"손수진");
		_04_Member park = new _04_Member(1003,"박형원");
		_04_Member hong = new _04_Member(1004,"홍태산");
		
		mlist.addMember(lee);
		mlist.addMember(son);
		mlist.addMember(park);
		mlist.addMember(hong);
		
		mlist.showAllMember();
		System.out.println();
		
		System.out.println("--- 1004 삭제 ---");
		mlist.removeMember(hong.getMemberId());
		mlist.showAllMember();
		
		System.out.println();
		
		System.out.println("--- 1005 삭제 ---");
		mlist.removeMember(1005);
		mlist.showAllMember();
		
	}

}
