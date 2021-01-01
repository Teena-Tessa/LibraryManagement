import java.util.Arrays;
import java.util.List;

public class Library {

	public static void main(String[] args) {
		
		Librarian librarian=new Librarian("Martin", "martin@gmail.com", "9895678467");

		Member mem1=new Member("Mark", "mark@gmail.com", "9895678467");
		Member mem2=new Member("Ann", "ann@gmail.com", "9895678467");
		Member mem3=new Member("Louis", "Louis@gmail.com", "9895678467");
		Member mem4=new Member("Juliet", "Juliet@gmail.com", "9895678467");
		Member mem5=new Member("David", "david@gmail.com", "9895678467");
		
		List<Member> members=Arrays.asList(mem1,mem2,mem3,mem4,mem5);
		
		Books book1=new Books(111,"The Alchemist",3);
		Books book2=new Books(112,"The God of Small things",2);
		Books book3=new Books(113,"The Diary of a Young Girl",3);
		Books book4=new Books(114,"The Gone Girl",1);
		Books book5=new Books(115,"Namesake",3);
		List<Books> books=Arrays.asList(book1,book2,book3,book4,book5);
BookItem item1=mem1.checkoutBook(book1);
mem1.checkinBook(item1);
//
//BookItem item3=mem2.checkoutBook(book4);
//
//BookItem item4=mem5.checkoutBook(book4);
//
//mem1.checkinBook(item2);
//mem2.checkinBook(item3);
//BookItem item5=mem5.checkoutBook(book4);
//BookItem item6=mem3.checkoutBook(book1);
//		mem4.checkoutBook(book1);
//		
//		librarian.blockMember(mem5);
//		mem5.checkoutBook(book1);
//		librarian.unblockMember(mem5);
//		mem5.checkoutBook(book1);
//		
//		
	librarian.printListOfMembers(members);	
	librarian.printListOfBooks(books);
//		
		
	}

}
