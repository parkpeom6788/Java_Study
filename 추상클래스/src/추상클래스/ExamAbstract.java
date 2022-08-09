package 추상클래스;

public class ExamAbstract {
	/*
	 * 추상클래스 & 추상메서드 abstract 사용하기 추상클래스는
	 * 말그대로 약간 추상적인 의미를 가진 클래스여야 하며
	 * 비추상적인 클래스에서 이를 상속받아 사용한다.
	 */
	public static void main(String[] args) {
		Tiger tiger = new Tiger("Hodol");
		tiger.cry(); // 어흥
		tiger.behavior(); // 우측으로 빠르게 움직인다
		System.out.println("사자의 이름은 : " + tiger.animal_name); // 사자의 이름은 : Hodol
		
		Dog dog  = new Dog("Mikey");
		dog.cry(); // 멍멍
		dog.behavior(); // 왼쪽으로 느리게 달리기
		System.out.println("개의 이름은 : " + dog.animal_name); // 개의 이름은 : Mikey
	}
}

