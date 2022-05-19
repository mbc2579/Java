package ch12;

public class Book {
	
	// 객체 배열 사용 예제

	private String title;
	private String author;
	
	public Book() {}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println(title + "," + author);
	}
}
