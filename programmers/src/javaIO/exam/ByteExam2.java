package javaIO.exam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam2 {
	
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		// 파일로 부터 읽어드리는 객체 -> FileInputStream
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
				fis = new FileInputStream("src/javaIo/exam/ByteExam1.java"); // checked 이셉션 
				fos = new FileOutputStream("byte.txt");
				
				int readCount = -1;
				byte[] buffer = new byte[512]; // 512바이트 만큼 읽음
				
				while((readCount = fis.read(buffer)) != -1) { // 512바이트씩 읽어드림 
					fos.write(buffer,0,readCount); // buffer 의 0번째부터  readCount만큼 써준다 
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
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
}
