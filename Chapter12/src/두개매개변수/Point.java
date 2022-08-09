package 두개매개변수;

// T,V 두 개의 자료형 매개변수 사용
public class Point <T,V> {
	T x;
	V y;
	public Point(T x , V y) {
		this.x = x;
		this.y = y;
	}
	// 제네릭 메서드 
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public V getY() {
		return y;
	}
	public void setY(V y) {
		this.y = y;
	}
}
