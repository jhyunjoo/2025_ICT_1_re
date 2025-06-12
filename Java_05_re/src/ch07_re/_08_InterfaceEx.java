package ch07_re;

public class _08_InterfaceEx {
	
	public static void main(String[] args) {
		// methodA() 호출
		A08 a08 = new A08();
		a08.methodA();
	}

}

class A08 {
	public void methodA() {
		I08 i08 = InstanceManager.getInstance();
		i08.methodB();
	}
}

interface I08 {
	public void methodB();
}

class B08 implements I08 {
	
	public B08() {
		System.out.println("B08 디폴트 생성자 호출");
	}
	@Override
	public void methodB() {
		System.out.println("B08클래스 - methodB()");
	}
}

class InstanceManager {
	public static I08 getInstance() {
		return new B08();
	}
}