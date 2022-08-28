package 멀티소켓통신채팅프로그램;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/*
 *  클라이언트에서는 서버로부터 메시지를 전송받아 화면에 출력
 *  그리고 메시지를 입력받아 서버에 전송하기 위한 스레드 하나를 생성하고
 *  첫전송은 client 들의 구분을 위해 client 이름을 생성해 전송하도록 한다 .
 */
public class MultiClient {

	public static void main(String[] args) {
		MultiClient multiClient = new MultiClient();
		multiClient.start();
	}
	public void start() {
		Socket socket = null;
		BufferedReader in = null;

		try {
			socket = new Socket("localhost", 8000);
			System.out.println("[서버와 연결되었습니다.]");

			String name = "user" + (int) (Math.random() + 10);
			Thread sendThread = new SendThread(socket, name);
			sendThread.start();

			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while (in != null) {
				String inputMsg = in.readLine();
				if (("[" + name + "]님이 나가셨습니다").equals(inputMsg))
					break;
				System.out.println("From:" + inputMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class SendThread extends Thread {
	Socket socket = null;
	String name;

	Scanner scanner = new Scanner(System.in);

	public SendThread(Socket socket, String name) {
		this.socket = socket;
		this.name = name;
	}

	@Override
	public void run() {
		try {
			PrintStream out = new PrintStream(socket.getOutputStream());
			out.println(name);
			out.flush();

			while (true) {
				String outputMsg = scanner.nextLine();
				out.println(outputMsg);
				out.flush();
				if ("quit".equals(outputMsg))
					break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
