package 싱글톤패턴;

class SingleTon {
	
	private static SingleTon singleton ;
	private SingleTon() {
		singleton = new SingleTon();
	}
	public static SingleTon getInstance() {
		return singleton;
	}
}
public class SingleTonTest {
	public static void main(String[] args) {
		SingleTon single1 = SingleTon.getInstance();
		SingleTon single2 = SingleTon.getInstance();
		System.out.println(single1 == single2);
	}
}
