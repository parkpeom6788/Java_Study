package 파일입출력;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IoTest12 {
	
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:\\kosta250\\se-workspace\\JavaIO_Study\\src\\hihi.txt");
			int readCharNo;
			char[] cbuf = new char[100];
			while((readCharNo = fr.read()) != -1) {
				// 100바이트씩 0번째부터 readCharNo 를 읽어온다.
				String data = new String(cbuf , 0 , readCharNo);
				System.out.print(data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
