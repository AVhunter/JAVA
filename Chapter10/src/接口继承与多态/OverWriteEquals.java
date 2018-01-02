package 接口继承与多态;
/**
 * 定义两个字符串对象，调用equals()方法看他俩可相等
 * equals()方法主要看内容是否相等
 * @author nelson
 *
 */
class V{
	
}
public class OverWriteEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "123";
		String s2 = "123";
		System.out.println(s1.equals(s2));
		V v1 = new V();
		V v2 = new V();
		System.out.println(v1.equals(v2));
	}

}
