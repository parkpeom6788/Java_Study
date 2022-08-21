package ch11;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Ex11_2 {
	// Queue 는 인터페이스
	// Stack 는 클래스 
	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList(); // Queue 인터페이스 구현체인 LinkedList 클래스  
		st.push("0");
		st.push("1");
		st.push("2");

		q.offer("0");
		q.offer("1");
		q.offer("2");
		System.out.println("= Stack ="); 
		while(!st.empty()) {
			System.out.println(st.pop()); // 2 1 0
		}
		System.out.println("= Queue =");
		while(!q.isEmpty()) {
			System.out.println(q.poll()); // 0 1 2 
		}
	}
}
