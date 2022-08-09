package bookshelf;

public class BookShelfTest {
	public static void main(String[] args) {
		Queue q = new BookShelf();
		// add 
		q.enQueue("1");
		q.enQueue("2");
		q.enQueue("3");
		
		System.out.println(q.getSize()); // 3
		// remove
		q.deQueue();
		q.deQueue();
		q.deQueue();
		System.out.println(q.getSize()); // 0
	}
}
