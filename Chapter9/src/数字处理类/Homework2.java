package 数字处理类;
/**
 * 求圆的面积
 * @author nelson
 *
 */
import java.text.DecimalFormat;
public class Homework2 {
	public static double CircleArea(double r) {
		return Math.PI*r*r;
	}
	public static void SimpleFormat(String pattern,double value) {
		DecimalFormat myFormat = new DecimalFormat(pattern);
		String output = myFormat.format(value);
		System.out.println(value + " "+ pattern+" "+output);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("圆的面积为： ");
		SimpleFormat("###.#####",CircleArea(2));
	}

}
