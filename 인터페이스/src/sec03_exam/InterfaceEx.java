package sec03_exam;

public interface InterfaceEx {
	
	public static void main(String[] args) {
		
		// 클래스를 직접 생성해서 호출하는 것 
		A a = new A();
		a.methodA(new B()); // 매개변수의 다형성
		//B클래스는 일종의 I 인터페이스의 자손이라서 
		// 매개변수로 들어올 수 있다
		
		// 인터페이스의 필드의 다형성
		I i = new B(); // 구현 관계이기 때문에 생성가능 
		i.methodB();
	}
}
