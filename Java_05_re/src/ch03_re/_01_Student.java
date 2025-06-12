package ch03_re;

public class _01_Student {

	// 학번, 이름, 이메일, 주소, 나이, 용돈
	String studentID;
	String name;
	String email;
	String address;
	int age;
	int myMoney;
	
	public void printInfo() {
		System.out.println("학번 : " + studentID);
		System.out.println("이름 : " + name);
		System.out.println("이메일 : " + email);
		System.out.println("주소 : " + address);
		System.out.println("나이 : " + age);
		System.out.println("용돈 : " + myMoney);
	}
}
