package 쓰레드;

public class User1 extends Thread {
	
	private Calculator calculator;
	
	@Override
	public void run() {
		calculator.setMoney(100);
	}

	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}
}
class User2 extends Thread {
	
	private Calculator calculator;
	
	@Override
	public void run() {
		calculator.setMoney(50);
	}
	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}

}

