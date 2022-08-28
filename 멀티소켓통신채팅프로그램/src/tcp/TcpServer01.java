package tcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer01 {
	public static void main(String[] args) {
		
		try {
			ServerSocket server = new ServerSocket(7777);
			System.out.println("서버가 접속을 기다립니다...");
			
			Socket socket = server.accept();
			System.out.println("클라이언트와 연결이 완료되었습니다.");
			System.out.println();
			
			System.out.println("소켓으로 연결된 상대방에 대한 정보");
			System.out.println("IP주소 : " + socket.getInetAddress().getHostAddress()); // inetaddress 객체를 반환 -> 소켓과 연결된 상대방의 아이피 주소
			System.out.println("Port번호 : " + socket.getPort());  // int 
			System.out.println();
			
			System.out.println("소켓으로 연결된 로컬 컴퓨터에 대한 정보");
			System.out.println("IP 주소 : " + socket.getLocalAddress());
			System.out.println("Port 번호 : " + socket.getLocalPort());
			
			// 클라이언트에게 메세지 보내기
			// 클라이언트에게 메시지 보내기
			OutputStream out = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			
			// 클라이언트에 메세지를 보낸다. ( 클라이언트로 출력하는 방식으로 처리한다 )
			dos.writeUTF("환영합니다. 어서오세요");
			System.out.println("클라이언트에게 메시지를 보냈습니다.");
			dos.close();
			socket.close();
			server.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 		
	}
}
