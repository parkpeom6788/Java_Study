package collection.arraylist;

import java.util.ArrayList;

class MyStack{
	
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	// 꺼내면 없앰
	public String pop() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("스택이 비었습니다");
			return null;
		}
		// 데이터가 없는데 꺼내면 언더플로우 
		return arrayStack.remove(len-1);
	}
	
	// 그냥 꺼내보는거 peek 
	public String peek() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		return arrayStack.get(arrayStack.size()-1);
	}
}

public class StackTest {
	
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		
		stack.push("a");
		stack.push("b");
		stack.push("c");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		System.out.println(stack.pop());
		
	}
}
