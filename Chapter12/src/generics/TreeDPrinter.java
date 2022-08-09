package generics;


							// Material 를 상속받은 애들만 올수있다.
public class TreeDPrinter<T extends Material> {
	
	private T material; // Object 로 모든클래스의 최상의 클래스
					// 어떤타입이 들어오든 Object로 변환되어 사용
	public T getMaterial() {
		return material;
	}
	public void setMaterial(T material) {
		this.material = material;
//		material.doPrinting();
	}
	
	@Override
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
}
