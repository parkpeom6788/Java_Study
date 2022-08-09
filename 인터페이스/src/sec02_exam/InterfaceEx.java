package sec02_exam;

public interface InterfaceEx {
	
	public static void main(String[] args) {
		
		// 클래스 B가 다 완성되어야 비로소 클래스 A에 선언 되어 있는
		// methodA()를 호출 할 수가 있다 (이것이 직접적 관계)
		A a = new A();
		B b = new B();
		
		// A클래스에 methodA에는 매개변수로 B를 넣고 있다
		// 직접적으로 B를 사용하는 것이다
		a.methodA(b);
		a.methodA(new B());
		
	}
}
