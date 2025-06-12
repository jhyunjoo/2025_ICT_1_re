package ch04_re;

public class _02_House {

	// 위치, 가격, 종류, 평수, 창문여부
	private String address;
	private int price;
	private String kind;
	private int size;
	private int window;

	// 멤버메서드
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public int getWindow() {
		return window;
	}
	public void setWindow(int window) {
		this.window = window;
	}
	
	// 출력
	public void printInfo() {
		System.out.println("위치 : " + address);
		System.out.println("가격 : " + price);
		System.out.println("종류 : " + kind);
		System.out.println("평수 : " + size);
		if (window == 1) {
			System.out.println("창문 있음");
		} else {
			System.out.println("창문 없음");
		}
	}
}
