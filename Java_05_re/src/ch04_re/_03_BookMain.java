package ch04_re;

public class _03_BookMain {
	public static void main(String[] args) {
		_03_Book book = new _03_Book();
		
		book.setBookNo(1101);
		book.setBookTitle("숲의 아이");
		book.setBookAuthor("아이");
		
		book.printInfo();
		
		System.out.println("");
		
		_03_Book book2 = new _03_Book();
		
		book2.setBookNo(1102);
		book2.setBookTitle("까만고양이");
		book2.setBookAuthor("냥");
		
		System.out.println("책번호 : " + book2.getBookNo());
		System.out.println("책제목 : " + book2.getBookTitle());
		System.out.println("책저자 : " + book2.getBookAuthor());
	}

}
