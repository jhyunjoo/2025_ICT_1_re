package ch03_re;

public class _01_StudentMain {
	
	public static void main(String[] args) {
		
		_01_Student st = new _01_Student();
		st.studentID = "S001";
		st.name = "김선아";
		st.email = "kim0526@gmail.com";
		st.address = "서울시 종로구";
		st.age = 32;
		st.myMoney = 30000;
		
		st.printInfo();
		
		System.out.println("---------------------");
		
		_01_Student st1 = new _01_Student();
		st1.studentID = "S002";
		st1.name = "전효연";
		st1.email = "jhy2025@gmail.com";
		st1.address = "서울시 관악구";
		st1.age = 23;
		st1.myMoney = 15000;
		
		st1.printInfo();
	}

}
