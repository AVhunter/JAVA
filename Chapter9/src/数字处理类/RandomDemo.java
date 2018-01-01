package 数字处理类;
/**
 * 用Random()生成随机数
 * @author nelson
 *
 */
import java.util.Random;
public class RandomDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		System.out.println("随机生成一个0～10的数 "+r.nextInt(10));
		System.out.println("随机生成一个布尔值 "+r.nextBoolean());
		System.out.println("随机生成一个double值 "+r.nextDouble());
		System.out.println("随机生成一个float值 "+r.nextFloat());
	}

}
