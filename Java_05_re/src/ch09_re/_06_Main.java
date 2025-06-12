package ch09_re;

public class _06_Main {
	
	public static void main(String[] args) {
		
		_06_IDFormat id = new _06_IDFormat();
		
		try {
			id.setUserId(null);
		} catch (_06_IDFormatException e) {
			e.printStackTrace();
			System.out.println("메시지 : " + e.getMessage());
		} finally {
			System.out.println("finally 부분");
		}
		
		System.out.println("정상 종료~..~");
		
		try {
			id.setUserId("1234567");
		} catch (_06_IDFormatException e) {
			e.printStackTrace();
			System.out.println("메시지 : " + e.getMessage());
		} finally {
			System.out.println("finally 부분");
		}
		
		System.out.println("정상 종료 ~..~");
		
	}

}
