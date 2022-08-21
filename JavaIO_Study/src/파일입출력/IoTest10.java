package 파일입출력;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IoTest10 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\kosta250\\se-workspace\\JavaIO_Study\\src\\hihi.txt");
			int data;
				while((data = fis.read()) != -1) {
					System.out.println(data);
				}
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
}
