package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SchoolServiceImpl implements SchoolService {

	private Map<Integer,Student> gradeCard = new HashMap<Integer,Student>();
	
	// 존재하는지 확인하는 메서드
	@Override
	public boolean conTainsKeyCheck(int no) {
		boolean check = false;
		if(gradeCard.containsKey(no)) {
			return !check;
		}
		return check;
	}
	// 학번에 해당하는 학생이 이미 존재 할 경우 추가x 존재하지 않을 경우 학생 추가
	@Override
	public void add(Student student) {
		if(conTainsKeyCheck(student.getNo()) == true) 
			System.out.println("이미 존재하는 학생입니다.");
		else if(conTainsKeyCheck(student.getNo()) == false) {
			System.out.println("추가 하였습니다.");
			gradeCard.put(student.getNo(), student);
		}
	}
	@Override
	public void delete(int no) {
		if(conTainsKeyCheck(no)) {
			gradeCard.remove(no);
			System.out.println(no + " 학번이 삭제 되었습니다.");
		}
		else 
			System.out.println("존재하지 않습니다.");
	}
	@Override
	public void update(int no, int score) {
		if(conTainsKeyCheck(no)) {
			gradeCard.get(no).setScore(score);
			System.out.println(no + "학번의 정보가 수정되었습니다.");
		}
	}
	/*수석인 학생의 정보를 확인하는 메서드 ... 전체 학생들의 성적 비교 가장 높은 학생 성적 정보
	 * 여기서 애좀먹음... 해당 키값을 변경(Setter 메서드) 하는데 null 값으로 나옴
	 * 따라서 ★ 성적이 높은 학생일 때마다 ★ -> 학번,이름,성적을 계속 해서 변경해줌
	 */
	@Override
	public void getMaxGradeStudent() {
		Integer maxScore = 0;
		int no = 0;
		String name = "";
		Iterator<Integer> iter = gradeCard.keySet().iterator();
		while(iter.hasNext()) {
			Integer key = iter.next();
			if(gradeCard.get(key).getScore() > maxScore) {
				maxScore = gradeCard.get(key).getScore();
				no = gradeCard.get(key).getNo();
				name = gradeCard.get(key).getName();
			}
		}
		System.out.println("학번 : " + no);
		System.out.println("점수 : " + maxScore);
		System.out.println("이름 : " + name);
	}
	// 전체 학생들의 성적정보 출력 메서드 - Iterator 메서드 활용
	@Override
	public void getStudents() {
		Iterator<Integer> iter = gradeCard.keySet().iterator();
		while(iter.hasNext()) {
			Integer key = iter.next();
			System.out.println("학번 : " + gradeCard.get(key).getNo());
			System.out.println("이름 : " + gradeCard.get(key).getName());
			System.out.println("점수 : " + gradeCard.get(key).getScore());
			System.out.println();
		}
	}
}
