package 파일입출력4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamExam {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		String originalFileName = "";
		String targetFileName = "";
		
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		
		byte[] readByte = new byte[100];
		
		try {
			// 파일 복사 
			while((readByteNo = fis.read()) != -1) {
				fos.write(readByte , 0 , readByteNo); //
			}
			fos.flush();
			fos.close();
			fis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
