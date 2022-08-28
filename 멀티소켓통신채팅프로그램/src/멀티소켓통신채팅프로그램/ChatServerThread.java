package 멀티소켓통신채팅프로그램;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class ChatServerThread extends Thread {
	private Socket socket;
	private String nickname;
	List<Writer> listWriters;
	
	public ChatServerThread(Socket socket , List<Writer> listWriters) {
		this.socket = socket;
		this.listWriters = listWriters;
	}
	@Override
	public void run() {
		// 1. Remote Host Information
		// 클라이언트와 통신을 위한 소켓 변환 
		InetSocketAddress inetRemoteSocketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
		String remoteHostAddress = inetRemoteSocketAddress.getAddress().getHostAddress();
		int remoteHostPort = inetRemoteSocketAddress.getPort(); 
		// [ChatServer] connected by client[192.168.45.108:      3881]
		ChatServer.log("connected by client["+remoteHostAddress +":"+remoteHostPort +"]");

		try {
		
		// 2. 스트림 얻기 ( 소켓으로 부터 스트림(데이터)송수신 할 수 있게 
		// 생성된 소켓을 통해 BufferedReader 와 PrintWriter 생성 
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),StandardCharsets.UTF_8));
		// pw 생성시 매개변수에 true 넣으면 pw호출시 flush 안써도 됨(autoflushing)
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8),true);
			
			// 3. 요청 처리 ( 송신 , 수신 )
			while(true) {
				String request = br.readLine();
				if(request == null) {
					ChatServer.log("클라이언트로 부터 연결 끊김");
					doQuit(pw); // listWriters.remove(writer);
					break;
				}
				// 4. 프로토콜 분석
				String[] tokens = request.split(":");
				if("join".equals(tokens[0])) {
					doJoin(tokens[1],pw); // addWriter(writer);
														// for(Writer writer : listWriters)
				} else if("message".equals(tokens[0])) {
					doMessage(tokens[1]); // broadcast(nickname + " : " + message);
														 //  for(Writer writer : listWriters)
				} else if("quit".equals(tokens[0])) {
					doQuit(pw); // removeWriter(writer);
										// listWriters.remove(writer);
				}
			}
		} catch (IOException e) {  // 2. 스트림 얻기에대한 익셉션
			ChatServer.log("stream error : " + e );
		}
	}
	private void doQuit(Writer writer) {
		removeWriter(writer);
		broadcast(this.nickname + "님이 퇴장하였습니다.");
	}
	private void removeWriter(Writer writer) {
		synchronized (listWriters) { // 동기화 처리 
			listWriters.remove(writer);
		}
	}
	public void doMessage(String message) {
		broadcast(nickname + " : " + message);
	}
	private void doJoin(String nickname,Writer writer) {
		this.nickname = nickname;
		String data = nickname + "님이 참여하였습니다";
		addWriter(writer);
		broadcast(data);
	}
	private void addWriter(Writer writer) {
		synchronized (listWriters) {
			listWriters.add(writer);
		}
	}
	private void broadcast(String data) {
		synchronized (listWriters) {
			for(Writer writer : listWriters) {
				PrintWriter printWriter = (PrintWriter)writer;
				printWriter.println(data);
				printWriter.flush();
			}
		}
	}
}
