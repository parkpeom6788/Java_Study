package 쓰레드;

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator); // 공유 객체 설정
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
		
		/*User1 , User2 스레드가 Calculator 라는 공유객체를 사용한다. User1 스레드가 먼저 Calculator memory 필드에 100을 저장하고
		 * 2초간 일시정지 상태에서 User2 스레드가 memory 필드값을 50으로 변경한다
		 * 2초가 지나 User1 스레드가 다시 실행상태가 되서 memory 필드 값을 출력하면 User2 가 저장한 50이 나오게 된다
		 * 
		 * 동기화 메서드 초기화 블록
		 * 위와 같은 상황을 피하기 위해서는 스레드가 사용중인 객체를 다른 스레드가 변경될수 없도록 잠금을 걸어 야 한다
		 * 멀티 스레드 프로그램에서 단 하나의 스레드만 실행 할수 있는 코드 영역을 임계영역 이라고 한다.
		 * 
		 * 자바는 임계영역을 지정하기 위해 동기화(synchronized) 메서드와 동기화 블록을 제공한다.
		 */
		
	}
}
