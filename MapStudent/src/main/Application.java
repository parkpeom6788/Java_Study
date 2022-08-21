package main;

import java.util.Scanner;
public class Application {
	private static Scanner sc;
	private SchoolService service = new SchoolServiceImpl();
	public Application() {
		sc = new Scanner(System.in);
		choice();
	}
	public static int printFunction() {
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		System.out.println("1. 학생 정보 추가 | 2. 학생 정보 제거 | 3. 학생 정보 수정 | 4. 전교 1등 성적 출력 | 5. 전체 성적 출력");
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		System.out.print("선택 > ");
		int select = sc.nextInt();
		return select;
	}
	public void choice() {
		while(true) {
			int select = printFunction();
			// 학생 정보를 입력받은 후 성적표에 학생 성적 추가
			if(select == 1) { // 추가 
				System.out.print("학번 : ");
				int no = sc.nextInt();
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("점수 : ");
				int score = sc.nextInt();
				Student student = new Student(no,name,score);
				service.add(student);
			} else if(select == 2) {  // 삭제 
				System.out.print("학번 : ");
				int no = sc.nextInt();
				service.delete(no);
			} else if(select == 3) { // 수정
				System.out.print("학번 : ");
				int no = sc.nextInt();
				
				System.out.print("점수 : ");
				int score = sc.nextInt();

				service.update(no, score);
			} else if(select == 4) { // 수석 학생의 정보 출력 
				service.getMaxGradeStudent();
			} else if(select == 5) { // 성적표의 전체 목록 출력
				service.getStudents();
			} else if(select == 6) {
				System.out.println("프로그램을 종료합니다...");
				break;
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
		sc.close();
	}
}
