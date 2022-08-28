package 채팅프로그램만들어보기;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TCPClient extends JFrame {
	public final static int SERVER_PORT=9999;
	private static final long serialVersionUID = -7373805506956903026L;
	private Socket s;
	private JTextField messageField;
	private JTextArea messages;
	
	public TCPClient() {
		super("TCP Client");
		messageField = new JTextField(40);
		messages = new JTextArea(10,50);
		messages.setBackground(Color.black);
		JScrollPane scrolledMessages = new JScrollPane(messages); // 스크롤 가능 하도록
		
		this.setLayout(new BorderLayout(10,10));
		this.add("North",messageField);
		this.add("Center",scrolledMessages);
		messages.setEnabled(false); // TextArea disactive
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(620,400);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		connectServer();
	}
	public void connectServer() {
		String serverIP = "127.0.0.1";
		try {
			Socket s = new Socket(serverIP,SERVER_PORT);
			messages.append("server port: " + s.getPort() + " , my port: " + s.getLocalPort()+ "\n");
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			messages.append(br.readLine());
			
			br.close();
			s.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new TCPClient();
	}
}
