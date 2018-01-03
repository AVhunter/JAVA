package Homework;

public class Number {
	static int mul(int a,int b) throws Exception{
		return a*b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int result = mul(2,3);
			System.out.println(result);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println('e');
		}
	}

}
