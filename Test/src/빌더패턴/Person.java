package 빌더패턴;
public class Person {
	private String a;
	private String b;
	private String c;
	private String d;
	// Builder 객체 생성 
	
	public static PersonBuilder builder() {
	
		return new PersonBuilder();
		
	}
	static class PersonBuilder {
		String a;
		String b;
		String c;
		String d;
		
		PersonBuilder a(String a) {
			this.a = a;
			return this;
		}
		PersonBuilder b(String b) {
			this.b = b;
			return this;
		}
		PersonBuilder c(String c) {
			this.c = c;
			return this;
		}
		PersonBuilder d(String d) {
			this.d = d;
			return this;
		}
		Person build() {
			Person person = new Person();
			person.a = this.a;
			person.b = this.b;
			person.c = this.c;
			person.d = this.d;
			return person;
		}	
	}
	// getter
	public String getA() {
		return a;
	}
	public String getB() {
		return b;
	}
	public String getC() {
		return c;
	}
	public String getD() {
		return d;
	}
}
