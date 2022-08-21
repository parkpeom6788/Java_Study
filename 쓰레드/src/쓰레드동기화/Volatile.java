package 쓰레드동기화;

public class Volatile {
	
	private static boolean stopRequested;
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread backgroundThread = new Thread(() -> {
			Integer i =0;
			while(!stopRequested) { // true 무한반복 안에 synchronized를 써주면 무한루프에서 벗어날수 있다.
				synchronized (i) {
					i++;
				}
			}
		});
		backgroundThread.start();
		Thread.sleep(1000);
		stopRequested = true;
	}
}
