package test;

import model.Member;
import model.SchoolService;
import model.SchoolServiceImpl;
import model.Student;
public class Main {
	public static void main(String[] args) {
		SchoolService service = new SchoolServiceImpl();		
		service.addMember(new Student("01012341234", "김모씨", "용인", "100"));
		service.addMember(new Student("01012341235", "박모씨", "성남", "101"));
		service.addMember(new Student("01012341236", "신모씨", "대구", "102"));
		service.addMember(new Student("01012341236", "신모씨", "대구", "102"));
		service.printAll();
		
		Member member = service.findMemberByTel("01012341236");
		System.out.println(member);
		
		service.deleteMemberByTel("01012341236");
		service.printAll();
		
		service.updateMemberByTel(new Student("01012341235", "박모씨", "부산", "101"));
		service.printAll();
	}
}
