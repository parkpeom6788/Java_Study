package sec02_exam;

// 직접적 관계에 놓인 클래스 A와B
// A클래스는 B클래스를 사용하는 입장
public class A {
	
	// A가B를 사용 (렌트카 association)
	public void methodA(B b) {
		b.methodB();
	}
	
}
