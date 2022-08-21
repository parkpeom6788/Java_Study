package 파일생성1;

import java.io.File;
import java.io.IOException;
/*
 * java.io.File 로 생성하기
 */
public class CreateFile {
	public static void main(String[] args) {
		File file = new File("C:\\kosta250\\se-workspace\\JavaIO_Study\\src\\파일생성1\\file1.txt");
		if(!file.exists()) {
			try {
				if(file.createNewFile()) {
					System.out.println("File created");
				} else {
					System.out.println("File already exists");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
