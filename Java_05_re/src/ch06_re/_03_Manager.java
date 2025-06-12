package ch06_re;

public class _03_Manager extends _03_Employee {
	
	// 멤버변수
	private int bonus;
	
	// 디폴트 생성자
	public _03_Manager() {}
	
	// 매개변수 생성자
	public _03_Manager(String sabun, String name, String deptName, int salary, int bonus) {
		super(sabun,name,deptName,salary);
		this.bonus = bonus;
	}
	
	// getter setter
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	// 출력
	public void printInfo() {
		super.printInfo();
		System.out.println("보너스 : " + bonus);
	}

}
