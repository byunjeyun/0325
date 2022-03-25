package java0325_02;

public class Book {
	String title;
	String author;
	
	public Book(String title) {
		this.title = title;
		author = "작자미상";
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

}