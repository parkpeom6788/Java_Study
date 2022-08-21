package 임계영역_synchronized;

public class TestSynchronized {
	public synchronized void method1() {
		// 임계영역(하나의 스레드만 실행 가능)
		
	}
	public void method2() {
		// 여러개의 스레드 실행 가능 
		
	}
	public void method3() {
		
		// 즉 , synchronized 블록 이라고 한다 
		synchronized (this) { // 공유 객체가 자기 자신이면 this 설정
			// 임계 영역
		}
		// 여러 스레드 실행 가능 영역
	}
}
