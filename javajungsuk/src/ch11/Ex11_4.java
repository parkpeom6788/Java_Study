package ch11;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

/* 큐를 이용한 최근에 입력한 명령어 조회 
 * 5개 이상 넘어가면
 * 맨 앞 최근 기록한거 삭제 
 */

public class Ex11_4 {
	static Queue q = new LinkedList();  // 큐를 구현한 LinkedList() 생성
	
	static final int MAX_SIZE = 5; // Queue에 최대 5개 까지만 저장되도록 한다.  상수로 선언 
	
	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼수 있다.");
		while(true) {
			System.out.print(">>");
			try {
				// 화면으로 부터 라인단위로 입력받는다.
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim(); // trim() 앞뒤 공백 제거 
				if("".equals(input)) continue;  // 공백 입력시 while문으로 이동 
				
				if(input.equalsIgnoreCase("q")) {
					System.exit(0); // 프로그램 종료 
				} else if(input.equalsIgnoreCase("help")) {
					System.out.println(" help - 도움말을 보여줍니다.");
					System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
					System.out.println(" history - 최근에 입력한 명령어를 " + MAX_SIZE + "개를 보여줍니다.");
				} else if(input.equalsIgnoreCase("history")) {
					save(input); // 입력한 명령어를 저장함
					LinkedList list = (LinkedList)q; // stack -> list.get 사용하기 위해서 다운캐스팅
					ListIterator it = list.listIterator();
//					while(it.hasNext()) {
//						System.out.println(it.next());
//					}
					final int SIZE = list.size();
					for(int i=0; i<SIZE; i++) 
						System.out.println((i+1) + "." + list.get(i));
				} else {
						save(input);
						System.out.println(input);
				}
			} catch(Exception e) {
				System.out.println("입력 오류 입니다.");
			}
		} // while(true)
	}// main()
	public static void save(String input) {
		// queue 에 저장한다
		if(!"".equals(input)) { // null 이 아닐경우
			q.offer(input);
		}
		if(q.size() > MAX_SIZE) {
			q.remove();
		}
	}
}
