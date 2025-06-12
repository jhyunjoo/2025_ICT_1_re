package ch04_re;

public class _01_CalMain {
	
	public static void main(String[] args) {
		
		_01_Calculator cal = new _01_Calculator();
		
		double num1 = 11.0;
		double num2 = 5.0;
		
		System.out.println("더하기 : " + cal.add(num1, num2));
		System.out.println("빼기 : " + cal.sub(num1, num2));
		System.out.println("곱하기 : " + cal.mul(num1, num2));
		System.out.println("나누기 : " + cal.div(num1, num2));
	}

}
