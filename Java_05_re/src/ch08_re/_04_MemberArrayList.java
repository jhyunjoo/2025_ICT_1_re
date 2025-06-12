package ch08_re;

import java.util.ArrayList;
import java.util.Iterator;

public class _04_MemberArrayList {
	
	private ArrayList<_04_Member> list;
	
	public _04_MemberArrayList() {
		list = new ArrayList<_04_Member>();
	}
	
	public void addMember(_04_Member member) {
		list.add(member);
	}
	
	public boolean removeMember(int memberId) {
		for (int i = 0; i < list.size(); i++) {
			_04_Member member = list.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				list.remove(i);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		System.out.println("<<< 향상된 for문 >>>");
		for(_04_Member member : list ) {
			System.out.println(member);
		}
		System.out.println();
		
		System.out.println("<<< Iterator 반복자 >>>");
		Iterator<_04_Member> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
