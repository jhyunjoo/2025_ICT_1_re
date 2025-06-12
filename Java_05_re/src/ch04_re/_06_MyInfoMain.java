package ch04_re;

public class _06_MyInfoMain {
	public static void main(String[] args) {
		
		_06_MyInfo my = new _06_MyInfo();
		
		my.setName("지현주");
		my.setAge(23);
		my.setAddress("서울시");
		my.setEmail("hyunj02@gmail.com");
		my.setDream("냥냥");
		
		my.printInfo();
		
		System.out.println();
		
		_06_MyInfo my2 = new _06_MyInfo("현주",24,"성동구","joo2025@gmail.com","먕먕");
		my2.printInfo();
	}

}
