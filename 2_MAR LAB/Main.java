package LAB;

public class Main {
public static void main(String[] args) {
	Library l1=  new Library();
	//l1.addBook(564, "Computer Fundamental", "Dr. Rajaraman");
//l1.dispanseBook();
	//l1.addBook();
	//l1.dispanseBook();
	l1.setBookId(101);
	l1.setBookAuthor("Dr.Rajraman");
	l1.setBookName("Computer Fundamental");
	System.out.println("Book ID:"+l1.getBookId());
	System.out.println("Book Author Name:"+l1.getBookAuthor());
	System.out.println("Book Name:"+l1.getBookName());
}
}
