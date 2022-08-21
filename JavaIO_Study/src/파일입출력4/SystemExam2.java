package 파일입출력4;

import java.io.IOException;
import java.io.OutputStream;

public class SystemExam2 {
	
	public static void main(String[] args) throws IOException {
		OutputStream os = System.err;
		String name = "박범";
		byte[] nameBytes = name.getBytes();
		os.write(nameBytes);
		os.flush();
		os.close();
	}
}
