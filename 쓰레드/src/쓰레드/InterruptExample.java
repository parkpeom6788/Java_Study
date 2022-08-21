package 쓰레드;

public class InterruptExample {
	// 1초후 스레드를 중지시킴
	public static void main(String[] args) {
		Thread thread = new PrintThread();
		thread.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.interrupt();
	}
}
