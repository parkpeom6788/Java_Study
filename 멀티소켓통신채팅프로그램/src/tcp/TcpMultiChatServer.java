package tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TcpMultiChatServer {
	
	// 접속한 클라이언트들을 저장할 Map객체 선언
	// => key 값 : 접속한 사람들의 이름 , value 값 : 접속한 클라이언트들의 socket객체 
	private Map<String,Socket> clientMap;
	
	// 생성자
	public TcpMultiChatServer() {
	// clientMap을 동기화 처리가 되도록 생성한다
		clientMap = Collections.synchronizedMap(new HashMap<String,Socket>());
	}

	// ClientMap에 저장된 전체 사용자에게 메세지를 전송하는 메서드
	private void sendToAll(String msg) {
		
		// client의 데이터 개수만큼 반복
		for(String name : clientMap.keySet()) {
			try {
			// 각 사용자의 Socket을 이용하여 OutputStream객체를 구한다
				DataOutputStream dos = new DataOutputStream(clientMap.get(name).getOutputStream());
				dos.writeUTF(msg);
			} catch (IOException e) {
				//TODO handle exception
			}
		}
	}
	public void serverStart() {
		ServerSocket server = null;
		Socket socket = null;
		
		try {
			server = new ServerSocket(7777);
			System.out.println("서버가 시작되었습니다.");
			
			while(true) {
				socket = server.accept(); // 클라이언트의 접속을 기다린다
				System.out.println("[" + socket.getInetAddress() + ":" + socket.getPort() + "]에서 접속했습니다...");
				
				// 이 메시지를 받아서 전체에게 전송하는 Thread 객체를 생성하여 작동
				ServerReceiver serverThread = new ServerReceiver(socket);
				serverThread.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(server != null)
				server.close();
		}
	}
	public static void main(String[] args) {
		new TcpMultiChatServer().serverStart();
	}
	// Inner Class로 서버에서 클라이언트로 메시지를 전송하는 Thread를 만든다
	class ServerReceiver extends Thread {
		private Socket socket;
		private DataInputStream dis;
		private DataOutputStream dos;
		
		public ServerReceiver(Socket socket) {
			this.socket = socket;
			
			try {
				// 수신용 
				dis = new DataInputStream(socket.getInputStream());
				// 송신용
				dos = new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		@Override
		public void run() {
			String name = "";
		try {
			while(true) {
				// 클라이언트가 접속이 완료되면 최초로 사용자의 이름을 전송하는데
				// 이 이름이 중복되는지 여부를 feedBack 으로 클라이언트에게 보내준다
					name = dis.readUTF();
					if(clientMap.containsKey(name)) { // 이름이 중복될 때
						dos.writeUTF("이름중복");
					} else {
						dos.writeUTF("OK");
						break; // 반복문 탈출
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			} // while문 끝
			
			// 현재 접속해 있는 다른 클라이언트들에게 대화명(이름)을 이용해서 대화방 참여
			sendToAll("[" + name +"]님이 대화방에 입장했습니다...");
			
			// 대화명과 클라이언트의 Socket 객체를 Map에 저장
			clientMap.put(name, socket);
			System.out.println("현재 서버 접속자 수 : " + clientMap.size() + "  명");
			// 한 클라이언트가 보낸 메세지를 다른 클라이언트에게 전송
			while(dis != null) {
					sendToAll(dis.readUTF());
				}
		}
	}
}
