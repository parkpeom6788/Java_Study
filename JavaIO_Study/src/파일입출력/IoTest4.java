package 파일입출력;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;

public class IoTest4 {
	public static void main(String[] args) {
		try {
			Writer writer = new FileWriter("C:\\kosta250\\se-workspace\\JavaIO_Study\\src\\hihi.txt");
			char[] data = "홍길동".toCharArray(); 
			for(int i=0; i<data.length; i++) {
				writer.write(data[i]);
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
