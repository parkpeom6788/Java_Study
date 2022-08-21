/*테이블을 가져오려거든 DTO 파일부터 만듬
 * 날짜 같은 것도 String으로 받자
 * DTO는 dept 테이블의 칼럼(deptno,dname,loc)에 대해서 멤버변수화 시키고 각 멤버변수에 대해 
 * getter/setter 를 만듬
 * DTO 객체를 가지고 테이블의 데이터하나(혹은 새로 테이블에 담을 데이터)를 담고 그걸가지고 위의 DAO객체가
 * 이용하는 방식이 가능해짐
 */
public class DeptDto {
	private int no;
	private String name;
	private String loc;
	public DeptDto() {
		super();
	}
	public DeptDto(int no, String name, String loc) {
		this.no = no;
		this.name = name;
		this.loc = loc;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
}
