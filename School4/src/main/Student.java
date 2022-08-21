package main;

public class Student extends Member {
	
	private String stuid;
	
	public Student() {
	}
	public Student(String tel, String name, String address, String stuid) {
		super(tel, name, address);
		this.stuid = stuid;
	}
	public String getStuid() {
		return stuid;
	}
	public void setStuid(String stuid) {
		this.stuid = stuid;
	}
	@Override
	public String toString() {
		return "Student : " + super.toString() + " stuid=" + stuid;
	}
	
}
