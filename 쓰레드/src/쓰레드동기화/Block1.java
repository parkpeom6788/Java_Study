package 쓰레드동기화;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class Block1 {
	
	public static void main(String[] args) {
//		 synchronized 인자 값으로 this를 사용하면 모든 synchronized block에 lock이 걸린다. 
//		 쉽게 말하면, 여러 스레드가 들어와서 서로 다른 synchronized block를 호출해도 this를 사용해 자기 자신에 lock을 걸었으므로 기다려야 한다.
		Block1 block = new Block1();
		Thread thread1 = new Thread(() -> {
			System.out.println("스레드1 시작" + LocalDateTime.now());
			block.syncBlockMethod1("스레드1");
			System.out.println("스레드1 종료" + LocalDateTime.now());
		});	
		
		Thread thread2 = new Thread(() -> {
			System.out.println("스레드2 시작" + LocalDateTime.now());
			block.syncBlockMethod2("스레드2");
			System.out.println("스레드2 종료" + LocalDateTime.now());
			
		});
		thread1.start();
		thread2.start();
	}
	private  void syncBlockMethod1(String msg) { // static을 쓰면 synchronized block 을 지정할수있다  static의 특정상 this같이 현재 객체를 카리키는 표현을 할수없다
		
		
		synchronized (this) { // synchronized(this) 블럭으로 감싸진 부분끼리 동기화가 잘 지켜지는 것을 확인할 수 있다.
			System.out.println(msg + "의 syncBlockMethod1 실행중" + LocalDateTime.now());
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	private static synchronized void syncBlockMethod2(String msg) {
//		synchronized(this) {
//			System.out.println(msg +"의 syncBlockMethod2 실행중"  + LocalDateTime.now());
//			
//			try {
//				TimeUnit.SECONDS.sleep(5);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}
}
