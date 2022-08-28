package 멀티소켓통신채팅프로그램;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
	private static final int SERVER_PORT = 6000;
	public static void main(String[] args) {
		Socket socket = null;
		Scanner scanner = null;
		String line;
		try {
			scanner = new Scanner(System.in);
			//소켓 객체 생성
			socket = new Socket();
			String hostAddress = InetAddress.getLocalHost().getHostAddress(); // 내 아이피 
			//connect
			// 소켓 생성 및 연결  connect : 접속 요청 
			socket.connect(new InetSocketAddress(hostAddress, SERVER_PORT));
			log("채팅방에 참가했습니다.");
			System.out.print("닉네임>>");
			
			String nickname = scanner.nextLine();	// 닉네임 입력 
			
			// 소켓으로부터 스트림(데이터) 송수신할수 있게 BufferedReader,PrintWriter 생성 
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);
			pw.println("join:" + nickname +"\n"); // 첫 집장 시 닉네임 프로토콜 전송 
		
			//6. 쓰레드시작 :읽기
			new ChatClientThread(socket).start();
			//쓰기
			while(true){
				line = scanner.nextLine();//block
				// 8. quit 프로토콜 처리
				if("quit".equals(line)) {
						ChatClient.log("채팅방을 나갔습니다.");
					break;
				}else {
				// 9.메시지 처리 
					// 송신 보냄 
					pw.println("message:"+line); 
				}
			}
		} catch (IOException e) {
			log("error:" + e);
		}finally {
			try {
				if(scanner != null) {
					scanner.close();
				}
				//close
				if(socket != null && socket.isClosed() == false) {
					socket.close();					
				}
			} catch (IOException e) {
				log("ChatServer 소켓종료시 에러");
			}
		}
	}
	public static void log(String log) {
		System.out.println("[Chat Client] " + log);
	}
}