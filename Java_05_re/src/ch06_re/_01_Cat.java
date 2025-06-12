package ch06_re;

public class _01_Cat extends _01_Animal{
	
	private String cute;
	
	public _01_Cat() {
		System.out.println("_01_Cat 생성자");
	}
	
	public String getCute() {
		return cute;
	}
	public void setCute(String cute) {
		this.cute = cute;
	}
	
	public void cry() {
		System.out.println("냐아아아옹냥녕뇽늉");
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("특징 : " + cute);
		System.out.print("울음소리 : ");
		cry();
	}

}
