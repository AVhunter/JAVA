package 接口继承与多态;
/**
 * 在类中重写toString()方法
 * 使用getClass().getName()得到当前类的名字
 * @author nelson
 *
 */

public class ObjectInstance {
	public String toString() {
		return "在"+getClass().getName()+"类中重写toString()方法";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectInstance s = new ObjectInstance();
		System.out.println(s.toString());
	}

}
