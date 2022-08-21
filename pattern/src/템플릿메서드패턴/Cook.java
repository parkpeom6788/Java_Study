package 템플릿메서드패턴;

abstract class Pizza {
	public void cook() {
		prepare();
		topping();
		gubda();
		order();
	}
	private void prepare() {
		System.out.println("준비");
	}
	protected abstract void topping();
	
	private void gubda() {
		System.out.println("굽다");
	}
	private void order() {
		System.out.println("내놓다");
	}
}
class BulgogiPizza extends Pizza {
	@Override
	public void topping() {
		System.out.println("불고기를 넣다");
	}
}
class ChickenPizza extends Pizza {
	@Override
	public void topping() {
		System.out.println("치킨을 넣다");
	}
}
public class Cook {
	public static void main(String[] args) {
		Pizza bulgogipizza = new BulgogiPizza();
		bulgogipizza.cook();
		
		System.out.println("-----------------");
		ChickenPizza chickenpizza = new ChickenPizza();
		chickenpizza.cook();
	}
}
