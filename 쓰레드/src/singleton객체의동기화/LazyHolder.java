package singleton객체의동기화;
// 싱글톤은 보통 DAO에서 
public class LazyHolder {
	private LazyHolder() {
	}
	
	private static LazyHolder getInstance() {
		
		return Holder.instance; // instance를 참조하는 순간 클래스가 로딩되며 초기화가 진행된다 
		// 클래스를 로딩하고 초기화하는 시점은 JVM의 영역이라 동기화를 보장하기 떄문에 volatile 이나 synchronized 키워드가 없어도 동기화를 보장하면서 성능도 좋은 방식이다 
	}
	private static class Holder { // 싱글톤의 초기화 시점을 JVM에게 넘긴다 
		public static final LazyHolder instance = new LazyHolder(); 
	}
}
