package 包装类;
/**
 * Integer类的toString方法
 * @author nelson
 *
 */
public class Charac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = Integer.toString(456);
		String str2 = Integer.toBinaryString(456);
		String str3 = Integer.toOctalString(456);//八进制
		String str4 = Integer.toHexString(456);//十六进制
		System.out.println("456的十进制表示为:"+str);
		System.out.println("456的二进制表示为:"+str2);
		System.out.println("456的八进制表示为:"+str3);
		System.out.println("456的十六进制表示为:"+str4);
	}

}
