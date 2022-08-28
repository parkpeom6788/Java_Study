package 채팅프로그램만들어보기;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

// 출력하는 쓰레드 
public class WritingThread extends Thread { // 서버로 메세지 보내는 Thread
	
	Socket socket = null;
	Scanner scanner = new Scanner(System.in); // 채팅용 Scanner
	
	public WritingThread(Socket socket) {
		// 받아온 Socket Parameter를 해당 클래스 Socket 에 넣기
		this.socket = socket;
	}
	public void run() {
	try {
		// OutputStream - 클라이언트에서 Server 로 메세지 발송
		// socket 의 OutputStream 정보를 OutputStream out 에 넣은 뒤
		OutputStream out;
			out = socket.getOutputStream(); // socket.getOutputStream()
			PrintWriter writer = new PrintWriter(out,true);
			
			while(true) {
				writer.println(scanner.nextLine()); // PrintWriter에 위 OutputStream 을 담아 사용
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
