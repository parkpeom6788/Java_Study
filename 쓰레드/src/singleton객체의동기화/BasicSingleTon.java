package singleton객체의동기화;

import java.util.Objects;

public class BasicSingleTon {
	
	private static BasicSingleTon sBasicSingleton;
	
	public static synchronized BasicSingleTon getInstance() {
		if(Objects.isNull(sBasicSingleton)) {
			sBasicSingleton = new BasicSingleTon(); // 지연 초기화 방식 하지만 멀티 스레드 환경에서는 getInstance() 가 동시에 호출될 수 있으므로 동기화 이슈가 발생 synchronized동기화 메서드를 사용하여 해결할 수 있다.
		}
		return sBasicSingleton;
		
		
		// 하지만 문제가 생김 -> 싱글톤에 synchronized가 많을수록 멀티스레드는 병목현상을 겪는다
		// 쉽게 말해 멀티스레드를 사용하지만 Singleton을 사용할 때는 싱글스레드 처럼 동작하는 문제 발생
		
		// 이럴떄는 LazyHolder 방식을 사용한다. 
		// LazyHolder 방식은 JVM의 클래스 초기화 과정에 보장되는 thread-safe특성을 이용해 싱글톤의 초기화 책임을 JVM에게 넘겨 개발자가 직접 동기화 코드를 작성할 때 문제를 회피할 수 있다
		// 또한 내부 static class 를 참조 하기 전까지 클래스 로딩이 발생하지 않기 때문에 메모리를 효율적으로 사용할 수 있다
		
	}
}

