package ch03_re;

import java.util.Scanner;

public class _04_InOutEx {
	
	public static void main(String[] args) {
		// 콘솔창에 이름, 나이, 이메일을 입력받아 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("이메일 : ");
		String email = sc.next();
		
		System.out.println(name + "/" + age + "/" + email);
		
		sc.close();
	}

}
