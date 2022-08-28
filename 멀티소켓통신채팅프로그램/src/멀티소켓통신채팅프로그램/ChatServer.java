package 멀티소켓통신채팅프로그램;

import java.io.IOException;
import java.io.Writer;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {

	private static final int PORT = 6000;
	static List<Writer> listWriters; // 리스트에 (내용들을) 담음

	public static void main(String[] args) {
		listWriters = new ArrayList<Writer>();
		ServerSocket serverSocket = null;

		try {
			System.out.print(">>");
			// 서버소켓 객체 생성
			serverSocket = new ServerSocket();
			// hostAddress : 192.168.45.108:6000
			String hostAddress = InetAddress.getLocalHost().getHostAddress(); // 아이넷.겟로컬호스트.겟호스트어드레스
			serverSocket.bind(new InetSocketAddress(hostAddress, PORT));
			log("연결 기다림" + hostAddress + ":" + PORT); 
			
			// 요청 대기
			while (true) {
				Socket socket = serverSocket.accept(); // 접속 대기 			
				// read , write 쓰레드시작 
				new ChatServerThread(socket, listWriters).start();
			}
		} catch (IOException e) {
			log("ChatServer 대기중 에러: " + e);
		} finally {
			try {
				// close
				if (serverSocket != null && serverSocket.isClosed() == false) {
					serverSocket.close();
				}
			} catch (IOException e) {
				log("ChatServer 소켓 종료시 에러");
			}
		}
	}
	public static void log(String log) {
		System.out.println("[ChatServer] " + log);
	}
}
