package main;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
class Book2 implements Serializable {
	private static final long serialVersionUID = 774994187995838321L;
	public Book2() {
	}	
	public Book2(String name) {
		this.name = name;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class Main2 {
	HashMap<Integer,Book2> map;
	public Main2() {
		map = new HashMap<Integer,Book2>();
	}
	public void input() {
		 int ran = ((int)Math.random()+45)*1;
		 map.put(ran, new Book2("홍길동전"));
		 showValues();
	}
	public void showValues() {
		for(Book2 book : map.values()) {
			System.out.println(book);
		}
		showKey();
	}
	public void showKey() {
		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext()) {
			it.next();
		}
	}
	public static void main(String[] args) {
		new Main2().input();
	}
}
