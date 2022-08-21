package 파일입출력;

import java.io.IOException;
import java.io.InputStream;

public class IoTest5 {
	
	public static void main(String[] args) {
		
		System.out.println("메뉴");
		System.out.println("1. 예금 조회");
		System.out.println("2. 예금 출금");
		System.out.println("3. 예금 입금");
		System.out.println("4. 종료 하기");
		System.out.println("메뉴를 선택하세요");
		
		InputStream is = System.in; // 입력 
		char inputChar = 0;
		
		try {
			 inputChar = (char)is.read(); // int -> char 형변환 캐스팅 
		} catch (IOException e) {
			e.printStackTrace();
		}
		switch(inputChar) {
		case '1':	System.out.println("예금 조회를 선택했습니다."); break;
		case '2':  System.out.println("예금 출금을 선택했습니다."); break;
		case '3':  System.out.println("예금 입금을 선택했습니다."); break;
		case '4':  System.out.println("종료 하기를 선택했습니다."); break;
		}
	}
}
