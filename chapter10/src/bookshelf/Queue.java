package bookshelf;

public interface Queue {
	
	public void enQueue(String title);
	
	public String deQueue();
	
	public int getSize();
}
