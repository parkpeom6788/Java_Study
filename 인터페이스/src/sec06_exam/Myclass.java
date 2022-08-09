package sec06_exam;

public class Myclass implements MyInterface {
	
	// MyInterface 인터페이스를 구현함
	// 단, 인터페이스에 디폴트메서드와 static 메서드만 있기에 재 정의할 메서드가 없다
	// 인터페이스에 추상메서드가 있으면 반드시 재정의가 필요하다
	public void method() {
		System.out.println("MyClass 에서 호출한 메서드");
	}
	
	@Override
	public void method1() {
//		MyInterface.super.method1();
		System.out.println("MyInterface 에 있는 디폴트 메서드 method1()을 오버라이딩한 메서드 호출");
	}
}
