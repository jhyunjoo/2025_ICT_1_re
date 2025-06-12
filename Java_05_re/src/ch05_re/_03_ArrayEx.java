package ch05_re;

public class _03_ArrayEx {

	public static void main(String[] args) {
		int[][] num = {{1,2,3},
					   {4,5,6},
					   {7,8,9}};
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			} // for j
			System.out.println();
		} // for i
		
		
		int[][] num1 = new int[9][8];
		
		for(int i = 0; i < num1.length; i++) {
			for(int j = 0; j < num1[i].length; j++) {
				num1[i][j] = (j+2) * (i+1);
				System.out.printf("%d * %d = %d\t", j+2,i+1, num1[i][j]);
			} // for j
			System.out.println();
		} // for i
	}
}
