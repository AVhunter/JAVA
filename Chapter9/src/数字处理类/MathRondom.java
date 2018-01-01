package 数字处理类;
/**
 * 随机数
 * @author nelson
 *
 */
public class MathRondom {
	public static int GetEvenNum(double num1,double num2) {
		//产生num1～num2的随机数
		int s = (int)num1 +(int)(Math.random()*(num2-num1));
		if(s%2==0)
			return s;
		else
			return s+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("产生一个2～32的偶数: "+GetEvenNum(2,32));
	}

}
