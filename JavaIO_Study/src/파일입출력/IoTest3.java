package 파일입출력;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
public class IoTest3 {
	public static void main(String[] args) {
		Reader reader = null;
		try {
			reader = new FileReader("C:\\kosta250\\se-workspace\\JavaIO_Study\\src\\hihi.txt");
			int readData;
			while ((readData = reader.read()) != -1) {
				char charData = (char)readData;
				System.out.print(charData);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
