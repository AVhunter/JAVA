package 接口继承与多态;
/**
 * 多态
 */
public class Q {
	private Q[] qtest = new Q[6];
	private int nextIndex = 0;
	public void draw(Q q) {
		if(nextIndex < qtest.length) {
			qtest[nextIndex] = q;
			System.out.println(nextIndex);
			nextIndex ++;
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q q = new Q();
		q.draw(new S());
		q.draw(new P());
	}
}
class S extends Q{
	public S() {
		System.out.println("正方形");
	}
}
class P extends Q{
	public P() {
		System.out.println("平行四边形");
	}
}