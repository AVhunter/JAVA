package 接口继承与多态;

public class Homework2 {
	public void do1() {
		System.out.println("父类的方法1");
	}
	public void do2() {
		System.out.println("父类的方法2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Homework2 s = new son();
		s.do2();
		s.do1();
	}

}

class son extends Homework2{
	public void do2() {
		System.out.println("子类的方法2");
	}
}