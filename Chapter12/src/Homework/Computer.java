package Homework;

public class Computer {
	static int big(int a,int b) throws myException{
		if(a<=0||b<=0) {
			throw new myException("负数错误");
		}
		int r = a%b;
		while(r!=0) {
			a=b;
			b=r;
			r=a%b;
		}
		return b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=122,b=0;
			int result =big(122,0);
			System.out.println(result);
		}catch(myException e) {
			e.printStackTrace();
		}
	}

}
