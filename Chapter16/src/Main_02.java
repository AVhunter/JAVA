import java.lang.reflect.*;
public class Main_02 {
	public static void main(String[] args) {
		Example_02 example=new Example_02();
		Class exampleC=example.getClass();
		//获得所有成员变量
		Field[] declaredFields=exampleC.getDeclaredFields();
		for(int i=0;i<declaredFields.length;i++) {
			Field field=declaredFields[i];//遍历成员变量
			System.out.println("名称为："+field.getName());
			//获得成员变量名称
			Class fieldType=field.getType();//获得成员变量的类型
			System.out.println("类型为："+fieldType);
			boolean isTurn=true;
			
			
			while(isTurn) {
				//如果该成员变量的访问权限是private，则抛出异常，即不允许访问
				try {
					isTurn =false;
					//获得成员变量值
					System.out.println("修改前的值为："+field.get(example));
					//判断成员变量的看类型难过是否int型
					if(fieldType.equals(int.class)) {
						System.out.println("利用方法setInt()修改成员变量的值");
						field.setInt(example, 168);
						
					}//否则判断该成员变量是否是float类型的
					else if(fieldType.equals(float.class)){
						System.out.println("利用方法setFloat()修改成员变量的值");
						field.setFloat(example,99.9F);
					}//否则判断该成员变量是否是boolean类型吧的
					else if(fieldType.equals(boolean.class)) {
						System.out.println("利用方法setBoolean()修改成员变量的值");
						field.setBoolean(example,true);
					}else {
						System.out.println("利用set()方法修改成员变量的值");
						//可以为各种类型的成员变量赋值
						field.set(example, "whatFuck");
					}
					//获得成员变量值
					System.out.println("修改后的值为: "+field.get(example));
					
				}catch(Exception e) {
					System.out.println("在设置成员变量时抛出异常，"+"下面执行setAccessible()方法！");
					field.setAccessible(true);//设置为允许访问
					isTurn=true;
				}
			}
			System.out.println();
			
		}
		
	}
}
