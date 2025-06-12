package ch03_re;

public class _02_Book {
	
	// 책번호, 책제목, 책저자, 책가격
	int bookNo;
	String bookTitle;
	String bookAuthor;
	int bookPrice;
	
	public void showInfo() {
		System.out.println("책번호 : " + bookNo);
		System.out.println("책제목 : " + bookTitle);
		System.out.println("책저자 : " + bookAuthor);
		System.out.println("책가격 : " + bookPrice);
	}

}
