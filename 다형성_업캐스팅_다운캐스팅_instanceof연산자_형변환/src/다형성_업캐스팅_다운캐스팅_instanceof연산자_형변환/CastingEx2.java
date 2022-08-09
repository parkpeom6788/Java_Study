package 다형성_업캐스팅_다운캐스팅_instanceof연산자_형변환;

public class CastingEx2 {
	
	public static void main(String[] args) {
		Car car = new Ambulance();
		FireEngine fe = new FireEngine();
		Ambulance a1 = new Ambulance();
		Car car2 = null;
		
		fe.drive(); // 부모것은 내꺼  drive, Brrr~
		fe.water();// 독자적인 내꺼   water!!
		
		// 형변환은 상속관계에서만 성립
		//  fe = (FireEngine)a1; 형제관계는 형변환 X
		// car = fe;
		// 컴파일은 ok , 실행시 에러가 발생
		//          Car car = new Ambulance();
		//          fe = (FireEngine) car;  <- 컴파일은 되지만 실행시 에러 
		a1 = (Ambulance)car;
		a1.siren();  // 삐 융 삐 융
		fe.water(); // water!!
		
		car2 = fe;
		car2.drive(); // drive, Brrr~
	}
}
