package 제네릭;

class Animal {
	
}
public class generic <T extends Animal> {
	private T name;
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
}
