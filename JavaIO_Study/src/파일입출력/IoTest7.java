package 파일입출력;

import java.io.Console;
public class IoTest7 {
	public static void main(String[] args) {
		Console console = System.console();
		System.out.println("아이디 : ");
		String id = console.readLine();
		
		System.out.println("패스워드 : ");
		char[] charPass = console.readPassword();
		String strPasword = new String(charPass);
		System.out.println("--------------");
		System.out.println(id);
		System.out.println(strPasword);
	}
}
