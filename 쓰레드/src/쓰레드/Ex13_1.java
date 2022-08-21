package 쓰레드;

public class Ex13_1 {
	
	public static void main(String[] args) {
		ThreadEx1_1 t1 = new ThreadEx1_1();
		
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r); // 생성자 Thread ( Runnable target)
			
		// 스레드의 실행 순서는 OS스케줄러에 의존적이다 . OS에 종속적인게 스레드 이다  
		t1.start(); // 0을 출력
		t2.start(); // 1을 출력 
	}
}
class ThreadEx1_1 extends Thread { //  1. Thread 클래스를 상속해서 스레드를 구현 
	public void run() { // 쓰레드가 수행할 작업 
		for(int i=0; i<500; i++) {
			System.out.println(this.getName()); // 조상인 Thread의 getName() 을 호출
		}
	}
}
class ThreadEx1_2 implements Runnable { // 2.  Runnable 인터페이스를 구현하거나 
	
	@Override
	public void run() { // run 추상메서드를 반드시 구현한다.  쓰레드가 수행할 작업을 작성 
		for(int i=0; i<500; i++) {
			// Thread.currentThread() - 현재 실행중인 Thread를 반환한다.
			System.out.println(Thread.currentThread().getName()); // thread 를 상속받지 않아서 접근할때는 이런식으로 접근함 currentThread는 static 메서드 
		}
	} 
}
