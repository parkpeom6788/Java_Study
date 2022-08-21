package 쓰레드_종료기다림;

public class JoinExample {
	
	public static void main(String[] args) {
		
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {
			sumThread.join(); // SumThread가 종료될때까지 메인 스레드를 정지시킴
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("1 ~ 100 까지의 합  : " + sumThread.getSum());
	}
}
