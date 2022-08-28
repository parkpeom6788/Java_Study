package 채팅프로그램만들어보기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
 
// 읽어오는 쓰레드
public class ListeningThread extends Thread {
	
	Socket socket = null;
	public ListeningThread(Socket socket) { // 생성자
		this.socket = socket;
	}
	@Override
	public void run() {
		// InputStream - Server 에서 보낸 메세지를 클라이언트로 가져옴
		try {
			// InputStream - Server 에서 보낸 메세지를 클라이언트로 가져옴
			// socket 의 InputStream 정보를 InputStream in 에 넣은뒤
			InputStream input = socket.getInputStream();
			// BuffreadReader 에 위 InputStream을 담아 사용
			BufferedReader br=  new BufferedReader(new InputStreamReader(input));
			while(true) { // 무한반복 
				System.out.println(br.readLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
