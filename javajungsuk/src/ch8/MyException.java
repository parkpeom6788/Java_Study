package ch8;

/* 사용자 정의 예외 만들기
 * 우리가 직접 예외 클래스를 정의할 수 있다
 * 조상은 Exception 과 RuntimeException 중에서 선택한다
 */
public class MyException extends Exception {
	public MyException(String msg) { //문자열을 매개변수로 받는 생성자
		super(msg); // 조상인 Exception 클래스의 생성자를 호출한다 
	}
}
