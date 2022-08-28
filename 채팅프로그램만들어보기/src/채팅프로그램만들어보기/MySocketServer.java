package 채팅프로그램만들어보기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MySocketServer extends Thread {
	
	static ArrayList<Socket> list = new ArrayList<Socket>(); // 유저 확인용
	static Socket socket = null;
	
	public MySocketServer(Socket socket) {
		this.socket =socket;
		list.add(socket); // 유저를 list에 추가
	}
	// Thread에서 start() 메서드 사용 시 자동으로 해당 메서드 시작 (Thread 별로 개별적 수행한다)
	/*
	 * 생성자 run 부분
	 * 생성자에서 파라미터로 넘긴 소켓정보를 할당해준 뒤에 
	 * list 안에 소켓정보를 add 시켜준 다음 run() 으로 넘어가게된다
	 * run에는 InputStream, OutputStream 을 생성해 메세지를 주고 받을수 있게 한 뒤에
	 * PrintWriter 를 사용해 클라이언트에게 연결되었다고 메세지를 보낸다
	 * 
	 * 다음으로는 while문으로는 클라이언트가 보낸값을 받으면서 값을 보냈을때는 최초에 이름을 할당해 주고 넘긴다
	 * 이후에 클라이언트가 메세지를 또 보내면 for문을 돌리면서 
	 * list 안에 있는 모든 유저들의 소켓정보를 통해 메세지를 보낸다
	 *
	 */
	public void run() {
		System.out.println("서버 : " + socket.getInetAddress() + " IP의 클라이언트와 연결되었습니다"); 
		// InputStream - 클라이언트에서 보낸 메세지 읽기
			try {
				InputStream input = socket.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(input));
				
				// OutputStream - 서버에서 클라이언트로 메세지 보내기
				OutputStream out = socket.getOutputStream();
				PrintWriter writer = new PrintWriter(out,true);
				
				// 클라이언트에게 연결되었다는 메세지 보내기
				writer.println("서버에 연결되었습니다! ID를 입력해 주세요");
				
				String readValue; // Client 에서 보낸 값 저장 
				String name = null; //  클라이언트 이름 설정용
				boolean identify = false;
				// 클라이언트가 메세지 입력시마다 수행
				while((readValue = br.readLine()) != null) {
					if(!identify) { // 연결 후 한번만 노출 
						name = readValue; // 이름 할당
						identify = true;
						writer.println(name +"님이 접속하였습니다.");
						continue;
					}
					// list 안에 클라이언트 정보가 담겨있다
					for(int i=0; i<list.size(); i++) {
						out = list.get(i).getOutputStream();
						writer = new PrintWriter(out,true);
						// 클라이언트에게 메세지 발송
						writer.println(name + " : " + readValue);
					}
				}
			} catch (IOException e) { // 예외처리
				e.printStackTrace();
			}
	}
	public static void main(String[] args) {
		/* 시작 시 socketPort 안에 포트를 설정하고 서버 소켓을 만든 뒤에
		 *  while 무한반복문 안에서 클라이언트 접속 시 Socket 정보를 받은 뒤
		 *  쓰레드에 클라이언트에 Socket 정보를 넣어주고 start 시킨다 
		 */
		try {
			int  socket = 1234; // 소켓 포트 설정용
			ServerSocket serverSocket = new ServerSocket(socket); // 소켓 서버 만들기 ( ServerSocket 클래스 이용 ) 
			System.out.println("socket : " + socket + "으로 서버가 열렸습니다."); // 서버 오픈 확인용 
			
			// 소켓 서버가 종료될 때까지 반복
			while(true) {
				Socket socketUser = serverSocket.accept(); // 서버에 클라이언트 접속 시
				// Thread 안에 클라이언트 정보를 담아줌 
				Thread thd = new MySocketServer(socketUser);
				thd.start();
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
