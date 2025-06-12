package ch06_re;

public class _03_EmployeeMain {
	
	public static void main(String[] args) {
		
		System.out.println("[디폴트생성자 + setter]");
		_03_Manager m1 = new _03_Manager();
		m1.setSubun("E001");
		m1.setName("이유진");
		m1.setDeptName("기획실");
		m1.setSalary(100000);
		m1.setBonus(2000);
		m1.printInfo();
		
		System.out.println();
		
		System.out.println("[매개변수 생성자]");
		_03_Sawon s1 = new _03_Sawon("E002","박지은","기획실",800000,5000);
		s1.printInfo();
		
	}

}
