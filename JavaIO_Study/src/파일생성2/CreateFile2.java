package 파일생성2;
import java.io.File;
import java.io.IOException;
public class CreateFile2 {
	public static void main(String[] args) {
		File file = new File("C:\\kosta250\\se-workspace\\JavaIO_Study\\src\\파일생성1\\file2.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
