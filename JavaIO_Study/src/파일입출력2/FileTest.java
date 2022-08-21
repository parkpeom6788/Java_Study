package 파일입출력2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class FileTest {
	
	public static void main(String[] args) {
		int flag = 0;
		byte[] arr = new byte[500];
		try {
			FileInputStream inputStream = new FileInputStream("C:\\Users\\fight\\Desktop\\test.txt");
			FileOutputStream outputStream = new FileOutputStream("C:\\kosta250\\se-workspace\\JavaIO_Study\\src\\hihi.txt");
			
			while((flag = inputStream.read(arr)) != -1) {
				outputStream.write(arr);
				Arrays.fill(arr, (byte)0);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
