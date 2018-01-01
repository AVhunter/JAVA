package 数字处理类;
/**
 * 数组格式化
 * @author nelson
 *
 */
import java.text.DecimalFormat;
public class DecimalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat myFormat = new DecimalFormat();
		myFormat.setGroupingSize(4);
		String output = myFormat.format(123456789);
		System.out.println("将数字以每两个数字分组 "+output);
		myFormat.setGroupingUsed(false);
		String output2 = myFormat.format(123456.789);
		System.out.println("不允许数字分组 "+output2);
	}

}
