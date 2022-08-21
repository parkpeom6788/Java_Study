package 객체직렬화;

import java.io.Serializable;
public class SerialDTO implements Serializable {
	private static final long serialVersionUID = 2201390818538519867L;
	private String bookName;
	private int bookOrder;
	private boolean bestSeller;
	private long soldPerDay;
	public SerialDTO() {
	}
	public SerialDTO(String bookName, int bookOrder, boolean bestSeller, long soldPerDay) {
		this.bookName = bookName;
		this.bookOrder = bookOrder;
		this.bestSeller = bestSeller;
		this.soldPerDay = soldPerDay;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookOrder() {
		return bookOrder;
	}
	public void setBookOrder(int bookOrder) {
		this.bookOrder = bookOrder;
	}
	public boolean isBestSeller() {
		return bestSeller;
	}
	public void setBestSeller(boolean bestSeller) {
		this.bestSeller = bestSeller;
	}
	public long getSoldPerDay() {
		return soldPerDay;
	}
	public void setSoldPerDay(long soldPerDay) {
		this.soldPerDay = soldPerDay;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "SerialDTO [bookName=" + bookName + ", bookOrder=" + bookOrder + ", bestSeller=" + bestSeller
				+ ", soldPerDay=" + soldPerDay + "]";
	}
}
