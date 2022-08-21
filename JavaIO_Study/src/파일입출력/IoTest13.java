package 파일입출력;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class IoTest13 {
	public static void main(String[] args) {
		File file = new File("C:\\kosta250\\se-workspace\\JavaIO_Study\\src\\hihi.txt");
		FileWriter fw;
		try {
			fw = new FileWriter(file,true);
			fw.write("FileWriter 는 한글로된 \r\n");
			fw.write("문자열을 바로 출력 할 수 있다 \r\n");
			fw.flush(); // flush , close 를 꼭 해줘야 한다.
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
