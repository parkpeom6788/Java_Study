package 파일입출력3;

import java.io.IOException;
import java.io.InputStream;

public class IoTest5 {
	public static void main(String[] args) throws IOException {
		System.out.println("메뉴");
		System.out.println("1. 예금 조회");
		System.out.println("2. 예금 출금");
		System.out.println("3. 예금 입금");
		System.out.println("4. 종료 하기");
		System.out.println("메뉴를 선택하세요");
		
		InputStream is = System.in; // in -> InputStream 반환  byte 단위 
		char inputChar = 0;
		
		inputChar = (char)is.read();
		
		switch(inputChar) {
		case '1': System.out.println("예금 조회를 선택했습니다."); break;
		case '2': System.out.println("예금 조회를 선택했습니다."); break;
		case '3': System.out.println("예금 조회를 선택했습니다."); break;
		case '4': System.out.println("종료 하기를 선택했습니다.");
		}
	}
}
