package 쓰레드;

public class SingleThreadEx2 implements Runnable {

	private int[] temp;

	public SingleThreadEx2() {
		temp = new int[10];
		
		for(int start = 0; start < temp.length; start++) {
			temp[start] = start;
		}
	}
	
	@Override
	public void run() {
		
		for(int start : temp) {
			try {
				Thread.sleep(1000);
				System.out.println("스레드이름:"+Thread.currentThread().getName());
				System.out.println("temp value : " + start);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		SingleThreadEx2 ct = new SingleThreadEx2();
		Thread t = new Thread(ct,"첫번째"); // Runnable -> Thread -> (객체,스레드이름)
			
		t.start();
	}
}
