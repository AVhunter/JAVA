package 接口继承与多态;


class Parent{
	Parent(){
		System.out.println("这是父类的构造方法");
	}
}
class SubParent extends Parent{
	SubParent(){
		System.out.println("这是子类的构造方法");
	}
}
public class Subroutine  extends SubParent{
	Subroutine(){
		System.out.println("这也是子类的构造方法");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subroutine s = new Subroutine();
	}

}
