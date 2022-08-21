package 파일입출력3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
	
	public static void main(String[] args) {
		
		FileReader fr = null; // 문자 입력 스트림에서 한개의 문자를 읽어온다 
		FileWriter fw = null; 
		
		try {
			fr = new FileReader("");
			fw = new FileWriter("");
			int readChar = 0;
			
			while((readChar=fr.read()) != -1) {
				System.out.print((char)readChar); // 모니터에 호출
				fw.write(readChar); // 파일에 호출
			}
			// new char[2048] 같이 큰 숫자를 받을때는 주의
			// 큰 뭉텅이를 한번에 받아오는 것이기에 마지막에 빈 공백도
			// 같이 출력할 수 있다 -> readCharCount를 이용해서 읽을 만큼만 write 하자
			char[] readChars = new char[10];
			int readCharCount = 0;
			while((readCharCount = fr.read(readChars)) != -1) {
				// char[] -> String으로 바꿔주는 생성자
				System.out.print(new String(readChars,0,readCharCount));
				fw.write(readChars,0,readCharCount);

			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
