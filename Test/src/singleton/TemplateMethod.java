package singleton;

abstract class Pizza {
	protected void prepare() {
		System.out.println("준비");
	}
	abstract void topping();
	protected void gubda() {
		System.out.println("굽다");
	}
	protected void makepizza() {
		prepare();
		topping();
		gubda();
	}
}
class BulGogiPizza extends Pizza {
	@Override
	void topping() {
		System.out.println("불고기를 넣는다.");
	}
}
public class TemplateMethod {
	public static void main(String[] args) {
		Pizza bulgogi = new BulGogiPizza();
		bulgogi.makepizza();
	}
}
