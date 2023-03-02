package LAB;

public class Library {
private int bookId;
private String bookName;
private String bookAuthor;
 public void addBook() {
System.out.println("Add Book Quantity");
 }
 public void dispanseBook() {
	 System.out.println("Dispanse Service");
 }
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getBookAuthor() {
	return bookAuthor;
}
public void setBookAuthor(String bookAuthor) {
	this.bookAuthor = bookAuthor;
}

}
