package ch07_re;

public class _04_SamsungTV implements _04_TV{

	@Override
	public void turnOn() {
		System.out.println(_04_TV.BRAND + "TV를 켜다.");
	}

	@Override
	public void turnOff() {
		System.out.println(_04_TV.BRAND + "TV를 끄다.");
	}

}
