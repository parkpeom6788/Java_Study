package 파일입출력;

import java.io.File;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class IoTest9 {
	public static void main(String[] args) throws URISyntaxException {
	File dir = new File("C:\\kosta250\\se-workspace\\JavaIO_Study\\src\\hihi.txt");
	if (dir.exists() == false) {
		dir.mkdirs();
	}
	File temp = new File("C:\\kosta250\\se-workspace\\JavaIO_Study\\src\\hihi.txt");
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
	File[] contents = temp.listFiles();
	System.out.println("날짜 \t\t 시간 \t\t 형태 \t 크기 \t 이름");
	System.out.println("------------------------------------------------");
	for(File file : contents) {
		System.out.print(sdf.format(new Date(file.lastModified())));
		if(file.isDirectory()) {
			System.out.print("\t<DIR> \t\t\t" + file.getName());
		}
		System.out.println();
		} 
	}
}
