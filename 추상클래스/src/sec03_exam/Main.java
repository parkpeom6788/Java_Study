package sec03_exam;

/* 정적 디스패치 - 컴파일시 
 * 컴파일 시점에 컴파일러가 특정 메서드를 호출할 것을 확실히 아는 경우
 * 컴파일 시 생성되는 바이트 코드에 이 정보가 남아있다
 * 즉, 런타임 전에 실행되는 메서드가 미리 결정
 * 오버로딩 메서드인 경우 두가지 메서드가 다르기 떄문에 이경우 정적 디스패치
 * 추상클래스를 상속받은 실체 클래스 에서는 
 * 실체 클래스의 레퍼런스로 선언하고 인스턴스를 만든다면 이 역시 정적 디스패치
 * 
 * 동적 디스패치 - 런타임시 
 * 인터페이스,추상클래스를 상속받은 클래스에서 재정의된 메서드 호출시
 * 컴파일 타임이 아닌 런타임에 해석되는 프로세스
 *  추상 클래스를 상속받은 실체 클래스가 있어도 실체 클래스가 아닌 추상클래스로
 *  레퍼런스를 선언하고 인스턴스는 실체 클래스로 만든다면
 *  동적 디스패치 
 */

public class Main {
	
	public static void main(String[] args) {
		
		Student student = new SStudent("홍길동", 21);
		Student student2 = new KStudent("손오공",25);
		
		student.printInfo();
		student2.printInfo();
		
		student.printSchool();
		student.printSchool();
	}
}
