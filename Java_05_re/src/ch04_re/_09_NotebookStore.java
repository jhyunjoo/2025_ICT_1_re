package ch04_re;

public class _09_NotebookStore {
	
	private _09_Notebook notebook;
	
	public _09_NotebookStore() {}
	
	public _09_NotebookStore(_09_Notebook notebook) {
		this.notebook = notebook;
	}
	
	public _09_Notebook sellNotebook(String model, String name, double money) {
		if(model.equals(notebook.getModel()) && money >= notebook.getPrice()) {
			guestInfo(model,name,money);
			discountPromotion();
			return notebook;
		} else {
			return null;
		}
		
	}
	
	private void guestInfo(String model, String name, double money) {
		System.out.println("고객정보 : " + model + " , " + name + " , " + money +  "," );
	}
	private void discountPromotion() {
		System.out.printf("대리점 : 프로모션을 할인합니다. %.1f 원에 구매 가능합니다.\n", notebook.getDiscount());
	}
	
	public void printInfo() {
		System.out.println("notebook : " + notebook);
	}

}
