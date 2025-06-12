package ch04_re;

import java.util.Scanner;

public class _09_Guest {
	
	private String name;	// 고객명
	private double myMoney;	// 예산
	
	public _09_Guest() {}
	
	public _09_Guest(String name, double myMoney) {
		this.name = name;
		this.myMoney = myMoney;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getMyMoney() {
		return myMoney;
	}
	public void setMyMoney(double myMoney) {
		this.myMoney = myMoney;
	}
	
	// 구매메서드
	public void buyNotebook(_09_NotebookStore store) {
		Scanner sc= new Scanner(System.in);
		System.out.print("구입하고 싶은 모델 : ");
		String model = sc.next();
		//_09_Notebook notebook = store.sellNotebook("그램",name,myMoney);
		_09_Notebook notebook = store.sellNotebook(model,name,myMoney);
		if (notebook != null) {
			System.out.println("고객 : 노트북 구입이 완료되었습니다.");
		} else {
			System.out.println("고객 : 노트북 구입하지 못했습니다. ");
		}
		sc.close();
	}
	
	public void printInfo() {
		System.out.println("고객명 : " + name);
		System.out.println("myMoney : " + myMoney);
	}

}
