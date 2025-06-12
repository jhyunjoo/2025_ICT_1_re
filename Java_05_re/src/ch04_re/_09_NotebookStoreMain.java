package ch04_re;

public class _09_NotebookStoreMain {
	
	public static void main(String[] args) {
		
		System.out.println("----- 노트북 정보 (Notebook) -----");
		_09_Notebook notebook = new _09_Notebook("그램",2500000);
		notebook.printInfo();
		
		System.out.println("----- 대리점 정보 (NotebookStore) -----");
		_09_NotebookStore store = new _09_NotebookStore(notebook);
		store.printInfo();
		
		System.out.println("----- 구매고객 정보 (Guest) -----");
		_09_Guest guest = new _09_Guest("지현주",2500000);
		guest.printInfo();
		
		System.out.println();
		
		guest.buyNotebook(store);
		
	}

}
