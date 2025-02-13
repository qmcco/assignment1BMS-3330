
public class Library {
	private Book[] books = new Book[5];
	private int count;
	
	public Library() {
		for(int i = 0; i < 5; i++) {
			books[i] = null;
		}
		count = 0;
	}
	
	public boolean addBook(Book book) {
		int empCheck = 0;
		for(int i = 0; i < 5; i++) {
			if(this.books[i] == null && empCheck == 0) {
				empCheck = i;
			}
		}
		if(empCheck != 0) {
			this.books[empCheck] = book;
			this.count++;
			System.out.println("Book sucessfully added to position " + empCheck);
			return true;
		}
		System.out.println("ERROR: Book not added, no space remaining");
		return false;
	}
	
	public boolean removeBook(Book book) {
		for(int i = 0; i < books.length; i++) {
			if(this.books[i] != null) {
				if(this.books[i].equals(book)) {
					System.out.println("Removing book: " + book);
					this.count--;
					books[i] = null;
					return true;
				}
			}
		}
		System.out.println("Cannot Remove book: " + book);
		return false;
	}
	
	public Book searchByISBN(String ISBN) {
		System.out.println("Searching for book with ISBN: " + ISBN + "...");
		for(int i = 0; i < books.length; i++) {
			if(this.books[i] != null) {
				if (this.books[i].getISBN().equals(ISBN)) {
					System.out.println("Book found: " + this.books[i].toString());
					return this.books[i];
				}
			}
		}
		return null;
	}
	
	public void displayBooks() {
		System.out.println("All books in the library:");
		for(int i = 0; i < books.length; i++) {
			if (this.books[i] != null) {
				System.out.println((i) + ". " + this.books[i].toString());
			}
		}
	}
	
}
