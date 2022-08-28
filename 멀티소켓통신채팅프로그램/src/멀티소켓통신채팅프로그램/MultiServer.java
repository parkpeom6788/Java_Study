package 멀티소켓통신채팅프로그램;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 멀티채팅 프로그램에서 서버에서는 서버소켓이 루프를 돌면서 클라이언트가 연결될때마다 새로운 스레드(ReceiveThread)를 생성
 * 그리고 이렇게 생성된 스레드는 클라이언트에서 메시지가 들어올때마다 전체 클라이언트에 해당메시지를 전송합니다
 */


// 서버 구현 
public class MultiServer {
	
	public void start() {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
			try {
				serverSocket = new ServerSocket(8000);
				while(true) {
					System.out.println("[클라이언트 연결대기중]");
					socket = serverSocket.accept();
					
					// client가 접속할때마다 새로운 스레드 생성
					ReceiveThread receiveThread = new ReceiveThread(socket);
					receiveThread.start();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if(serverSocket != null)
					try {
					serverSocket.close();
					System.out.println("[서버종료]");
					} catch (IOException e) {
						e.printStackTrace();
						System.out.println("[서버소켓통신에러]");
					}
			}
	}
	public static void main(String[] args) {
		MultiServer multiServer = new MultiServer();
	}
}
class ReceiveThread extends Thread {
	static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<PrintWriter>());
	Socket socket = null;
	BufferedReader in = null;
	PrintWriter out = null;
	
	public ReceiveThread(Socket socket) {
		this.socket = socket;
		try {
			out = new PrintWriter(socket.getOutputStream());
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			list.add(out);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void run() {
		String name =  "";
		try {
			name = in.readLine();
			System.out.println("[" + name + " 새연결 생성]");
			sendAll("[" + name +"] 님이 들어오셨습니다.");
			
			while(in != null) {
				String inputMsg = in.readLine();
				if("quit".equals(inputMsg)) break;
				sendAll(name + ">>" + inputMsg);
			  }
		} catch (IOException e) {
			System.out.println("[" + name + "접속끊김");
		} finally {
			sendAll("[" + name + "]님이 나가셨습니다.");
			list.remove(out);
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("[" + name + "연결종료]");
	}
	private void sendAll(String s) {
		for(PrintWriter out : list	) {
			out.println(s);
			out.flush();
		}
	}
}







