package 멀티소켓통신채팅프로그램;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class msg_client {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1", 2400);
			System.out.println("서버접속성공!!");
			Scanner sc = new Scanner(System.in);
			System.out.println("이름을 설정해주세요. ");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
class reveive extends Thread {
	Socket socket;
	public reveive(Socket s) {
		socket = s;
	}
	@Override
	public void run() {
		InputStream input;
		BufferedReader reader; 
	try { 	
		while(true) {
			String s = null;
			input = socket.getInputStream();
			reader = new BufferedReader(new InputStreamReader(input)); // 읽기 
			
			if((s = reader.readLine()) != null) {
				System.out.println(s);
			}
		}
	} catch(IOException e) {
		e.printStackTrace();
	}
}
class sender extends Thread { // 서버로 메시지를 전송하는 역할
	Socket socket;
	String name;
	Scanner sc;

	public sender(Socket s, String n) {
		sc = new Scanner(System.in);
		socket = s;
		name = n;
	}
	@Override
	public void run() {
		try {
			while (true) {
				OutputStream out = socket.getOutputStream(); // 쓰기
				PrintWriter writer = new PrintWriter(out, true);
				writer.println(name + " : " + sc.nextLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
			}
		}
	}
}
