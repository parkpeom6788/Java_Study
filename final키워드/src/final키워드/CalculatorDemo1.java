package final키워드;

class Calculator {
	
	// final 로 한번 값이 할당하면 그 값을 바꿀수 없다 
	// 값이 변경되는것을 규제 할수 있다 
	static final double PI = 3.14; // final static -> 상수 
	int left , right;
	
	public void setOprands(int left , int right) {
		this.left = left;
		this.right = right;
//		Calculator.PI = 4.54; 값 변경 불가 
	}
	public void sum() {
		System.out.println(this.left + this.right);
	}
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class CalculatorDemo1 {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println(c1.PI);
		System.out.println(Calculator.PI); 
	}
}