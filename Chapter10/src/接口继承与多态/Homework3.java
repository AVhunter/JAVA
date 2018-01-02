package 接口继承与多态;

public abstract class Homework3 {
	abstract void testAbstract();
	Homework3(){
		System.out.println("before testAbstract()");
		testAbstract();
		System.out.println("after testAbstract()");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new sonTest();
	}

}

class sonTest extends Homework3{
	private int i=9999;
	void testAbstract() {
		System.out.println("testAbstract()"+i);
	}
	public sonTest() {
		System.out.println(i);
	}
}
