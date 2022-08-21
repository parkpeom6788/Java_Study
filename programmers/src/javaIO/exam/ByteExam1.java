package javaIO.exam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam1 {
	
	public static void main(String[] args) {
		
		// 파일로 부터 읽어드리는 객체 -> FileInputStream
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
				fis = new FileInputStream("src/javaIo/exam/ByteExam1.java"); // checked 이셉션 
				fos = new FileOutputStream("byte.txt");
				
				int readData = -1;
				while((readData = fis.read()) != -1) { // 한바이트씩 읽으면서 파일이 끝날때 까지 수행  -1이 같지 않을때까지 수행
					fos.write(readData);
				}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();  // 반드시 닫아줘야함
			} catch (IOException e) {
				e.printStackTrace();
			} 
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
