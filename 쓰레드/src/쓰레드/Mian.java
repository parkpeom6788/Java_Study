package 쓰레드;

public class Mian {
	public static void main(String[] args) {
		WorkObject sharedObject = new WorkObject(); // Runnable 구현한 클래스
		
		ThreadA threadA = new ThreadA(sharedObject);  
		ThreadB threadB = new ThreadB(sharedObject); 
		
		threadA.start();
		threadB.start();
		
	}
}
