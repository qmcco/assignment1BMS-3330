
import java.lang.String;

public class Book {
	private String title;
	private String author;
	private String ISBN;
	private double price;
	
	/**
	 * This is the default constructor, it initializes the title, author, ISBN, and price.
	 * @param title: This field holds the title of the book.
	 * @param author: This filed stores the name of the author.
	 * @param ISBN: This field stores the ISBN of the book.
	 * @param price: This field stores the price of the book as a double.
	 */
	public Book() {
		title = "Unknown";
		author = "Unknown";
		ISBN = "Unknown";
		price = 0.0;
	}
	
	/**
	 * This is the parameterized constructor, it sets all of the attributes of 
	 * 	the book using the given parameters.
	 * @param title: Sets the title attribute.
	 * @param author: Sets the author attribute.
	 * @param ISBN: Sets the ISBN attribute.
	 * @param price: Sets the price attribute.
	 */
	public Book(String title, String author, String ISBN, double price) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	}
	
	/**
	 * This is the copy constructor, it creates a new book object using a reference to another book.
	 * @param copy
	 */
	public Book (Book other) {
		this.title = other.title;
		this.author = other.author;
		this.ISBN = other.ISBN;
		this.price = other.price;
	}
	
	/**
	 * These are the getter methods for each book attribute. They simply return
	 * the value stored in the specified field.
	 */
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public String getISBN() {
		return this.ISBN;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	/**
	 * These are the setter methods for each book attribute. They take a value
	 * for a specified filed, and set it to that field.
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * This method returns a string with the information about the book.
	 */
	@Override
	public String toString() {
		String bookStr = this.title + " by " + this.author + " (ISBN: " + this.ISBN + ", $" + this.price + ")";
		return bookStr;
	}
	
	/**
	 * This method checks if two of books have the same ISBN.
	 */
	@Override
	public boolean equals(Object other) {
		if(other instanceof Book) {
			if(this.ISBN == ((Book)other).ISBN) {
				return true;
			}
		}
		return false;
	}
}
