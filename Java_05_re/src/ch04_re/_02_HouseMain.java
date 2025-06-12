package ch04_re;

public class _02_HouseMain {
	public static void main(String[] args) {
		
		_02_House house = new _02_House();
		
		house.setAddress("서대문구");
		house.setPrice(25000);
		house.setKind("빌라");
		house.setSize(25);
		house.setWindow(0);
		
		house.printInfo();
		
		System.out.println();
		
		_02_House house2 = new _02_House();
		
		house2.setAddress("마포구");
		house2.setPrice(55000);
		house2.setKind("주택");
		house2.setSize(30);
		house2.setWindow(1);
		
		System.out.println("위치 : " + house2.getAddress());
		System.out.println("가격 : " + house2.getPrice());
		System.out.println("종류 : " + house2.getKind());
		System.out.println("평수 : " + house2.getSize());
		if(house2.getWindow() == 1) {
			System.out.println("창문 있음");
		} else {
			System.out.println("창문 없음");
		}
	}

}
