package 에코;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public final static int SERVER_PORT = 9999;

	public static void main(String[] args) {
		ServerSocket ss = null;

		try {
			ss = new ServerSocket(SERVER_PORT);
		} catch (IOException e) {
			e.printStackTrace();
		}

		while (true) {
			try {
				System.out.println("Waiting connection.....");
				Socket s = ss.accept(); // 새끼 소켓 넘겨줌
				new ServerThread(s).start();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

class ServerThread extends Thread {

	private Socket s;
	private BufferedReader br;
	private PrintWriter pw;

	public ServerThread(Socket socket) {
		this.s = s;
		
		try {
			br = new BufferedReader(new InputStreamReader(s.getInputStream())); // Socket으로 Read용 Stream
			pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream())); // Socket으로 write용 Stream
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void run() {
		while (true) {
			String received;
			try {
				received = br.readLine();
				System.out.println("server received : " + received);
				if (received == null || received.equals("quit")) {
					if (br != null)
						br.close();
					if (pw != null)
						pw.close();
					if (s != null)
						s.close();
					return;
				}
				pw.println("Server Got Your Message : " + received); // 2. 보냄
				pw.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}