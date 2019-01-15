package entity;

public class Book {
	private long bookId;
	private String name;
	private int number;
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Book(long bookId, String name, int number) {
		
		this.bookId = bookId;
		this.name = name;
		this.number = number;
	}
	@Override
	public String toString() {
		return "book [bookId=" + bookId + ", name=" + name + ", number=" + number + "]";
	}
	public Book(){
		
	}

}
