package ch09_re;

public class _01_ArrayException {
	
	public static void main(String[] args) {
		
		int[] ary = new int[5];
		
		try {
			for(int i = 0; i <= ary.length; i++) {
				ary[i] = i;
				System.out.println(ary[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 처리 메시지 : " + e.getMessage());
		} finally {
			System.out.println("finally 부분");
		}
		
		System.out.println("정상 종료~__~");
		
	}

}
