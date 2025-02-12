
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
}
