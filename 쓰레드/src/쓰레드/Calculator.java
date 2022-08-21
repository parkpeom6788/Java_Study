package 쓰레드;

public class Calculator {
	private int money;
	public int getMoney() {
		return money;
	}
	public synchronized void setMoney(int money) { // 동기화 블록 지정 -> 다른 스레드가 실행할 수 없게 하였다 
		this.money = money;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + " : " + this.money);
		}
	}
}
