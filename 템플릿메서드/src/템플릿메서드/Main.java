package 템플릿메서드;

class Sinramun extends TemplateMethodTest {

	@Override
	protected void soup() {
		System.out.println("신라면 수프를 넣는다.");
	}
}
public class Main {
	public static void main(String[] args) {
		
		TemplateMethodTest sinramun = new Sinramun();
		sinramun.make();
	}
}
