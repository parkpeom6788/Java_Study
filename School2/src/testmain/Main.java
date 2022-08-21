package testmain;
import java.util.Scanner;

import model.SchoolService;
import model.SchoolServiceImpl;
import model.Student;
import model.Teacher;
public class Main {
	private SchoolService service;
	private Scanner sc;
	public Main() {
		service = new SchoolServiceImpl();
		sc = new Scanner(System.in);
		choice();
	}
	public void choice() {
		do {
			show();
			int number = sc.nextInt();
			switch(number) {
			case 1 : add(); break;
			case 2: search(); break;
			case 3: delete(); break;
			case 4: update(); break;
			case 5 : System.exit(0);
			}
		}while(true);
	}
	public void show() {
		System.out.println("1. 추가 2. 검색 3. 삭제 4. 수정 5. 종료 ");
	}
	public void print(String message) {
		String msg = message;
		System.out.print(msg + " :  ");
	}
	public void add() {
		
	}
	public void search() {
		
	}
	public void delete() {
		
	}
	public void update() {
		
	}
	public static void main(String[] args) {
		SchoolService service = new SchoolServiceImpl();
		service.addMember(new Student("01012341234","김모씨","서울","100"));
		service.addMember(new Teacher("01012341235","박모씨","부산","영업부"));
		service.printAll();
		
		service.findmemberByTel("01012341235");
		service.updateMember(new Teacher("01012341235","박모씨","성남","영업부"));
		service.printAll();
		
		service.deleteMemberByTel("01012341235");
		service.printAll();
		
	}
}
