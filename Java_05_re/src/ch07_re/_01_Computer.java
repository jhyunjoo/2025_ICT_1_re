package ch07_re;

public abstract class _01_Computer {
	
	// 일반메서드
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
	// 추상메서드
	abstract public void display();
	abstract public void typing();

}
