package 추상클래스;

public abstract class Animal {
	
	String animal_name;
	
	public Animal(String name) {
		animal_name = name;
	}
	public abstract void cry();
	public abstract void behavior();
}



