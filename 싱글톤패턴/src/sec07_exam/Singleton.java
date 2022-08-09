package sec07_exam;

/* 싱글톤
 *  자바의 디자인 패턴
 *  하나의 애플리케이션 내에서 단 하나만 생성되는 객체
 *  외부에서 new 연산자로 인스턴스 생성할 수 없도록 private 접근 제어자 붙임
 */
public class Singleton {
	// 접근제어자가 범위가 가장 좁은 범위의 제어자 이기 때문에
	// 외부에서 접근을 하지 못한다.
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		System.out.println("생성자 호출");
	}
	//getInstance() 하는 역할
	// 공유변수의 주소만 리턴해주므로써 싱글톤 객체를 사용하게끔 해준다.
	public static Singleton getInstacne() {
		return singleton;
	}
}
