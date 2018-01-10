package 集合类;

/**
 * 实例化集合对象
 * Collection 是接口
 * @author nelson
 *
 */
import java.util.*;
public class Muster{
	public static void main(String[] args) {
		Collection<String> list = new ArrayList<>();//创建一个集合类对象
		list.add("a");
		list.add("b");//向集合中添加元素
		list.add("c");
		
		Iterator<String> it = list.iterator();//创建一个迭代器用于遍历集合
		while(it.hasNext()) {
			String str = (String)it.next();
			System.out.println(str);
		}
		
	}
}
