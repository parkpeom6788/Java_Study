package shopping;

public class Product {
	private int price;
	private String name;
	private int bonusPoint;
	public Product() {}
	public Product(int price, String name, int bonusPoint) {
		this.price = price;
		this.name = name;
		this.bonusPoint = bonusPoint;
	}
	public int getPrice() { return price; }
	public void setPrice(int price) { this.price = price;}
	public String getName() { return name;}
	public void setName(String name) { this.name = name; }
	public int getBonusPoint() { return bonusPoint;}
	public void setBonusPoint(int bonusPoint) { this.bonusPoint = bonusPoint;}
	public String toString() {
		return "name : " + name + " price : " + price; 
	}
}
