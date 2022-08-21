package 파일입출력3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class InputStreamReaderDemo {
	
	public static void main(String[] args) {
		
		System.out.print("입력하세요>");
		InputStream in = System.in; // 소스가 키보드
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		isr = new InputStreamReader(in);
		br = new BufferedReader(isr);
		
		try {
			fw = new FileWriter("");
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw,true); // true -> autoFlush
			
			String readLine = null;
			while((readLine=br.readLine()) != null) {
				if(readLine.equals("exit")) {
					break;
				}
				System.out.println(readLine);
				System.out.print("입력하세요>");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(in != null)
				try {
					in.close();
			if(br != null)		
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
		}
	}
}
