package sec06_exam;

public class Default_staticExample {
	
	public static void main(String[] args) {
		
		Myclass myclass = new Myclass();
		myclass.method();
		myclass.method1();
		myclass.method2();
		//MyInterface 인터페이스에 정적 메서드 호출 방법
		// 인터페이스명.정적메서드명
		MyInterface.staticMethod();
		
		MyInterface myInterface = new Myclass();
//		myInterface.method();
		myInterface.method1();
		myInterface.method2();
		// 인터페이스를 구현한 클래스의 인스턴스를 만들어서 메서드를 출력
		// 그리고 static 메서드는 인터페이스명.메서드명 으로 출력이 가능
		
		// 인터페이스로 필드의 다형성을 통해 구현한 클래스의 객체 생성
		// 그러나 여기서는 근본이 인터페이스 이기 때문에 인터페이스에 있는 메서드만 호출이 가능
		// method() 는 구현 크래스에만 있는 메서드 이기 때문에 호출할수 없다
		
	}
}
