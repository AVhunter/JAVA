package 类的高级特性;
interface OutInterface{//定义一个接口
	public void f();
}
public class InterfaceInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass2 out = new OuterClass2();//实例化一个外部类对象
		OutInterface outinter = out.doit();
		outinter.f();
	}

}
class OuterClass2{
	private class InnerClass implements OutInterface{
		InnerClass(String s){//内部类的构造方法
			System.out.println(s);
		}
		public void f() {
			System.out.println("访问内部类中的f()方法");
		}
	}
	public OutInterface doit() {//定义一个返回值为OutInterface接口的方法
		return new InnerClass("访问内部类构造方法");
		
	}
}
