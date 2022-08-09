package sec07_exam;

public class Singleton2 {
	
	private static Singleton2 single = new Singleton2();
	
	private Singleton2() {
		
	}
	
	public Singleton2 getInstance() {
		return single;
	}
	
}
