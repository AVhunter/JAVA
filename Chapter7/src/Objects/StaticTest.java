package Objects;

public class StaticTest {
	static double PI=3.14;
	static int id;
	public static void method1() {
		//
	}
	public void method2() {
		System.out.println(StaticTest.PI);
		System.out.println(StaticTest.id);
		StaticTest.method1();
	}
}
