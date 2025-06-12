package ch08_re;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _03_ArrayList {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("H");
		list.add("A");
		list.add("M");
		list.add("I");
		list.add("N");
		
		System.out.println("--- 기본 for문 ---");
		for(int i = 0; i  < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		System.out.println("--- 향상된 for문 ---");
		for(String str : list) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		System.out.println("--- Iterator 반복자 ---");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
	}

}
