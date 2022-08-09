
public class Person implements A{ // implements로 인터페이스를 구현해 준다

	@Override
	public void method() { // 인터페이스의 추상메서드를 구현해줍니다.
		System.out.println("인터페이스A를 구현한 클래스 Person의 method()호출됨");
	}
	public void method1() { // method1은 각 클래스의 고유 메서드입니다.
		System.out.println("인터페이스를 구현한 클래스에서 새로 만든 메서드 입니다.");
	}
}
