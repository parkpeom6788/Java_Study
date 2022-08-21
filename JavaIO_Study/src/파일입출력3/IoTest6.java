package 파일입출력3;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
public class IoTest6 {
	public static void main(String[] args) throws IOException {
		
		OutputStream os = System.out; // out -> OutputStream 반환 -> Byte 단위
		
		for(byte b=48; b<58; b++) {
			os.write(b);
		}
		
		os.write(10);
		for(byte b=97; b<123; b++) {
			os.write(b);
		}
		os.write(10);
		
		String hangul = "가나다라마바사아자차카타파하";
		byte[] hangulBytes = hangul.getBytes(StandardCharsets.UTF_8);
		
		// 반드시 적을때 byte 단위로 적어야 되므로 byte 로 형변환 해서 적는다 
		os.write(hangulBytes);
		os.flush();
	}
}
