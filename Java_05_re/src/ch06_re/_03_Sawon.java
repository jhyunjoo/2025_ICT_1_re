package ch06_re;

public class _03_Sawon extends _03_Employee {
	
	// 멤버변수
	private int sudang;
	
	// 디폴트생성자
	public _03_Sawon() {}
	
	// 매개변수 생성자
	public _03_Sawon(String sabun, String name, String deptName, int salary, int sudang) {
		super(sabun,name,deptName,salary);
		this.sudang = sudang;
	}
	
	// getter setter
	public int getSudang() {
		return sudang;
	}
	public void setSudang(int sudang) {
		this.sudang = sudang;
	}
	
	// 출력
	public void printInfo() {
		super.printInfo();
		System.out.println("수당 : " + sudang);
	}

}
