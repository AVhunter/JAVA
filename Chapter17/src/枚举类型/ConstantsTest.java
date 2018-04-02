package 枚举类型;

interface Constants {
	public static final int Constants_A=1;
	public static final int Constants_B=12;
}
public class ConstantsTest{
	enum Constants2{
		//将常量放在枚举类型中
		Constatns_A,Constatns_b
	}
	//使用接口定义常量
	public static void doit(int c) {//定义一个方法，这里参数为int
		switch(c) {
		case Constants.Constants_A:
			System.out.println("doit().Constants_A");
			break;
		case Constants.Constants_B:
			System.out.println("doit().Constants_B");
			break;
		}
	}
	public static void doit2(Constants2 c) {//定义一个参数对象是枚举类型的方法
		switch(c) {
		case Constatns_A:
			System.out.println("doit2() Constants_A");
			break;
		case Constatns_b:
			System.out.println("doit2() Constants_B");
			break;
		}
	}
	public static void main(String[] args) {
		ConstantsTest.doit(Constants.Constants_A);//使用接口中定义的常量
		ConstantsTest.doit2(Constants2.Constatns_A);//使用枚举类型定义的常量
		ConstantsTest.doit2(Constants2.Constatns_b);//使用枚举类型定义的常量
		ConstantsTest.doit(3);
	}
}
