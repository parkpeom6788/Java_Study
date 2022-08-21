package 파일입출력2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferedReaderTest {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // System.in 이라는 inputStream(바이트를 다룸)
																												// inputStreamReader(문자를 다룸)에 연결되고 이것이 마지막으로 BufferedReader(문자를 다루며 버퍼를 사용하는 스트림)
																						// 과 연결되는 것이다. 이렇게 하면 바이트로 받은 리소스를 문자로 바꿔서 한줄 씩 읽어올수있다.
		BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
		String str = br.readLine(); // String을 읽어서 리턴하는 메서드인 readLine을 붙이면 콘솔에 입력한 내용을 String에 저장할 수 있고 
		bw.write(str); // 저장이 가능 
		// 버퍼가 가득 찼을때에만 모든 내용을 출력 소스에 출력하고 마지막 출력 부분이 출력 소스에 쓰이지 못하고 버퍼에 남아있는 채로 프로그램이 종료될수 있기 때문에
		// 작업을 마친 후 close() 혹은 flush()를 호출해서 모든 내용이 출력되도록 해줘야 한다.
		// 여러 스트림을 연결해서 사용하는 경우, 마지막에 연결한 Buffered 스트림을 닫아줘야 앞부분에 연결된 스트림의 close() 메서드도 자동으로 호출되어 함께 닫힌다 
		
		
	}
}
