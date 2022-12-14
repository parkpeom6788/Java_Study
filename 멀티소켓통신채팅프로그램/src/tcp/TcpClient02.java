package tcp;

import java.io.IOException;
import java.net.Socket;

public class TcpClient02 {
	
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost",7777);
			System.out.println("서버에 연결되었습니다...");
			
			// 스레드 구현한 생성자에 socket을 넣음 
			Sender sender = new Sender(socket); 
			Receiver receiver = new Receiver(socket);
			
			sender.start();
			receiver.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
