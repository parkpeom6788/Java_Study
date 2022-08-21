package 쓰레드동기화;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class Method {
	public static void main(String[] args) {
		Method sync = new Method();
	
		// 스레드 1이 syncMethod1()을 호출한 후 종료된 다음 스레드 2가 syncMethod2()를 호출한 것을 알 수 있다.
		Thread thread1 = new Thread(() -> {
			System.out.println("1 스레드 시작 " + LocalDateTime.now());
			sync.syncMethod1("스레드1");
			System.out.println("쓰레드1 종료 " + LocalDateTime.now());
		});
        Thread thread2 = new Thread(() -> {
        	System.out.println("스레드2 시작 " + LocalDateTime.now());
        	sync.syncMethod2("스레드2");
        	System.out.println(" 쓰레드 2종료" + LocalDateTime.now());
        });		
        Thread thread3 = new Thread(() -> {
        	System.out.println("스레드3 시작 " + LocalDateTime.now());
        	sync.syncMethod3("스레드3");
        	System.out.println("스레드3 종료 " + LocalDateTime.now());
        });
	}
	private static synchronized void syncMethod1(String msg) {
		System.out.println(msg + "의 syncMethod1 실행중" + LocalDateTime.now());
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	// static 키워드가 포함된 synchronized 메소드는 인스턴스가 아닌 클래스 단위로 lock을 공유한다.
	private static synchronized void syncMethod2(String msg) {
		System.out.println(msg + "의 syncMethod2 실행중 " + LocalDateTime.now());
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	private  void  syncMethod3(String msg) {
		System.out.println(msg + "의 method3 실행중" +  LocalDateTime.now());
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
