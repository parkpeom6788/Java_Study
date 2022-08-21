package main;

public class Teacher extends Member {
	
	private String subject;
	public Teacher() {
	}
	public Teacher(String tel, String name, String address, String subject) {
		super(tel, name, address);
		this.subject = subject;
	}
	public Teacher(String tel, String name, String address) {
		super(tel, name, address);
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Teacher : " + super.toString() + " subject =" + subject;
	}
}
