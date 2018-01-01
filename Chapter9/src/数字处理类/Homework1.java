package 数字处理类;
/**
 * 获取2～32之间的6个偶数，求和
 * @author nelson
 *
 */
public class Homework1 {
	public static int GetEven(int value1,int value2) {
		int randnum = value1+(int)(Math.random()*(value2-value1));
		if(randnum%2==0)
			return randnum;
		else
			return randnum+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int randnum;
		for(int i=0;i<6;i++) {
			randnum = GetEven(2,32);
			System.out.println("第"+i+"个数字是"+randnum);
			sum+=randnum;
		}
		System.out.println("6个随机数和是 "+sum);
	}

}
