package sec03_exam;

// 추상 클래스인 Student의 공통적인 변수 name, age를 가진 
// 실체 클래스 SStudent와 KStudent를 생성하였습니다.
public class SStudent extends Student {
	String school;
	
	public SStudent(String name,int age) {
		this.name = name;
		this.age = age;
		school = "서울대학교";
	}
	
	// printSchool 메소드는 abstract 키워드가 있기 때문에 
	// 강제적으로 상속받은 실체 클래스에서 재정의를 해야합니다.
	@Override
	public void printSchool() {
		System.out.println(school +"에 재학중 입니다.");
	}
}
