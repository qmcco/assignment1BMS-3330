
public class Library {
	private Book[] books = new Book[5];
	private int count;
	
	public boolean addBook(Book book) {
		int empCheck = 0;
		for(int i = 0; i < 5; i++) {
			if(this.books[i] == null) {
				empCheck = i;
			}
		}
		if(empCheck != 0) {
			this.books[empCheck] = book;
			this.count++;
			return true;
		}
		return false;
	}
}
