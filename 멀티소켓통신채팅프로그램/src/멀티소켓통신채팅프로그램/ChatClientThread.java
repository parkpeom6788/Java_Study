package 멀티소켓통신채팅프로그램;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ChatClientThread extends Thread {

	private Socket socket;
	BufferedReader br;

	public ChatClientThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		// BufferedReader 생성
		try {
			String line = null;
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			
			while (true) {
				// 읽고 채팅방에 쓰기
				line = br.readLine(); // 수신 신호를 받음
				System.out.println(line);
			}
		} catch (IOException e) {
			ChatClient.log("서버와 연결이 종료되었습니다.");
		}
	}
}
