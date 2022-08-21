import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBTest2 {
	public static void main(String[] args) {
		// C P R
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/acorn","acorn12","acorn12");
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT deptno,dname,loc");
			sql.append("FROM dept");
			sql.append("ORDER BY depetno");
			
			pstmt = con.prepareStatement(sql.toString());
			// SELECT 수행시 executeQuery() 사용
			// INSERT 때에도 사실 
			rs = pstmt.executeQuery();
			//ResultSet 을 이용하여 결과 출력
			while(rs.next()) {
				// 중간에 어느 하나가 누락되었다 해도 알아서 고쳐줌
				int index = 1;
				int depetno = rs.getInt(index++);
				String dname = rs.getString(index++);
				String loc = rs.getString(index++);
				System.out.printf("%d,%s,%s\n",depetno,dname,loc);
			}
			/*ResultSet은 executeQuery() 메서드의 결과값을 받아내고 SELECT 의 결과 테이블 각 행을 기준으로 나타냄
			 * 이를 출력하기 위해 next() 메서드를 통해서 다음 데이터가 존재하는지 유무를 판단하게 만들고 존재할 경우 계속 반복문이 돌아가도록 해서 출력코드 작성
			 * Class.forName : 클래스를 메모리에 로딩
			 * Connection 객체를 생성해 DataBase 연결하기 (DriverManager.getConnection(DB주소,username,pwd)를 이용해서 연결
			 * Connection 객체를 생성해 Database 연결
			 * (sql문을 StringBuffer 를 이용해 하나의 문자열로 만들어서 PreparedStatement 객체 생성하는데 보낸다)
			 * 바인딩 변수 설정 후 쿼리 전송하기
			 * ("?" 처리한 곳에 PreparedStatement 객체를 이용해 원하는 값을 넣고 executeUpdate( or executeQuery) 메서드를 이용해 DB에 쿼리를 보냄
			 * DB에 가서 성공 유무 확인 
			 */
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
