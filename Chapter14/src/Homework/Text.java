package Homework;

import java.util.*;
public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<>();
		Emp emp1=new Emp("001","张飞");
		Emp emp2=new Emp("002","刘备");
		Emp emp3=new Emp("003","关羽");
		Emp emp4=new Emp("010","关羽");
		Emp emp5=new Emp("210","关羽");
		Emp emp6=new Emp("310","关羽");
		Emp emp7=new Emp("020","关羽");
		Emp emp8=new Emp("043","关羽");
		map.put(emp1.getId(),emp1.getName());
		map.put(emp2.getId(),emp2.getName());
		map.put(emp3.getId(),emp3.getName());
		map.put(emp4.getId(),emp4.getName());
		map.put(emp5.getId(),emp5.getName());
		map.put(emp6.getId(),emp6.getName());
		map.put(emp7.getId(),emp7.getName());
		map.put(emp8.getId(),emp8.getName());
		map.remove("001");
		for(String string:map.keySet()) {
			System.out.println(map.get(string));
		}
	}

}
