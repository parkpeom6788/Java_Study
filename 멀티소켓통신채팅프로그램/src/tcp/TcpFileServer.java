package tcp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpFileServer {
	
	private void serverStart() {
		//Socket으로 읽어서 File로 쓴다
		File saveDir = new File("d:/d_other/upload");
		
		if(!saveDir.exists()) {
			saveDir.mkdirs();
		}
		
		try {
			ServerSocket server = new ServerSocket(7777);
			System.out.println("서버가 준비중입니다.");
			
			Socket socket = server.accept(); // 클라이언트의 요청을 기다린다
			System.out.println("파일 저장 시작...");
			// 소켓용 입력 스트림 객체 생성
			BufferedInputStream bis = new BufferedInputStream(
					new DataInputStream(socket.getInputStream())
				);
		File saveFile = new File(saveDir,"펭귄.jpg");
		
		// 파일 출력용 스트림 객체 생성
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(saveFile));
		
		byte[] temp = new byte[1024];
		int length = 0;
		while((length = bis.read()) != -1) {
			bos.write(temp,0,length);
		}
		bos.flush();
		
		System.out.println("파일 저장 완료..");
		// 스트림과 소켓 닫기
		bos.close();
		bis.close();
		socket.close();
		server.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("파일 저장 실패 !!! : " + e.getMessage());
		}
	}
	public static void main(String[] args) {
		new TcpFileServer().serverStart();
		// Socket 으로 읽어서 File로 쓴다
		// 서버 연결을 위한 소켓 생성
		try {
			ServerSocket server = new ServerSocket(7777);
			System.out.println("서버가 접속을 기다립니다.");
			
			// 클라이언트의 접속을 기다림
			Socket socket = server.accept();
			System.out.println("클라이언트와 연결이 완료되었습니다.");
			
			// 전송받은 폴더 inputStream으로 읽어와서 outputstream으로
			InputStream is = socket.getInputStream();
			
			String targetFileName = "펭귄.jpg";
			// upload 폴더가 없으면 만든다
			File targetFile = new File("D:\\D_Other/upload");
			
			if(targetFile.exists()) {
				targetFile.mkdir();
			}
			FileOutputStream fout = new FileOutputStream(targetFile.getPath() + File.separator + targetFileName);
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			
			int data;
			while((data = is.read()) != -1){
				bout.write(data);
			}
			is.close();
			bout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
