package sec03_exam;

public class KStudent  extends Student{

	String school;
	
	public KStudent(String name,int age) {
		this.name = name;
		this.age = age;
		school = "고려대학교";
	}
	
	@Override
	public void printSchool() {
		System.out.println(school +"에 재학중입니다.");
	}
	
}
