package ch03_re;

import java.util.Scanner;

public class _03_InOutEx {

	public static void main(String[] args) {
		
		// 두 수의 합 구하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		
		System.out.println("두 수의 합 : " + sum);
		
		sc.close();
	}
}
