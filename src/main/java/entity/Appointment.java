package entity;


import java.util.Date;

public class Appointment {

	private long bookId;
	private long studentId;
	private Date appointTime;
	
	private Book book;

	@Override
	public String toString() {
		return "Appointment [bookId=" + bookId + ", studentId=" + studentId + ", appointTime=" + appointTime + ", book="
				+ book + "]";
	}

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public Appointment(long bookId, long studentId, Date appointTime, Book book) {
		super();
		this.bookId = bookId;
		this.studentId = studentId;
		this.appointTime = appointTime;
		this.book = book;
	}

	public Date getAppointTime() {
		return appointTime;
	}

	public void setAppointTime(Date appointTime) {
		this.appointTime = appointTime;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
}
