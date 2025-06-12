package ch08_re;

import java.util.ArrayList;
import java.util.List;

public class _01_ArrayList {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("초코");
		list.add("딸기");
		list.add("바닐라");
		list.add("녹차");
		list.add("커피");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
		
		System.out.println();
		
		for(String i : list) {
			System.out.println(i);
		}
		
		System.out.println();
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(11);
		list2.add(1);
		list2.add(3);
		list2.add(12);
		list2.add(5);
		
		for(int i = 0; i < list2.size(); i++) {
			System.out.print(list2.get(i) + "\t");
		}
		
		System.out.println();
		
		for(int i : list2) {
			System.out.println(i);
		}
	}

}
