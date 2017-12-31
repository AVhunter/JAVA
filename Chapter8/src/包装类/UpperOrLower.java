package 包装类;

public class UpperOrLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character mychar1 = new Character('A');
		Character mychar2 = new Character('a');
		System.out.println(mychar1+"是大写吗:"+mychar1.isUpperCase(mychar1));
		System.out.println(mychar2+"是小写吗:"+mychar2.isLowerCase(mychar2));
	}

}
