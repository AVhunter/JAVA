package Objects;

public class Homework2 {
	private int x;
	private int y;
	public Homework2(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public int Area() {
		return x*y;
	}
	public static void main(String[] args) {
		Homework2 s = new Homework2(4,7);
		System.out.println(s.Area());
		
	}
	
}
