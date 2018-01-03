package 类的高级特性;
/**
 * 成员内部类
 * @author nelson
 *
 */
public class OuterClass {
	innerClass in = new innerClass();//在外部类实例化内部类对象引用
	public void ouf() {
		in.inf();//在外部类方法中调用内部类方法
	}
	class innerClass{
		innerClass(){//内部类的构造方法
			
		}
		public void inf() {//内部类方法
			
		}
		int y=0;//内部类成员变量
		
	}
	public innerClass doit() {//外部类的方法
		in.y=4;
		return new innerClass();//返回内部类对象
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass out = new OuterClass();
		//内部类的对象实例化操作必须在外部类或外部类的非静态方法中实现
		OuterClass.innerClass in = out.doit();
		OuterClass.innerClass in2 =out.new innerClass();
	}

}
