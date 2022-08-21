package ch8;

public class Ex8_7 {
	public static void main(String[] args) {
		try { 
			// RuntimeException과 그 자손은 예외처리를 해주지 않아도 컴파일이 된다.(선택)
			 throw new Exception(); // 필수로 처리해야되는데 예외처리안하면 컴파일 에러
													// Exception 은 checked 예외 - 예외처리가 필수
		} catch(Exception e) {
			
		}
	}
}
