package 数字处理类;
/**
 * 两种格式化数字的方式
 * @author nelson
 *
 */
import java.text.DecimalFormat;
public class DecimalFormatSimpleDemo {
	//使用实例化对象时设置格式化模式
	static public void SimpleFormat(String pattern,double value) {
		DecimalFormat myFormat = new DecimalFormat(pattern);
		String output = myFormat.format(value);
		System.out.println(value+"   "+pattern+"   "+output);
	}
	//使用applyPattern()方法对数字进行格式化
	static public void UseApplyPatternMethodFormat(String pattern,double value) {
		DecimalFormat myFormat = new DecimalFormat();
		myFormat.applyPattern(pattern);
		System.out.println(value+"   "+pattern+"   "+myFormat.format(value));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("值            样式        格式化后");
		SimpleFormat("###,###,###",123456.789);
		SimpleFormat("00000000.###kg",123456.789);
		//按照格式化模版，不存在的位以0显示
		SimpleFormat("000000.000",123.78);
		UseApplyPatternMethodFormat("#.###%",0.789);
		UseApplyPatternMethodFormat("###.##",123456.789);
		//将数字转化为千分数
		UseApplyPatternMethodFormat("0.00\u2030",0.789);
		
	}

}
