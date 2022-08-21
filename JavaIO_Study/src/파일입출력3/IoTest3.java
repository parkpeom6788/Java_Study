package 파일입출력3;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
public class IoTest3 {
	public static void main(String[] args) throws IOException {
		
		Reader reader = null;
		reader = new FileReader("test.txt");
		int readData;
		while((readData = reader.read()) != -1) {
			char charData = (char)readData;
			System.out.print(charData);
		}
	} 
}
