package ch11;

import java.util.HashSet;
import java.util.Objects;

public class Ex11_11 {
	
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("abc");
		set.add("abc"); // 중복이라 저장안됨 
		
		set.add(new Person("David",10));
		set.add(new Person("David",10)); 		// 중복제거가 안됨;; 둘다 저장이됨.. equals 와 hashcode 가 없어서 ...오버라이딩 해야함 
		 
		System.out.println(set);
	}
}
class Person {
	private String name;
	private int age;
	
	public Person() {}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return name + age;
	}
	@Override
	public int hashCode() {
		// int hash(Object... values); // 가변인자 
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		// 나 자신(this)의 이름과 나이를 p와 비교  
		Person p = (Person)obj;
		return this.name.equals(p.name) && this.age == p.age;
	}
}
