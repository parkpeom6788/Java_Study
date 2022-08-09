package sec02_exam;

public class Marine extends Unit{

	public Marine() {
	}
	@Override
	public void move(int x, int y) {
		System.out.println("마린의 위치 : " + x + "," + y +"로 이동함" );
	}
	// Marine의 고유메서드
	public void stimPack() {
		System.out.println("공격모드 : 스팀팩 장전!");
	}
}
