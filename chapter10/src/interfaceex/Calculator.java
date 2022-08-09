package interfaceex;

public abstract class Calculator implements Calc {  // 타입 상속 
	
	/* 구현상속 : 자바에서 인터페이스 임플리먼츠  
	 * 
	 * 
	 */
	

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
}
