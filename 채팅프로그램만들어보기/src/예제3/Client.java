package 예제3;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		// 연결시에 소켓이 생성된다. 연결이 안될경우에는 예외발생한다
		Socket sk = new Socket("127.0.0.1",5050);
		System.out.println("서버와 접속이 되었습니다.");
	}
}

