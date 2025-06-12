package ch06_re;

public class _03_Employee {
	
	// 멤버변수
	private String sabun;
	private String name;
	private String deptName;
	private int salary;
	
	// 디폴트 생성자
	public _03_Employee() {}
	
	// 매개변수 생성자
	public _03_Employee(String sabun, String name, String deptName, int salary) {
		this.sabun = sabun;
		this.name = name;
		this.deptName = deptName;
		this.salary = salary;
	}
	
	// getter setter
	public String getSabun() {
		return sabun;
	}
	public void setSubun(String sabun) {
		this.sabun = sabun;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	// 출력
	public void printInfo() {
		System.out.println("사번 : " + sabun);
		System.out.println("이름 : " + name);
		System.out.println("부서 : " + deptName);
		System.out.println("급여 : " + salary);
	}

}
