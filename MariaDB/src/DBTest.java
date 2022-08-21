import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBTest {
	
	// SELECT -> CPR  RESULT SET 에서 while 돌림
	// INSET UPDATE DELETE CP  -> PreparedStatement 에서 executeUpdate 함 
	
	public static void main(String[] args) {
		
		try {		
			// 1. 드라이버 로드
			Class.forName("org.mariadb.jdbc.Driver"); // Driver 클래스를 메모리에 로딩시켜준다. 이와 관련된 내용은 앞선 static 참조
			System.out.println("드라이버 로드 성공!");
			
			// 2. Connection 객체를 생성해 DataBase 연결
			Connection con = null;
			PreparedStatement pstmt = null;
			con = DriverManager.getConnection("jdbc:mysql://localhost/acorn?autoReconnect=true","acorn12","acorn12"); // name , password
			
			// 2. 데이터 베이스와 연결 시도
			System.out.println("데이터 베이스 연결 성공!");
			// DriverManager.getConnection 메서드를 이용해서 Connection 객체를 생성 , 필요한 인자는 연결하려는 데이터베이스 주소 , 등록한 username 과 password 다 SQLException 예외처리 해야하는 것도 잊지 말아야 한다
			
			// 3. Connection 객체를 생성해 Database 연결하기
			StringBuffer sql = new StringBuffer();
			// 쿼리에서 먼저 실험해보고 성공했을때 넣기 
			// ? : binding 변수 - 값(value) 에만 넣을수 있다 
			sql.append("INSERT INTO dept(deptno,dname,loc) VALUES(?,?,?)");
			
			// 3. SQL문을 전송할 수 있는 PreparedStatement 객체를 생성한다
			pstmt = con.prepareStatement(sql.toString());
			// DB와 연결을 성공했으면 그 다음은 SQL문을 전송할 준비를 해야한다. 여기서 PreparedStatement 객체를 이용
			// StringBuffer를 이용해 원하는 sql문을 String으로 이어서 만들고 완성된 sql문자열을 PreparedStatement 객체 생성하면서 연결
			// 여기까지는 아직 sql문을 전송한것은 아니다
			
			//4 . 바인딩 변수(?)를 설정
			// 바인딩 변수는 위에 sql 문자열 만들 때 보았던 "?" 변수이다 여기에 따로 PreparedStatement 객체를 이용해 원하는 값을 집어 넣을 수 있다
			// 아래가 INSERT 하려는 dept table 이다. deptno=5,dname=ANALYSIS,loc="LA"를 INSERT 해보려 한다
			pstmt.setInt(1, 50);
			pstmt.setString(2, "ANALYSIS");
			pstmt.setString(3, "LA");
			
			// 5. SQL문을 전송한다
			int result = pstmt.executeUpdate();
			// insert, update ,delete(DML)일때 사용 
			// 갱신된 행(데이터)의 개수를 리턴해준다 

			// 5 추가 SELECT 쿼리 보내기
			// SELECT 쿼리는 위의 3개의 DML쿼리와 다르게 executeQuery 메서드를 통해 쿼리를 보내고 특별히 중요한 것이 ResultSet 객체를 이용해 executeQuery의 결과값을 받는 다는 것이다	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
}
