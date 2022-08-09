package sec07_exam;

public interface Animal {
	public abstract void cry();
}

class Cat implements Animal {
	public void cry() {
		System.out.println("냐옹냐옹");
	}
}
class Dog implements Animal {
	public void cry() {
		System.out.println("멍멍!");
	}
}
