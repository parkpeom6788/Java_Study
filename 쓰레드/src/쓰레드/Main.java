package 쓰레드;

public class Main {
	
	public static void main(String[] args) {
	
		ThreadEX threadex = new ThreadEX();
		ThreadEX threadex2 = new ThreadEX();
		Thread thread1 = new Thread(threadex);
		Thread thread2 = new Thread(threadex2);
		thread1.start();
		thread2.start();
	
	}
}
class ThreadEX implements Runnable { // synchronized 하나가 끝나야 실행됨 
	int TestNum = 0;
	public void run() {
		for(int i=0; i<10; i++) {
			if(Thread.currentThread().getName().equals("A")) {
				System.out.println("==============================");
				TestNum++;
			}
		System.out.println("ThreadName = " + Thread.currentThread().getName() + "TestNum = " + TestNum);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
	}
}
