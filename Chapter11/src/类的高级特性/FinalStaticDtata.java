package 类的高级特性;
import java.util.Random;
import static java.lang.System.out;
public class FinalStaticDtata {
	private static Random rand = new Random();
	private final int a1 = rand.nextInt(10);
	private static final int a2 = rand.nextInt(10);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalStaticDtata fdata = new FinalStaticDtata();
		out.println("重新实例化对象调用a1的值："+fdata.a1);
		out.println("重新实例化对象调用a2的值："+fdata.a2);
		FinalStaticDtata fdata2 = new FinalStaticDtata();
		out.println("重新实例化对象调用a1的值："+fdata2.a1);
		out.println("重新实例化对象调用a2的值："+fdata2.a2);

	}

}
