package 추상클래스;

public class Tiger extends Animal {

	public Tiger(String name) {
		super(name);
	}
	
	@Override
	public void cry() {
		System.out.println("어흥");
	}
	@Override
	public void behavior() {
		System.out.println("우측으로 빠르게 움직인다");
	}
}
