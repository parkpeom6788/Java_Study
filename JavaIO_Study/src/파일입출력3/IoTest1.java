package 파일입출력3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
public class IoTest1 {
	public static void main(String[] args) throws IOException {	
		File f = new File("hihi.txt");
		InputStream fis = new FileInputStream(f);
		int readByte = 0;
		while((readByte = fis.read()) == -1) {
			System.out.println(readByte);
		}
		fis.close();
	}
}
