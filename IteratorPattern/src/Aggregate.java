
public interface Aggregate {
	public abstract Iterator iterator();
}
public interface Iterator {
	public abstract boolean hasNext();
	public abstract Object next();
}
