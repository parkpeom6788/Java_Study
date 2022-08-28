package tcp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TcpFileClient {

	private void clientStart() {
		
		File file = new File("d:/d_other/펭귄.jpg");
		
		String fileName = file.getName(); // 파일의 이름을 가져옴
		
		if(!file.exists()) {
			System.out.println(fileName + " 파일이 없습니다. ");
			System.out.println("작업을 중단 합니다...");
			return;
		}
		
		try {
			Socket socket = new Socket("localhost",7777);
			System.out.println("파일 전송 시작...");
			
			// Socket 용 OutputStream 객체 생성
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			BufferedOutputStream bos = new BufferedOutputStream(dos);
			
			// 파일 입력용 InputStream 객체 생성
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
			
			byte[] temp = new byte[1024];
			int length = 0;
			
			// 파일 내용을 읽어와 소켓으로 전송하기
			while((length = bis.read(temp)) > 0) {
				bos.write(temp,0,length);
			}
			// buffer 사용시 flush 사용 
			bos.flush();
			System.out.println("파일 전송 완료");
			
			bis.close();
			bos.close();
			socket.close();
		} catch (IOException e) {
			System.out.println("파일 전송 실패 : " + e.getMessage());
		}
	}
	public static void main(String[] args) {
		new TcpFileClient().clientStart();
		
		String serverIp = "192.168.42.125";
		System.out.println(serverIp + " 서버에 연결중입니다.");
		
		try {
			Socket socket = new Socket(serverIp,7777);
			System.out.println("서버에 연결되었습니다.");
			
			// 파일을 읽어와서 서버에 출력하고 전송
			File file = new File("D:\\D_Other/펭귄.jpg");
			
			// inputStream 객체 생성
			FileInputStream fin = new FileInputStream(file);
			BufferedInputStream bin = new BufferedInputStream(fin);
			//outputStream 객체 생성
			OutputStream out = socket.getOutputStream();
			int data;
			while((data = bin.read())!=-1) {
				out.write(data);
			}
			bin.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
