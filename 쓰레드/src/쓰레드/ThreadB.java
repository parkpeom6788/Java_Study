package 쓰레드;

public class ThreadB extends Thread {
	
	private WorkObject workObject;
	
	public ThreadB(WorkObject workObject) {
		this.workObject = workObject;
	}
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodA();
		}
	}
}
