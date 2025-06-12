package ch09_re;

import java.util.Scanner;

public class _04_ThrowsException {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		try {
			int age = readAge();
			System.out.println("나이 : " + age);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("메시지 : " + e.getMessage());
		} finally {
			System.out.println("finally 부분");
			sc.close();
		}
		
	}
	
	public static int readAge() throws Exception {
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		if(age < 0) {
			throw new Exception("나이는 0이상으로 입력해주세요");
		}
		return 0;
	}

}
