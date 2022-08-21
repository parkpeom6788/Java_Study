package 파일입출력;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class IoTest11 {
	public static void main(String[] args) {
		String originFileName = "C:\\kosta250\\se-workspace\\JavaIO_Study\\src\\hihi.txt";
		String targetFileName = "C:\\kosta250\\se-workspace\\JavaIO_Study\\src\\hihicopy.txt";
		
	try {
		
			FileInputStream fis = new FileInputStream(originFileName);
			FileOutputStream fos = new FileOutputStream(targetFileName);
			int readBytesNo;
			byte[] readBytes = new byte[100];
		
	while((readBytesNo = fis.read(readBytes)) != -1) {
				fos.write(readBytes, 0 , readBytesNo);
			}
			fos.flush(); // 버퍼를 비운다 
			fos.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
