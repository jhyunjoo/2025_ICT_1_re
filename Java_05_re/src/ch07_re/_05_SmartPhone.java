package ch07_re;

public class _05_SmartPhone extends _05_PDA implements _05_Mobile, _05_MP3{

	
	@Override
	public void play() {
		System.out.println("음악을 틀다.");
	}

	@Override
	public void stop() {
		System.out.println("음악을 멈추다.");
	}

	@Override
	public void sendSMS() {
		System.out.println("문자를 보내다.");
	}

	@Override
	public void receivesSMS() {
		System.out.println("문자를 받다.");
	}

	@Override
	public int calculator(int n1, int n2)  {
		return n1 - n2;
	}
	
}
