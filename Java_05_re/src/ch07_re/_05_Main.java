package ch07_re;


public class _05_Main {
	
	public static void main(String[] args) {
		System.out.println("부모는 인터페이스");
		System.out.println("_05_Mobile 타입");
		_05_Mobile mobile = new _05_SmartPhone();
		mobile.sendSMS();
		mobile.receivesSMS();
		_05_SmartPhone sphone1 = (_05_SmartPhone)mobile;
		sphone1.play();
		sphone1.stop();
		System.out.println("cal : " + sphone1.calculator(11,5));
		
		System.out.println();
		
		System.out.println("_05_MP3 타입");
		_05_MP3 mp3 = new _05_SmartPhone();
		mp3.play();
		mp3.stop();
		_05_SmartPhone sphone2 = (_05_SmartPhone)mp3;
		sphone2.sendSMS();
		sphone2.receivesSMS();
		System.out.println("cal : " + sphone2.calculator(9,7));
		
		System.out.println();
		
		System.out.println("부모는 클래스");
		_05_PDA pda = new _05_SmartPhone();
		_05_SmartPhone sphone3 = (_05_SmartPhone) pda;
		sphone3.sendSMS();
		sphone3.receivesSMS();
		sphone3.play();
		sphone3.stop();
		System.out.println("cal : " + pda.calculator(15,3));
		
		
	}

}
