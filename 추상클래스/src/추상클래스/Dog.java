package 추상클래스;

public class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}
	@Override
	public void cry() {
		System.out.println("멍멍");
	}
	@Override
	public void behavior() {
		System.out.println("왼쪽으로 느리게 달리기");
	}
}
