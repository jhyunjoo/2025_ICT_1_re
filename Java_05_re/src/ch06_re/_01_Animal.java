package ch06_re;

public class _01_Animal {
	
	private String kind;
	private int legs;
	private double weight;
	
	public _01_Animal() {
		System.out.println("_01_Animal 생성자");
	}
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void printInfo() {
		System.out.println("종류 : " + kind);
		System.out.println("다리 개수 : " + legs);
		System.out.println("체중 : " + weight);
	}

}
