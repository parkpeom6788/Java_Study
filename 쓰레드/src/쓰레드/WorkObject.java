package 쓰레드;

public class WorkObject {

	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA() 작업 실행");
		notify(); // 일시정지 상태에있는 ThreadB를 실행 대기상태로 만듬
		
		try {
			wait();  // ThreadA를 일시정지 상태로 만듬
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	// synchronized = 동기화 
	public synchronized void methdB() {
		System.out.println("ThreadB의 ");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
