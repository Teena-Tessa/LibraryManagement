import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Member extends Person{

	private int totalBooksCheckedout;
	private AccountStatus astatus=AccountStatus.ACTIVE;
	
	public Member(String name, String email, String phone) {
		super(name, email, phone);
		// TODO Auto-generated constructor stub
	}
	public int getTotalBooksCheckedout() {
		return totalBooksCheckedout;
	}
	public void setTotalBooksCheckedout(int totalBooksCheckedout) {
		this.totalBooksCheckedout = totalBooksCheckedout;
	}
	public AccountStatus getAstatus() {
		return astatus;
	}
	public void setAstatus(AccountStatus astatus) {
		this.astatus = astatus;
	}
	
	

	
	@Override
	public String toString() {
		return "Member [totalBooksCheckedout=" + totalBooksCheckedout + ", astatus=" + astatus + ", name=" + name + "]";
	}
	public BookItem checkoutBook(Books book)
	{
		if(book.getNoOfCopies()==0)
		{
			System.out.println("Book copy not available to lend");
			return null;
		}
			else if(this.getAstatus()!=AccountStatus.ACTIVE)
		{
			System.out.println("Not an active member not eligible to borrow");
			return null;
		}
		else
		{
			Date date= Calendar.getInstance().getTime();
			long due=date.getTime()+8*24*60*60*1000;
			Date duedate=new Date(due);
			BookStatus st=BookStatus.LOANED;
			BookItem item =new BookItem(date,duedate,book,st);
			item.checkout();
			
			return item;		
		}
		
	}
	
	public void checkinBook(BookItem item)
	{
		item.checkin();
	}
}
