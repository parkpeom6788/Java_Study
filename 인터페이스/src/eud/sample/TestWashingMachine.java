package eud.sample;

public class TestWashingMachine {
	
	public static void main(String[] args) {
		
		// 인터페이스 테스트
		LGWashingMachine washinMachine = new LGWashingMachine();
		washinMachine.startButtonPressed();
		System.out.println("세탁기의 속도는 " + washinMachine.changeSpeed(3));
		dryCouse dry = new LGWashingMachine();
		dry.dry();
	}
}
