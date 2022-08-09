package generics2;

public class TreeDPrinter<T extends Material>  {

	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
}
