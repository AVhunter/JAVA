package 类的高级特性;
/**
 * 在方法中编写一个匿名内部类
 * @author nelson
 *
 */
interface OutInterface1{
	
	
}
public class Homework1 {
}
class OuterClass4{
	public OutInterface1 doit(final String s) {
		return new OutInterface1() {
			private int i=0;
			public int getValue() {
				System.out.println(s);
				return i;
			}
			public void f() {
				System.out.println("f()");
			}
		};
	}
}

