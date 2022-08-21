package 반복자패턴;

public class Study_Group implements Aggregate {
	
	private Student[] Students;
	private int num = 0;
	public Study_Group(int num) {
		this.Students = new Student[num];
	}
	public Student getStudents(int index) {
		return Students[index];
	}
	public void AddStudent(Student student) {
		this.Students[num] = student;
		num++;
	}
	public int getLength() {
		return num;
	}
	
	@Override
	public StudyGroupIterator iterator() {
		return new StudyGroupIterator(this);
	}
	
}
