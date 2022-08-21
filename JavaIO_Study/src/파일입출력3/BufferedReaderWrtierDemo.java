package 파일입출력3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// BufferedReader br = new BufferedReader(new InputStreamReader(System.in)
//		1 byte -> 2byte -> Line 으로 

public class BufferedReaderWrtierDemo {
	
	public static void main(String[] args) {
		
		FileReader fr = null; // 한개의 문자를 읽어옴 
		FileWriter wr = null;
		BufferedReader br = null; // 줄 단위로 읽어온다  new Line으로 구분시켜줘야 함 마지막에 flush 를 통해 읽은 것들을 비워내야 함 
		BufferedWriter bw = null; // OutputStream 과 Writer 객체 둘다 매개변수로 받을수 있다 flush 수행을 생성자로 받을수 있고 println 메서드를 통해 개행처리를 따로 하지 않아도 된다.
		
		try {
			fr = new FileReader("");
			br = new BufferedReader(fr);
			wr = new FileWriter("");
			bw = new BufferedWriter(wr);
			
			String readLine = null;
			while((readLine = br.readLine()) != null	) {
				System.out.println(readLine);
				bw.newLine(); // 개행을 해줌  
				// linux 개행이 \r  여기서는 \n
				// PrintWriter 에서는 println() 으로 개행까지 같이 작업 가능
			}
			bw.flush(); // 혹시나 남을수있기에 ( 반복문을  빠져나왔을때 flush 를 해준다 )
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
