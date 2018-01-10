package 集合类;
/**
 * set集合
 * 实现Comarable接口，重写该接口中的compareTo()方法。在主方法中创建Update对象
 * 添加到集合中
 * @author nelson
 *
 */
import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;
public class UpdateStu implements Comparable<Object>{//创建类实现Comparable接口
	String name;
	long id;
	public UpdateStu(String name,long id) {
		this.id = id;
		this.name = name;
	}
	public int compareTo(Object o) {
		UpdateStu upstu = (UpdateStu)o;
		int result = id>upstu.id?1:(id==upstu.id?0:-1);
		return result;
	}
	public void setId(long id) {
		this.id =id;
	}
	public long getId() {
		return this.id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UpdateStu stu1 = new UpdateStu("李同学",01011);
		UpdateStu stu2 = new UpdateStu("陈同学",01021);
		UpdateStu stu3 = new UpdateStu("王同学",01051);
		UpdateStu stu4 = new UpdateStu("力同学",01012);
		
		TreeSet<UpdateStu> tree = new TreeSet<>();
		tree.add(stu1);
		tree.add(stu2);
		tree.add(stu3);
		tree.add(stu4);
		
		Iterator<UpdateStu> it = tree.iterator();//set集合中的所有对象的迭代器
		System.out.println("Set集合中的所有元素:");
		while(it.hasNext()) {
			UpdateStu stu = (UpdateStu)it.next();
			System.out.println(stu.getId()+" "+stu.getName());
		}
		it=tree.headSet(stu2).iterator();//截取排在stu2对象之前的对象
		System.out.println("截取前面部分的集合");
		while(it.hasNext()) {
			UpdateStu stu = (UpdateStu)it.next();
			System.out.println(stu.getId()+" "+stu.getName());
		}
		
		it = tree.subSet(stu2, stu3).iterator();
		System.out.println("截取中间部分的集合");
		while(it.hasNext()) {
			UpdateStu stu = (UpdateStu)it.next();
			System.out.println(stu.getId()+" "+stu.getName());
		}
		
	}

}
