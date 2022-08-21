package singleton;

public class SingleTonTest {
	private static SingleTonTest singleton = new SingleTonTest();
	private SingleTonTest() {}
	public static SingleTonTest getInstance() {
		return singleton;
	}
	public static void main(String[] args) {
		SingleTonTest singleton1 = SingleTonTest.getInstance();
		SingleTonTest singleton2 = SingleTonTest.getInstance();
		System.out.println(singleton1 == singleton2); // true
		System.out.println(singleton1);
		System.out.println(singleton2);
	}
}

