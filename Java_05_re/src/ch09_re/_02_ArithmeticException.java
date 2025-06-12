package ch09_re;

import java.util.Scanner;

public class _02_ArithmeticException {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 값 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("두번째 값 입력 : ");
		int n2 = sc.nextInt();
		
		try {
			System.out.println("몫 : " + (n1 / n2));
			System.out.println("나머지 : " + (n1 % n2));
		} catch(java.lang.ArithmeticException e) {
			System.out.println("예외 처리 메시지 : " + e.getMessage());
		} finally {
			System.out.println("finally 부분");
			sc.close();
		}
		
		System.out.println("정상종료됨");
		
	}
}
