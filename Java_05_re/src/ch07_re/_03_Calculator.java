package ch07_re;

public class _03_Calculator implements _03_Calc {

	@Override
	public int add(int n1, int n2) {
		return n1 + n2;
	}

	@Override
	public int sub(int n1, int n2) {
		return n1 - n2;
	}

	@Override
	public int mul(int n1, int n2) {
		return n1 * n2;
	}

	@Override
	public int div(int n1, int n2) {
		if(n2 != 0) {
			return n1 / n2;
		} else {
			return _03_Calc.ERROR;
		}
		
	}
	
	public void showInfo() {
		System.out.println("Calc Interface 구현");
	}

}
