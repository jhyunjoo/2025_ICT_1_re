package ch04_re;

public class _09_Notebook {
	
	private String model;	// 그램
	private double price;	// 2500000
	private double discount;

	public _09_Notebook() {}
	
	public _09_Notebook(String model, double price) {
		this.model = model;
		this.price = price;
		discount = price * 0.99;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getDiscount() {
		return discount;
	}
	
	public void printInfo() {
		System.out.println("model : " + model);
		System.out.println("가격 : " + price);
		System.out.println("할인 : " + discount);
	}

}
