
public class Books {

	
	private int ISBN;
	private String title;
	private int noOfCopies;
	@Override
	public String toString() {
		return "Books [ISBN=" + ISBN + ", title=" + title + ", noOfCopies=" + noOfCopies + "]";
	}
	public Books(int iSBN, String title, int noOfCopies) {
		super();
		ISBN = iSBN;
		this.title = title;
		this.noOfCopies = noOfCopies;
	}
	public int getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
