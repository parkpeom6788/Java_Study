package 멀티소켓통신채팅프로그램;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class msg_server extends Thread {
	
	static ArrayList<Socket> users = new ArrayList<Socket>();
	Socket socket;
	
	public msg_server(Socket socket) {
		this.socket = socket;
		users.add(socket);
	}
	@Override
	public void run() {
		try {
			while(true) {
				String s;
					InputStream input = socket.getInputStream();
					BufferedReader reader = new BufferedReader(new InputStreamReader(input)); // 읽기
					if((s = reader.readLine()) != null) {
						System.out.println(s);
						for(int i=0; i<users.size(); i++) {
							OutputStream out = users.get(i).getOutputStream(); // 쓰기
							PrintWriter writer = new PrintWriter(out,true);
							writer.println(s);
							// writer.flush();
						}
					}
			  } 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		int socket = 2400;
		try {
			ServerSocket ss = new ServerSocket(socket);
			System.out.println("서버 열림");
			while(true) {
				Socket user = ss.accept();
				System.out.println("클라이언트 입장 " + user.getLocalAddress() + " : " + user.getLocalPort()); // 원격호스트 와 포트 
				Thread serverThread = new msg_server(user);
				serverThread.start();
			 }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
