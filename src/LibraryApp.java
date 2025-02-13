
public class LibraryApp {
	public static void main(String[] args) {
		
		Library myLibrary = new Library();
		
		Book myBookOne = new Book("A Clash of Kings", "George R.R. Martin", "9780553579901", 9.99);
		myLibrary.addBook(myBookOne);
		
		Book myBookTwo = new Book("The Hobbit", "J. R. R. Tolkien", "9780345445605", 10.69);
		myLibrary.addBook(myBookTwo);
		
		Book myBookThree = new Book("The Terminal List", "Jack Carr", "9783986760168", 15.00);
		myLibrary.addBook(myBookThree);
		
		myLibrary.searchByISBN("9780345445605");
		
		myLibrary.displayBooks();
		
		myLibrary.removeBook(myBookThree);
		
		myLibrary.displayBooks();
		
		myLibrary.removeBook(myBookThree);
	}
}
