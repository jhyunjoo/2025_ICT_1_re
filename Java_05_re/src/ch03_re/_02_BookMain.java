package ch03_re;

public class _02_BookMain {
	
	public static void main(String[] args) {
		
		_02_Book book1 = new _02_Book();
		book1.bookNo = 101;
		book1.bookTitle = "프로그래밍 입문";
		book1.bookAuthor = "김영숙";
		book1.bookPrice = 35000;
		
		book1.showInfo();
		
		System.out.println("---------------");
		
		_02_Book book2 = new _02_Book();
		book2.bookNo = 102;
		book2.bookTitle = "고급 프로그래밍";
		book2.bookAuthor = "권종열";
		book2.bookPrice = 40000;
		
		book2.showInfo();
	}

}
