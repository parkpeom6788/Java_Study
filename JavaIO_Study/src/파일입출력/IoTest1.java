package 파일입출력;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
// 입력 예제
public class IoTest1 {
	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("C:\\kosta250\\se-workspace\\JavaIO_Study\\src\\hihi.txt");
			int readByte;
			try {
				while ((readByte = is.read()) != -1) {
					System.out.println(readByte);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
