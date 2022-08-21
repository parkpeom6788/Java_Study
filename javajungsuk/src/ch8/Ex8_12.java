package ch8;

public class Ex8_12 {
	public static void main(String[] args) throws MyException {
		method();
	}
	public static void method() throws MyException  {
		throw new MyException("에러가 발생했어!!!!");
	}
}
