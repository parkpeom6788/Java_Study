package collection.arraylist;

import java.util.ArrayList;

class MyQueue {
	
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public void enQueue(String data) { // 넣는다 
		arrayQueue.add(data);
	}
	public String deQueue() {
		int len = arrayQueue.size();
		if(len == 0) {
			System.out.println("큐가 비었습니다");
			return null;
		}
		return arrayQueue.remove(0); // 하나씩 꺼낸다 
	}
}

public class QueueTest {
	
	public static void main(String[] args) {
		
		
	}
}
