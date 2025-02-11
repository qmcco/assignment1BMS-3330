
import java.lang.String;

public class Book {
	private String title;
	private String author;
	private String ISBN;
	private double price;
	
	public Book() {
		title = "Unknown";
		author = "Unknown";
		ISBN = "Unknown";
		price = 0.0;
	}
	
	public Book(String title, String author, String ISBN, double price) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	}
	
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
	
	public String toString() {
		String bookStr = this.title + " written by " + this.author + " is " + this.price + " and has ISBN " + this.ISBN;
		return bookStr;
	}
}
