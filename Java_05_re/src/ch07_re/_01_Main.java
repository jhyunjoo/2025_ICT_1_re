package ch07_re;

public class _01_Main {
	
	public static void main(String[] args) {
		_01_Computer desk = new _01_DeskTop();
		desk.turnOn();
		desk.display();
		desk.typing();
		desk.turnOff();
		
		System.out.println();
		
		_01_Computer notebook = new _01_MyNoteBook();
		notebook.turnOn();
		notebook.display();
		notebook.typing();
		notebook.turnOff();
	}

}
