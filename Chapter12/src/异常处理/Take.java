package 异常处理;

public class Take {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String str = "lili";
			System.out.println(str+"年龄是");
			int age = Integer.parseInt("20U");
			System.out.println(age);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("program err");
	}

}
