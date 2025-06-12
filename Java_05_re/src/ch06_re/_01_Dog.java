package ch06_re;

public class _01_Dog extends _01_Animal{

	private String stroll;
	
	public _01_Dog() {
		System.out.println("_01_Dog 생성자");
	}
	
	public String getStroll() {
		return stroll;
	}
	public void setStroll(String stroll) {
		this.stroll = stroll;
	}
	
	public void bark() {
		System.out.println("멍먕믕뮹묭므르르르르멍");
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("특징 : " + stroll);
		System.out.print("울음소리 : ");
		bark();
	}
	
}
