package 쓰레드;

public class Ex13_3 {
/*
 * 싱슬 스레드 보다 멀티 스레드 시간이 더 걸린다
 * 
 * A작업에서 B작업으로 넘어가는 것을 context Switching : 시간 소요됨 
 * 
 * 단점이 시간이 더걸리더라도  장점은 두가지 작업을 동시에 할수있다  ex ) 채팅 , 파일주고받고 사진도 주고 받고 
 */
	
	public static void main(String[] args) {		
		ThreadEx3_1 th1 = new ThreadEx3_1();
		for(int i=0; i < 300; i++) 
			System.out.printf("%s", new String("-"));
		System.out.print("소요시간1 : " + (System.currentTimeMillis()));
	}
}
class ThreadEx3_1 extends Thread{
	public void run() {
		for (int i = 0; i < 300; i++) 
			System.out.printf("%s",new String("|"));
		System.out.print("소요시간 2 : " + (System.currentTimeMillis()));
	}
}
