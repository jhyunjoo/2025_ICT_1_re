package ch04_re;

public class _10_StudentMain {
	public static void main(String[] args) {
		System.out.println(_10_Student.sarialNum);
		
		_10_Student student = new _10_Student();
		student.setName("서유원");
		student.printInfo();
		
		_10_Student student2 = new _10_Student(1002,"김서현");
		student2.printInfo();
	}

}
