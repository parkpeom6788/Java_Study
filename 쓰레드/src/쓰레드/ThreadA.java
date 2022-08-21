package 쓰레드;

public class ThreadA extends Thread {
	private WorkObject workObject;
	// 포함 
	ThreadA(WorkObject workobject){
		this.workObject = workobject;
	}
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methdB();
		}
	}
}
