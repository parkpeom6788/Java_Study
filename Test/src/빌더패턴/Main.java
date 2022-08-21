package 빌더패턴;

public class Main {
	public static void main(String[] args) {
		Person person = Person.builder()
				.a("a")
				.b("b")
				.c("c")
				.d("d")
				.build();
		System.out.println();
	}
}





