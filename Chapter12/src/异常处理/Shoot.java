package 异常处理;

public class Shoot {
	static void pop() throws NegativeArraySizeException{
		int[] arr = new int[-3];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			pop();
		}catch(NegativeArraySizeException e) {
			System.out.println("pop方法抛出的异常");
		}
	}

}
