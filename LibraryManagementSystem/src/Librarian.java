import java.util.List;

public class Librarian extends Person{

	public Librarian(String name, String email, String phone) {
		super(name, email, phone);
		// TODO Auto-generated constructor stub
	}

	
	public void blockMember(Member member)
	{
		member.setAstatus(AccountStatus.BLACKLISTED);
		System.out.println(member.getName()+"'s access blocked");
	}
	
	public void unblockMember(Member member)
	{
		member.setAstatus(AccountStatus.ACTIVE);
		System.out.println(member.getName()+"'s account activated");
	}
	
	public void printListOfMembers(List<Member> members)
	{
		for(Member mem : members)
			System.out.println(mem);
	}
	

	public void printListOfBooks(List<Books> books)
	{
		for(Books book : books)
			System.out.println(book);
	}
	
}
