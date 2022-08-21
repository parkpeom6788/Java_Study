package 파일입출력3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class IoTest2 {
	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("test.txt");
		Scanner scanner = new Scanner(System.in);
		System.out.print("메모장에 적고 싶은 내용 : ");
		StringBuffer sb = new StringBuffer();
		sb.append(scanner.nextLine());
		String s = sb.toString();
		byte[] data = null;
		
		data = s.getBytes(StandardCharsets.UTF_8);
		for(int i=0; i < data.length; i++) {
			os.write(data[i]);
		}
		os.flush();
		os.close();
	}
}
