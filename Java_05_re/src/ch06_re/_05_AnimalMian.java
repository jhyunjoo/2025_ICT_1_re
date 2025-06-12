package ch06_re;

public class _05_AnimalMian {
	
	public static void main(String[] args) {
		moveAnimal(new _05_Animal());
		moveAnimal(new _05_Human());
		moveAnimal(new _05_Tiger());
		moveAnimal(new _05_Eagle());
	}
	
	public static void moveAnimal(_05_Animal animal) {
		animal.move();
		if(animal instanceof _05_Human) {
			_05_Human human = (_05_Human)animal;
			human.readBook();
		} else if (animal instanceof _05_Tiger) {
			_05_Tiger tiger = (_05_Tiger)animal;
			tiger.hunting();
		} else if (animal instanceof _05_Eagle) {
			_05_Eagle eagle = (_05_Eagle)animal;
			eagle.flying();
		} else {}
	}

}
