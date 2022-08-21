package 쓰레드멈추기;

public class InterruptExample {
	
	// 1초후 출력 스레드를 중지 시킴
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


class PrintThread extends Thread {
	
	
	
	@Override
	public void run() {

			while(true) {
				System.out.println("실행중");
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("자원 정리");
				System.out.println("실행 종료");
			}
	}
}