
public class LibraryApp {
	public static void main(String[] args) {
		Library myLibrary = new Library();
		Book myBookOne = new Book("A Clash of Kings", "George R.R. Martin", "9780553579901", 9.99);;
		myLibrary.addBook(myBookOne);
	}
}
