package 두개매개변수;

public class GenericTest {
	
	public static void main(String[] args) {
		
		Point<Integer,Double> p1 = new Point<Integer,Double>(0,0.0);
		Point<Integer,Double> p2 = new Point<Integer,Double>(10,10.0);
		
		double rect = GenericMethod.<Integer,Double>makeRectangle(p1, p2);
		
		System.out.println("두 점으로 만들어진 사각형의 넓이는 " + rect + " 입니다.");
		
	}
}
