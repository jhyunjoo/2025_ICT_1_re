package ch04_re;

public class _03_Book {
	
	// 책번호, 책제목, 책저자
	private int bookNo;
	private String bookTitle;
	private String bookAuthor;
	
	// 멤버메서드
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	// 출력
	public void printInfo() {
		System.out.println("책번호 : " + bookNo);
		System.out.println("책제목 : "  + bookTitle);
		System.out.println("첵저자 : " + bookAuthor);
	}

}
