package main;

import java.util.HashMap;
import java.util.Scanner;

public class BookManager {
	Scanner scan;
	HashMap<String,Book> book_dic;
	public BookManager() {
		 scan = new Scanner(System.in);
		 book_dic = new HashMap<String,Book>();
	}
	public void run() {
		int key = 0;
		while((key = selectMenu())!=0) {
			switch(key) {
			case 1: addBook(); break;

			default: System.out.println("잘못 선택하였습니다."); break;
			}
		}
		System.out.println("종료합니다...");
	}
	int selectMenu() {
		System.out.println("1. 추가 2: 삭제 3: 검색 4: 도서 목록 5: ISBN 0: 종료");
		int key = scan.nextInt();
		scan.nextLine();
		return key;
	}
	void addBook() {
		String isbn;
		System.out.print("추가할 도서 ISBN");
		isbn = scan.nextLine();
		if(book_dic.containsKey(isbn)) {
			System.out.println("이미 존재하는 ISBN 입니다.");
			return;
		}
	String title;
	int price;
	System.out.print("도서 제목 : ");
	title = scan.nextLine();
	System.out.print("가격 : ");
	price = scan.nextInt();
	scan.nextLine();
	Book book = new Book(isbn,title,price);
	book_dic.put(isbn, book);
	System.out.println(book.toString() + " 생성 하였습니다.");
	}
	void removeBook() {
		String isbn;
		System.out.print("삭제할 도서 ISBN : ");
		isbn = scan.nextLine();
		if(book_dic.containsKey(isbn)) {
			book_dic.remove(isbn);
			System.out.println("삭제 하였습니다.");
		}
		else {
			System.out.println("존재하지않습니다.");
		}
	}
	void listBook() {
		System.out.println("도서 목록");
		int cnt = book_dic.size();
		System.out.println("도서 수 : " + cnt);
		for(Book book : book_dic.values()) {
			System.out.println(book.toString());
		}
	}
	void listISBN() {
		System.out.print("도서 목록");
		int cnt = book_dic.size();
		System.out.println("도서 수 : " + cnt);
		for(String isbn : book_dic.keySet()) {
			System.out.println(isbn);
			}
		}
}


