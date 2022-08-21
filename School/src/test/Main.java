package test;

import model.Employee;
import model.Member;
import model.SchoolService;
import model.SchoolServiceImplVer;
import model.Student;
import model.Teacher;

public class Main {
	
	public static void main(String[] args) {
		
		SchoolService service = new SchoolServiceImplVer();
		service.addMember(new Student("01012341234","김모씨","용인","100"));
		service.addMember(new Teacher("01012341235","박모씨","성남","국어"));
		service.addMember(new Employee("01012341236","이모씨","부산","사업부"));
		service.addMember(new Student("01012341237","신모씨","경북","200"));
		service.addMember(new Teacher("01012341238","윤모씨","대구","수학"));
		service.printAll();
		System.out.println("중복되는 01012341238,윤모씨,대전,영업부   추가 하기");
		service.addMember(new Employee("01012341238","윤모씨","대전","영업부"));
		service.printAll();
		
		System.out.println("findIndexByTel() 실행 ");
		int position = service.findIndexByTel("01012341238");
		System.out.println("인덱스번호는 " + position);
		
		System.out.println("findMemberByTel() 실행 ");
		Member member = service.findMemberByTel("01012341238");
		System.out.println(member);
		
		System.out.println("deleteMemberByTel() 실행");
		service.deleteMemberByTel(member.getTel());
		service.printAll();
		
		System.out.println("findMemberByTel() 실행 ");
		Member member2 = service.findMemberByTel("01012341237");
		System.out.println(member2);
		
		System.out.println("updateMember(Member member) 실행");
		System.out.println("신모씨를 경북에서 강남으로 변경");
		service.updateMember(new Student("01012341237","신모씨","강남","200"));
		service.printAll();
		
		
	}
}
