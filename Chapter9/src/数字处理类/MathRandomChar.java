package 数字处理类;
/**
 * 随机生成字符
 * @author nelson
 *
 */
public class MathRandomChar {
	public static char GetRandomChar(char char1,char char2) {
		return (char)(char1 + Math.random()*(char2 - char1 +1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("任意小写字符"+GetRandomChar('a','z'));
		System.out.println("任意大写字符"+GetRandomChar('A','Z'));
		System.out.println("0到9的任意数字"+GetRandomChar('0','9'));
	}

}
