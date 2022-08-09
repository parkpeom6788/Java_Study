package 싱글톤패턴2;

public class SingleTonTest {
	
	private static SingleTonTest singleton = new SingleTonTest();
	
	private SingleTonTest() {}
	public static SingleTonTest getInstacne() {
		return singleton;
	}
}

