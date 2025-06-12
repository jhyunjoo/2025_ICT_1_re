package ch01_re;

public class _07_VariableEx {

	public static void main(String[] args) {
		
		int a = 1, b = 11;
		System.out.println(a++ + --b * --a); // 1 + 10 * 1 = 11
		System.out.println(++a + --b * a--); // 2 + 9 * 2 = 20
		System.out.println(a++ + --b * a--); // 1 + 8 * 2 = 17
	}
}
