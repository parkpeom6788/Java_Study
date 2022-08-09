package Phone;

// 추상클래스는 미완성 설계도
// 인터페이스는 기본(표준) 설계도라고 보시면 됩니다.
// 모든 클래스를 인터페이스를 사용한다면 
// 공통된 기능을 모두 구현해야 하기 때문에 번거로운 작업입니다.
// 이럴경우 추상클래스를 이용해야 합니다.
// 하지만, 추상클래스만 사용하기에는 다중상속이 불가하기 때문에 
// 각각 다른 추상클래스를 구현하는데 공통된 기능이 존재할 경우는 
// 인터페이스가 필요합니다.
public class Main {
	public static void main(String[] args) {
		Phone galaxy = new Galaxy();
		Phone iphone = new IPhone();
		// 자바의 다형성을 이용하여 
		// 인터페이스 참조변수로 다양한 클래스를 표현할 수 있습니다.
		System.out.println(galaxy.getMenufacturer());
		System.out.println(galaxy.getOS());
		galaxy.printRing();
		
		System.out.println(iphone.getMenufacturer());
		System.out.println(iphone.getOS());
		iphone.printRing();
		
		Phone.printUser("Hong Gil Dong");
	}
}
