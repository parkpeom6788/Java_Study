package 파일입출력3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;
// String -> byte[] getBytes()
// String -> char[] toCharryArray()
public class IoTest4 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		Writer writer = new FileWriter("test.txt");
		System.out.print("적을 내용 : ");
		String memo = scanner.nextLine();
		char[] data = memo.toCharArray();
		for(int i=0; i < data.length; i++) {
			writer.write(data[i]);
		}
		writer.close();
	}
}
