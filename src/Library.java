
public class Library {
	private Book[] books = new Book[5];
	private int count;
	
	public Library() {
		for(int i = 0; i < 5; i++) {
			books[i] = null;
		}
		count = 0;
	}
	
	/**
	 * This method adds the given book to the book array as long as it isn't full.
	 * @param Book book: A book object is passed so that it can be added to the array.
	 * @return Returns true or false based on whether the book was found.
	 */
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
	
	/**
	 * This method removes the given book from the array.
	 * @param Book book: A book object is passed so that it can be removed if it exists in the array.
	 * @return Returns true or false based on whether the book was successfully removed.
	 */
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
	
	/**
	 * This method iterates through the array and if the given ISBN matches the ISBN of a book in the
	 * 	array, the book is returned. If it isn't found, null is returned.
	 * @param String ISBN: The ISBN that is being searched for.
	 * @return If the book with the given ISBN is found, it is returned. If it isn't found, null is returned.
	 */
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
	
	/**
	 * This method iterates through the book array and uses toString to print each book neatly.
	 */
	public void displayBooks() {
		System.out.println("All books in the library:");
		for(int i = 0; i < books.length; i++) {
			if (this.books[i] != null) {
				System.out.println((i) + ". " + this.books[i].toString());
			}
		}
	}
	
}
