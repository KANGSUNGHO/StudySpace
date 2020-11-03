package prob02;

public class Book {
	private int bookNo;
	public static int statecode;
	private String title;
	private String author;
	
	public Book() {
		this.statecode = 1;
	}
	public Book(int bookNo, String title, String author) {
		this();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
	}
	
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void rent() {
		
	}
	
	public void print() {
		
	}
}
