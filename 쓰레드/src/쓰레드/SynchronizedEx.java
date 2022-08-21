package 쓰레드;

class ATM implements Runnable {
	private long depositeMoney = 10000;
	
	
	public void run() {
		
		synchronized(this) {
			
			for(int i=0; i<10;i++) {
				notify(); // 스레드가 작업이 완료되면 notify() -> 일시정지상태에 있는 다른 스레드를 실행대기상태로만듬
				try {
					wait(); // 스레드를 일시정지 상태로 만듬 
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				if(getDepositeMoney() <= 0) 
					break;
			withDraw(1000);	
			}
		}
	}
	// 각각 동기화 메서드를 만든다 
	public void withDraw(long howMuch) {
		if(getDepositeMoney() > 0) {
			depositeMoney -= howMuch;
			System.out.println(Thread.currentThread().getName() + " , ");
			System.out.printf("잔액 : %,d원 %n", getDepositeMoney());
		} else {
			System.out.println(Thread.currentThread().getName() + " , ");
			System.out.printf("잔액 : %,d원 %n", getDepositeMoney());
		}
}
	public long getDepositeMoney() {
		return depositeMoney;
	}
}
public class SynchronizedEx {
	public static void main(String[] args) {
		ATM atm = new ATM();
		
		Thread mother = new Thread(atm,"mother");
		Thread son = new Thread(atm,"son");
		mother.start();
		son.start();
	}
}
