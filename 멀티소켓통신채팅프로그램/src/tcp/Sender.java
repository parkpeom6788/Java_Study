package tcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

// Socket을 통해서 메시지를 보내는 역할만 담당하는 클래스이다
public class Sender extends Thread {
		
	private Socket socket;
	private DataOutputStream dos; // 보내는 스트림 객체 => 전송할때 필요
	
	private String name; // 데이터 구분용
	private Scanner scan; // 입력시 필요
	
	// 생성자
	public Sender(Socket socket) {
		this.socket = socket;
		scan = new Scanner(System.in); 
		
		System.out.println("이름 입력 : ");
		name = scan.nextLine();
		
		try {
			dos = new DataOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		while(dos != null) {
			try {
				dos.writeUTF(name + " : " + scan.nextLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
