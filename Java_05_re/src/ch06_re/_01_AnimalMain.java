package ch06_re;

public class _01_AnimalMain {
	
	public static void main(String[] args) {
		_01_Cat cat = new _01_Cat();
		cat.setKind("고양이");
		cat.setLegs(4);
		cat.setWeight(2.3);
		cat.setCute("귀여워");
		cat.printInfo();
		
		System.out.println();
		
		_01_Dog dog = new _01_Dog();
		dog.setKind("강아지");
		dog.setLegs(4);
		dog.setWeight(3.5);
		dog.setStroll("산책");
		dog.printInfo();
	}

}
