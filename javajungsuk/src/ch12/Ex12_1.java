package ch12;

import java.util.ArrayList;

class Product2 {}
class Tv2 extends Product2 {}
class Audio2 extends Product2 {}

public class Ex12_1 {
	
	public static void main(String[] args) {
		
		ArrayList<Product2> productList = new ArrayList<Product2>();
		ArrayList<Tv2> tvlist = new ArrayList<Tv2>();
		
		productList.add(new Tv2());
		productList.add(new Audio2());
		
		tvlist.add(new Tv2());
//		tvlist.add(new Audio2()); error 
		
//		printAll(tvList); error
		printAll(productList);
	}
	public static void printAll(ArrayList<Product2> productList) {
		for(Product2 p : productList) {
			System.out.println(p);
		}
	}
}
