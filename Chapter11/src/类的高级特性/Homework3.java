package 类的高级特性;
/**
 * 写一个静态内部类，并在主方法中实例化
 * @author nelson
 *
 */
public class Homework3 {
	static class a{
		void f() {
			System.out.println("f()");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Homework3.a aa= new a();
		aa.f();
		
	}

}
