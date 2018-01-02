package 接口继承与多态;

interface drawTest{
	public void draw();
}
class ParallelogramUseInterface extends QuadrangleUseInterface implements drawTest{
	public void draw() {
		System.out.println("平行四边形.draw()");
	}
	public void doAnyThing() {
		
	}
}
class SquareUseInterface extends QuadrangleUseInterface implements drawTest{
	public void draw() {
		System.out.println("正方形.draw()");
	}
	public void doAnyThing() {
		
	}
}
class AnyThingUseInterface extends QuadrangleUseInterface{
	public void doAnyThing() {
		
	}
}
public class QuadrangleUseInterface {
	public void doAnyThing() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		drawTest[] d= {
				new SquareUseInterface(),new ParallelogramUseInterface()};
		for(int i=0;i<d.length;i++)
			d[i].draw();
	}

}
