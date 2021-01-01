import java.util.Date;

public class BookItem  {
	
	private Date borrowed;
	private Date dueDate;
	private Books book;
	public Books getBook() {
		return book;
	}
	public void setBook(Books book) {
		this.book = book;
	}

	private BookStatus status;
	

	public Date getBorrowed() {
		return borrowed;
	}
	public void setBorrowed(Date borrowed) {
		this.borrowed = borrowed;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public BookStatus getStatus() {
		return status;
	}
	public void setStatus(BookStatus status) {
		this.status = status;
	}
	public BookItem(Date borrowed, Date dueDate, Books book, BookStatus status) {
		super();
		this.borrowed = borrowed;
		this.dueDate = dueDate;
		this.book = book;
		this.status = status;
	}

	public void checkout()
	{
		this.book.setNoOfCopies(this.book.getNoOfCopies()-1);
		this.status=BookStatus.LOANED;
		
		System.out.println("the book "+this.book.getTitle()+" lended"
				+ " number of copies remaining :"+this.book.getNoOfCopies()
				+" to be returned on "+this.getDueDate());
	}
	
	public void checkin()
	{
		this.book.setNoOfCopies(this.book.getNoOfCopies()+1);
		this.status=BookStatus.AVAILABLE;
		
		System.out.println("the book "+this.book.getTitle()+" returned successfully"
				+ " number of copies remaining :"+this.book.getNoOfCopies());
		
	}
	
	

}
