package 파일입출력;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class IoTest6 {
	
	public static void main(String[] args) throws IOException {
		
		OutputStream os = System.out;
		for(byte b=48; b < 58; b++) {
			os.write(b);
		}
		os.write(10);
		for(byte b=97; b < 123; b++) {
			os.write(b);
		}
		os.write(10);
		String hangul = "가나다라마바사아자차카타파하";
		byte[] hangulBytes = hangul.getBytes(StandardCharsets.UTF_8);
		os.write(hangulBytes);
		os.flush();
	}
}
