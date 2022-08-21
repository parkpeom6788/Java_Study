package ch8;
import java.io.File;
public class Ex8_10 {
	public static void main(String[] args) {
		try {
			File f = createFiles("filecreate.txt");
			System.out.println(f.getName() + " 파일이 성공적으로 생성되었습니다.");
		} catch(Exception e) {
			System.out.println(e.getMessage() + " 다시 입력해 주시기 바랍니다.");
		}
	} // main 메서드 끝 
	
	public static File createFiles(String filename) throws Exception { // throws 떠넘기기
		// File 객체의 createNewFile메서드를 이용해서 실제 파일을 생성한다.
		if(filename == null || filename.equals("")) {
			throw new Exception("파일이름이 유효하지 않습니다"); // throw 예외처리 발생 
		}
		File f = new File(filename);  // File클래스의 객체를 만든다 
		return f; // 생성한 객체를 반환한다 
	}
}
