package 파일입출력3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileInOutputStreamDemo {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("");
			fos = new FileOutputStream("");
		
			byte[] readBytes = new byte[1024*10]; // 8 - 10 kb
			int readByteCount = 0;
			while((readByteCount = fis.read()) != -1) {
				fos.write(readBytes,0,readByteCount); // 바배열에있는 데이터를 출력하되 , 처음(0) 부터 , readByteCount 만큼 출력 
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fis != null) {
				try {
					fis.close();
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
