package 다형성_업캐스팅_다운캐스팅_instanceof연산자_형변환;

public class CastingEx {
	
	public static void main(String[] args) {
		
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		// 업캐스팅(자손->조상) 형변환 생략 가능 ,
		// 다룰 수 있는 멤버 개수 줄어듬
		car = fe; // 필드의 다형성 (업캐스팅)
		// car.water(); 예외 발생 car의 근본이 car 이기 때문에 
		fe2 = (FireEngine)car; // 다운캐스팅 : 형변환 생략 불가능.
											// 다룰 수 있는 멤버 개수 늘어남
		fe2.water();
		
		/* car은 Car(조상)의 인스턴스 이고 , fe는 FireEngine(자손)의 인스턴스인데
		 * 자손의 객체를 조상에 대입하고 있다
		 * 다형성 때문에 가능
		 * car .water() 예외발생 car클래스에는 water가 없기때문이다.
		 * 자손은 조상의 멤버를 모두 사용할수있지만, 조상은 자손의 멤버를 사용하지 못함
		 * 근본이 Car 이기에 Car에 있는 멤버만을 사용할 수 있다
		 * 
		 */
	}
}
