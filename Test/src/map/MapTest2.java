package map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
class MapTest {
	Map<Integer,Member> map;
	Scanner sc;
	Random random;
	public MapTest() {
		map =  new HashMap<Integer,Member>();
		sc = new Scanner(System.in);
		random = new Random();
		choice();
	}
	public void choice() {
		int choice = 0;
		do {
			System.out.print("1. 추가 2. 제거 3. 출력 4. 종료  : ");
			choice = sc.nextInt();
			switch(choice) {
				case 1: input(); break;
				case 2: remove(); break;
				case 3: print(); break;
				case 4: System.out.println("종료되었습니다."); System.exit(0);
			}
		}while(true);
	}
	public void input() {
		System.out.print("이름 : ");
		String name = sc.next();
		int number = random.nextInt(10000)+1;
		System.out.print("성별 : ");
		String gender = sc.next();
		Member member = new Member(name,gender);
		map.put(number, member);
		System.out.println("추가되었습니다. 키 값 " + number);
	}
	public void remove() {
		System.out.print("번호 입력 : ");
		int number = sc.nextInt();
		map.remove(number);
	}
	public void print() {
		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext()) {
			Integer Integer = it.next();
			Member member = map.get(Integer);
			System.out.println("이름 : " + member.getName() + " 성별 : " + member.getGender());
		}
		Set<Entry<Integer, Member>>  setting = map.entrySet();
	}
}
public class MapTest2 {
	public static void main(String[] args) {
		new MapTest();
	}
}

