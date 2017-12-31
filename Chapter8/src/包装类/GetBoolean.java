package 包装类;
/**
 * Boolean类的两种构造方法
 * @author nelson
 *
 */
public class GetBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("OK");
		System.out.println("b1:"+b1.booleanValue());
		System.out.println("b2:"+b2.booleanValue());
	}

}
