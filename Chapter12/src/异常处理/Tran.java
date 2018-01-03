package 异常处理;

public class Tran {
	static int avg(int n1,int n2)throws MyException{
		if(n1<0||n2<0) {
			throw new MyException("不可以使用负数");
		}
		if(n1>100||n2>100) {
			throw new MyException("太大了");
		}
		return (n1+n2)/2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int result = avg(102,150);
			System.out.println(result);
		}catch (MyException e) {
			System.out.println(e);
		}
	}

}
