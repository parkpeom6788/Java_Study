package tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class TcpClient01 {

	public static void main(String[] args) {

		/*
		 * 현재 자신 컴퓨터를 나타내는 방법 원래의 IP주소 : 예) 192.168.42.125 지정된 IP주소 : 127.0.0.1 원래의 컴퓨터
		 * 이름 : SEM-PC 지정된 컴퓨터 이름 : localhost
		 */
		String serverIp = "192.168.56.1";
		System.out.println(serverIp + "서버에 연결 중입니다...");
		System.out.println();
		// 서버의 IP주소와 포트번호를 지정하여 Socket 객체를 생성한다
		// socket객체는 생성이 완료되면 해당 서버로 요청신호를 보낸다
		try {
			Socket socket = new Socket(serverIp, 7777);
			System.out.println("서버에 연결되었습니다...");
			System.out.println();

			// 서버에서 보내온 메시지를 받아서 화면에 출력
			// 상대방이 보내온 데이터는 Socket 의 InputStream 객체를 이용
			// socket.getInputStream() 메서드로 입력용 스트림 객체를 구함
			
			InputStream is = socket.getInputStream(); // 서버에서 보냄 
			DataInputStream dis = new DataInputStream(is);
			
			// 서버가 보내온 자료를 받아서 출력한다(자료 입력)
			System.out.println("서버에서 보내온 메시지 : " + dis.readUTF());
			System.out.println();
			System.out.println("연결을 종료합니다");
			
			// 스트림과 소켓 닫기
			dis.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
