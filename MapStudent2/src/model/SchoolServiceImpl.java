package model;

import java.util.HashMap;
import java.util.Iterator;
public class SchoolServiceImpl implements SchoolService{
	private HashMap<Integer,Student> map = new HashMap<Integer,Student>();
	
	// 유효성 검증 메서드 
	@Override
	public boolean conTainsKeyCheck(int no) {
		boolean flag = false;
		if(map.containsKey(no)) {
			flag = true;
		}
		return flag;
	}
	@Override
	public void add(Student student) {
		if(conTainsKeyCheck(student.getNo())) {
			System.out.println("중복되어 추가 될수 없습니다.");
		} 
		else if(conTainsKeyCheck(student.getNo()) == false) {
			map.put(student.getNo(), student);
			System.out.println(student.getNo() + " 학번 정보가 추가 되었습니다.");
		}
	}
	@Override
	public void delete(int no) {
		if(conTainsKeyCheck(no)) {
			map.remove(no);
			System.out.println("삭제 되었습니다.");
		}
		else 
			System.out.println(no + "학번 정보가 없습니다.");
	}
	@Override
	public void update(int no,int score) {
		if(conTainsKeyCheck(no) == true) {
			map.get(no).setScore(score); // 정보 수정 
			System.out.println(no + "학번의 정보가 수정되었습니다.");
		} else if(conTainsKeyCheck(no) == false) {
			System.out.println(no +"학번 정보가 없습니다.");
		}
	}
	@Override
	public void getMaxGradeStudent() {
		Integer maxScore = 0; // 가장 높은 점수
		int no = 0; // 학번
		String name = ""; // 이름 
		Iterator<Integer> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			Integer key = iter.next();
			if(map.get(key).getScore() > maxScore) {
				maxScore = map.get(key).getScore();
				no = map.get(key).getNo();
				name = map.get(key).getName();
			}
		}
		System.out.println("학번 : " + no);
		System.out.println("점수 : " + maxScore);
		System.out.println("이름 : " + name);
	}
	@Override
	public void getStudents() {
		Iterator<Integer> iter = map.keySet().iterator();
		
		while(iter.hasNext()) {
			Integer key = iter.next();
			System.out.println("학번 : " + map.get(key).getNo());
			System.out.println("이름 : " + map.get(key).getName());
			System.out.println("점수 : " + map.get(key).getScore());
			System.out.println();
		}
	}
}
