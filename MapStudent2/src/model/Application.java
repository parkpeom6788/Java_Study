package model;
import java.util.Scanner;
public class Application {
	private static Scanner sc;
	private SchoolService service = new SchoolServiceImpl();
	public Application() {
		sc = new Scanner(System.in);
		choice();
	}
	public static int printFunction() {
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		System.out.println("1. 학생 정보 추가 | 2. 학생 정보 제거 | 3. 학생 정보 수정 | 4. 전교 1등 성적 출력 | 5. 전체 성적 출력 ");
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		System.out.print("선택 > ");
		int select = sc.nextInt();
		return select;
	}
	public void choice() {
		int select = printFunction();
		while(true) {
			if(select == 1) {
				System.out.print("학번 : ");
				int no = sc.nextInt();
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("점수 : ");
				int score = sc.nextInt();
				Student student = new Student(no,name,score);
				service.add(student);
			} else if(select == 2) {
				System.out.print("학번 : ");
				int no = sc.nextInt();
				service.delete(no);
			} else if(select == 3) {
				System.out.print("학번 : ");
				int no = sc.nextInt();
				
				System.out.print("점수 : ");
				int score = sc.nextInt();
				service.update(no, score);
			} else if(select == 4) {
				service.getMaxGradeStudent();
			} else if(select == 5) {
				service.getStudents();
			} else if(select == 6) {
				System.out.println("프로그램을 종료 합니다...");
			} else {
				System.out.println("잘못된 입력 입니다.");
			}
		}
	}
}
