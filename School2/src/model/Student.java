package model;

public class Student extends Member {
	
	private String stuId;

	public Student() {
	}
	public Student(String tel, String name, String address, String stuId) {
		super(tel, name, address);
		this.stuId = stuId;
	}
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	@Override
	public String toString() {
		return "Student : " + super.toString() + " + stuId  : " + stuId;
	}
	
}
