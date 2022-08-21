package main;

public interface SchoolService {
	
	public boolean conTainsKeyCheck(int no);
	public void add(Student student);
	public void delete(int no);
	public void update(int no,int score);
	public void getMaxGradeStudent();
	public void getStudents();
}