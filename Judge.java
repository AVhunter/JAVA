package Number;

public class Judge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
		String str1="aaa@";
		String str2 = "aaaaa";
		String str3="111@11filc.dfg.com";
		if(str1.matches(regex)) 
			System.out.println(str1);
		if(str2.matches(regex))
			System.out.println(str2);
		if(str3.matches(regex))
			System.out.println(str3);
	}

}
