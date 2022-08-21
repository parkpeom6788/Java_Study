package 파일입출력3;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	
	public static void main(String[] args) {
		
		File f1 = new File("");
		
		boolean isSuccess = f1.mkdirs(); // 디렉토리 한개만 생성
		System.out.println(isSuccess);
		
		File f2 = new File(f1,"");
		// 기본적으로 byte 단위
		// 반환값이 20억을 넘어갈 수 있다
		long fileSize = f2.length() / (1024*1024); 
		System.out.println(fileSize); // MB 단위
		
		long lastModified = f2.lastModified();
		
		// 디렉토리 안에 모든 파일 , 디렉토리 출력하기
		File f3 = new File("");
		String[] list = f3.list();
		
		for(String temp : list) {
			File f4 = new File(f3,temp);
			if(f4.isDirectory()) {
				System.out.println("디렉토리 : " + temp);
			} else if(f4.isFile()) {
				System.out.println("파일 : " + temp);
			} else {
				System.out.println("?:" + temp);
			}
		}
		// 파일 이름 바꾸기
		File f5 = new File(f1,"jdk.exe");
		f2.renameTo(f5);

		File f6 = new File(f1,"a.txt");
		try {
			f6.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(f6.getName()); // 파일이름(확장자까지)
		System.out.println(f6.getPath()); // 전체경로
		System.out.println(f6.getParent()); // 상위 디렉터리
		
		// a.txt => System.currentTimeMillis().txt 파일로
		String extension = f6.getName().substring(f6.getName().lastIndexOf("."));
		File f7 = new File(f1,System.currentTimeMillis() + extension);
		f6.renameTo(f7);
		f7.delete();
	}
}
