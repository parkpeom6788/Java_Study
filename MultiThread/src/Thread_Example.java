class MultiThread extends Thread {
	public MultiThread(String threadName) {
		this.setName(threadName);
	}
	public void run() {
		for(int i=0; i<1000; i++) {
			int x = 100;
			x += i;
			for(int j=0; j<10000; j++) {
				x += j;
			}
		}
		System.out.println(this.getName() + " Thread_Start ");
	}
}
public class Thread_Example {
	public static void main(String[] args) {
		for(int i=0; i<=5; i++) {
			Thread thread = new MultiThread("[ Thread " + i + " ]");
			if( i==5 ) 
				// setPriority 우선순위 설정 
				thread.setPriority(Thread.MAX_PRIORITY); // 가장 먼저 시작
			else 
				thread.setPriority(Thread.MIN_PRIORITY);  // 1
			thread.start();
		}
	}
}

