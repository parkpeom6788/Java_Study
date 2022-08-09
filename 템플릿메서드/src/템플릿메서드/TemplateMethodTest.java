package 템플릿메서드;

public abstract class TemplateMethodTest {
	public void make() {
		prepare();
		fire();
		soup();
		meon();
		palpal();
	}
	protected void prepare() {
		System.out.println("물을 올린다");
	}
	protected void fire() {
		System.out.println("불을 킨다");
	}
	protected abstract void soup();
	protected void meon() {
		System.out.println("면을 넣는다");
	}
	protected void palpal() {
		System.out.println("팔팔끊는다");
	}
}
