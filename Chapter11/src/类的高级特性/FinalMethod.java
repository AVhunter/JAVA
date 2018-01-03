package 类的高级特性;

class Parents{
	private final void doit() {
		System.out.println("父类doit方法");
	}
	final void doit2() {
		System.out.println("父类的doit2方法");
	}
	public void doit3() {
		System.out.println("父类的doit3方法");
	}
}
class Sub extends Parents{
	public final void doit() {
		System.out.println("子类.doit()");
	}
	//final void doit2() {
	//	System.out.println("子类.doit2()方法");
	//}
	public void doit3() {
		System.out.println("子类.doit3()方法");
	}
}
public class FinalMethod {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub s = new Sub();
		s.doit();
		Parents p =s;
		p.doit2();
		p.doit3();
	}

}
