package 파일입출력4;

import java.io.IOException;
import java.io.OutputStream;

public class SystemExam {
	public static void main(String[] args) throws IOException {
		OutputStream os = System.out; // 콘솔로 데이터를 출력하기 위한 기능 제공 
		byte b = 97;
		os.write(b);
		os.flush();
		os.close();
		
	}
}
