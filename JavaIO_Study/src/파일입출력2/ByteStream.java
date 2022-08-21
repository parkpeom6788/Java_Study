package 파일입출력2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
public class ByteStream {
	public static void main(String[] args) {
		byte[] inSrc = {1,2,3};
		byte[] outSre = null;
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		int data = 0;
		while((data = input.read()) != -1) {
			output.write(data);
		}
		System.out.println(Arrays.toString(output.toByteArray())); 
	}
}
