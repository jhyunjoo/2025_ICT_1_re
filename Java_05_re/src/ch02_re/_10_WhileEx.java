package ch02_re;

public class _10_WhileEx {

	public static void main(String[] args) {
		/*
		 * while문으로 구구단 작성
		 * 2~9단까지 출력
		 * 
		 * ****************
		 * *** 구구단 출력 ***
		 * ****************
		 * === 2단 ===
		 * 2 * 1 = 2
		 * ...
		 * 2 * 9 = 18
		 * === 9단 ===
		 * 9 * 1 = 9
		 * ...
		 * 9 * 9 = 81
		 * ==========  마지막에 한번만
		 */
		
		int i = 2;
		while(i<=9) {
			System.out.println("=== " + i + "단 ===");
			int j = 1;
			while(j <= 9) {
				System.out.println(i + "*" +  j + "=" + (i*j));
				j++;
			}
			i++;
		}
	System.out.println("=========");
	}
}
