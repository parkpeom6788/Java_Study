package model;
import main.Employee;
import main.Member;
import main.SchoolService;
import main.SchoolServiceImpl;
import main.Student;
import main.Teacher;

public class Main {
	public static void main(String[] args) {
		SchoolService service = new SchoolServiceImpl();
		service.addMember(new Student("01012341234", "김모씨", "서울", "100"));
		service.addMember(new Teacher("01012341235", "박모씨", "부산", "국어"));
		service.addMember(new Employee("01012341236","양모씨", "성남", "영업부"));
		service.printAll();
		
		System.out.println(service.findIndexByTel("01012341236")); // 2
		System.out.println(service.findIndexByTel("01012341237")); // -1
		
		Member member = service.findMemberByTel("01012341236");
		System.out.println(member);
		
		service.updateMemberByTel(new Employee("01012341236","양모씨", "성남", "영업부"));
		service.printAll();
		
		service.deleteMemberByTel("01012341236");
		service.printAll();
	}
}
