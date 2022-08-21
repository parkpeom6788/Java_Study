package 파일입출력;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class IoTest2 {
	
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:\\kosta250\\se-workspace\\JavaIO_Study\\src\\hihi.txt");
			byte[] data = "ABC".getBytes(StandardCharsets.UTF_8);
			for(int i=0; i<data.length; i++) {
				os.write(data[i]);
			}
			os.flush();
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
