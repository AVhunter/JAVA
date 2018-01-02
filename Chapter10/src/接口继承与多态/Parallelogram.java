package 接口继承与多态;
/**
 * 用instanceof（）方法判断父类对象是不是子类对象的实例对象
 * @author nelson
 *
 */
class Quadrangle{
	public static void draw(Quadrangle q) {
		System.out.println("this is a quadrangle!");
	}
}
class Square extends Quadrangle{
	
}
class Anything{
	
}
public class Parallelogram extends Quadrangle{
	public static void main(String[] args) {
		Quadrangle q = new Quadrangle();
		if(q instanceof Parallelogram) {
			Parallelogram p =(Parallelogram)q;
			System.out.println("1");
		}
		if(q instanceof Square) {
			Square s = (Square)q;
			System.out.println("2");
		}
		
		
	}
}