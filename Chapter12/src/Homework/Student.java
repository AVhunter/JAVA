package Homework;

public class Student {
	static void speak(int m)throws myException{
		if(m>1000) {
			throw new myException("太大了");
		}
		System.out.println("this is "+m);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s =new Student();
		try{
			s.speak(20);
		}catch(myException e) {
			System.out.println("too big");
		}
	}

}
