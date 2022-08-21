package model;

public interface SchoolService {
	
	public boolean conTainsKeyCheck(int no);
	public void add(Student student); // create
	public void delete(int no); // delete
	public void update(int no,int score); // update
	public void getMaxGradeStudent();
	public void getStudents();
}
