package main;

public class Book {
	final String isbn;
	String title;
	int price;
	
	// 상수는 반드시 초기화를 해줘야 한다.
	public Book() {
		this.isbn = "";
	}
	public Book(String isbn,String title, int price) {
		this.isbn = isbn;
		this.title = title;
		this.price = price;
	}
	public String toString() {
		return String.format("ISBN: %s 이름 : %s 가격 : %d" ,  isbn , title , price);
	}
	
	
	
}
