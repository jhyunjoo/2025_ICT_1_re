package ch05_re;

public class _01_ArrayEx {
	public static void main(String[] args) {
		
		int[] num = new int[10];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = i + 1;
			System.out.printf("num[%d] : %d\n",i,num[i]);
		}
		
		System.out.println();
		
		// 향상된 for 문
		for(int n : num) {
			System.out.print(n + " ");
		}
	}

}
