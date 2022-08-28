package 채팅프로그램만들어보기;

import java.io.IOException;
import java.net.Socket;

public class MySocketClient {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("192.168.56.1",1234);  // 소켓 서버에 접속 ( 내아이피 , 서버아이피 )
			// 클라이언트가 바로 연결되어 Client가 접속함 : ip값 ~ 이 뜨는 것이 보인다
			System.out.println("socket 서버에 접속 성공! ");
			
			// 서버에서 보낸 메세지 읽는 Thread
			ListeningThread t1 = new ListeningThread(socket);
			WritingThread t2 = new WritingThread(socket); // 서버로 메세지 보내는 Thread
			t1.start();
			t2.start();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
