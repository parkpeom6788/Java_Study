package 싱글톤패턴2;

public class Main {
	
	public static void main(String[] args) {
		
		SingleTonTest singleton = SingleTonTest.getInstacne();
		
		System.out.println(singleton);
		SingleTonTest singleton2 = SingleTonTest.getInstacne();
	
		System.out.println(singleton2);
		if(singleton == singleton2) {
			System.out.println("같습니다");
		}
	}
}
