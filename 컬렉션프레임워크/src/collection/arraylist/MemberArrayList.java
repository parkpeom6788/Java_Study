package collection.arraylist;
import java.util.ArrayList;
import java.util.Iterator;
import collection.Member;
public class MemberArrayList {

	private ArrayList<Member> arrayList; // ctrl + shift + o
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	public void addMember(Member member) {
		arrayList.add(member);
	}
	public boolean removeMember(int memberId) { // 매개변수로 키값
		/*for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if(memberId == tempId) {
				arrayList.remove(i);
				return true;
			}
		}*/
		// Iterator 사용
		Iterator<Member> iterator = arrayList.iterator(); // 순환되는 객체를 제네릭에 지정->타입캐스팅할필요없다
		while(iterator.hasNext()) { // hasNext 커서를 가지는데 몇번째 가르키는데 가져올 다음 요소가 있나?
			// 있으면 가져온다 반환값이 null 이 되서 빠져나옴 
			Member member = iterator.next(); // <Member> 가 없으면 Object를 반환 
			int tempId = member.getMemberId();
			if(memberId == tempId) {
				arrayList.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId +" 가 존재하지 않습니다.");
		return false;
	}
	public void showAll() {
		// 인헨스드포문
		for(Member member : arrayList) {
			System.out.println(member.toString());
		}
		System.out.println();
//		System.out.println(arrayList); Vector 출력 , 콤마식으로 
		// HashSet<E> 은 순서가없어서 get이 없다. iterator 를 써야한다
		
		}
}
