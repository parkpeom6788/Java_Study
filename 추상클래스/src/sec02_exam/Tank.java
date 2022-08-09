package sec02_exam;

public class Tank extends Unit{

	@Override
	public void move(int x, int y) {
		System.out.println("탱크의 위치 : " + x + "," + y +"로 이동함");
	}
	// Tank의 고유메서드
	public void sizeMode() {
		System.out.println("공격 모드 : 시즈모드 변환");
	}
}
