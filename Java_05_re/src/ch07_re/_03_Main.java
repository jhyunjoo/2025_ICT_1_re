package ch07_re;

public class _03_Main {
	
	public static void main(String[] args) {
		
		int num1 = 11;
		int num2 = 5;
		
		_03_Calc cal = new _03_Calculator();
		
		System.out.println("덧셈 : " + cal.add(num1, num2));
		System.out.println("뺄셈 : " + cal.sub(num1, num2));
		System.out.println("곱셈 : " + cal.mul(num1, num2));
		System.out.println("나눗셈 : " + cal.div(num1, num2));
		
		
		System.out.println();
		
		_03_Calculator cal2 = (_03_Calculator) cal;
		cal2.showInfo();

	}

}
