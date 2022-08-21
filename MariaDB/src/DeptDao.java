import java.util.ArrayList;

/* DAO는 하나의 객체에 여러 쿼리를 담는 것이기에 singleton 방식으로 객체를 생성해야 한다
 * 즉 main에서 new를 통해서 객체를 만들수있는 길을 차다하고 메서드를 통해서 객체를 생성하도록 만들어야 한다
 * 이와 더불어 생성된 객체는 static 객체화를 통해 하나의 객체만이 존재하도록 만들어야 한다
 * single 이 null값 이라는 것은 아예 아무것도 만들어지지 않은 맨 처음 실행 단계 라고 할수있고
 * 이후에는 return single 을 통해 이미 
 */
public class DeptDao {
		// 1. singleton pattern
		// single 변수는 static 메서드에서 사용해야 하기 때문에 
		// static 변수로 설정해야 한다
	private static DeptDao single;
		// 외부에서 객체상황
	private DeptDao() {
		
	}
	// 외부에서는 이걸 통해서만이 객체생성가능
	public static DeptDao getInstance() {
		if(single == null) {
			single = new DeptDao();
		}
		return single;
	}
	// 하나의 행을 각 칼럼대로 뽑는 것은 번거롭고 힘들다
	// DeptDto 객체를 이용해 하나의 데이터(row)를 객체화해서 적용한다. 
	// 이게 제일 중요
	public boolean insert(DeptDto dto) {
		return false;
	}
	public boolean update(DeptDto dto) {
		return false;
	}
	public boolean delete(DeptDto dto) {
		return false;
	}
	// ArrayList는 사이즈를 따로 설정안해도 된다
	public ArrayList<DeptDto> select(){
		return null;
	}
	public DeptDto select(int depeNo) {
		return null;
	}
}
