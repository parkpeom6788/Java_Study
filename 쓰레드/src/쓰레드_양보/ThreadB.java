package 쓰레드_양보;

public class ThreadB extends Thread {

	public boolean stop = false; // 종료 플래그
	public boolean work = true; // 작업 진행 여부 플래그
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadB가 작업중 입니다.");
			} else {
				Thread.yield(); // WORK false시 , 다른 스레드 에게 양보한다 
			}
		}
		System.out.println("ThreadB가 종료되었습니다.");
	}
}
