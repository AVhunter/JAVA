package 集合类;
/**
 * 按下标返回数组值
 * @author nelson
 *
 */
import java.util.*;
public class Gather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list =new ArrayList<>();//创建集合对象
		list.add("a");
		list.add("b");
		list.add("c");
		int i = (int)(Math.random()*(list.size()-1));
		System.out.println(list.get(i));//用get()方法返回对应位置的值
		list.remove(2);
		System.out.println("将位置2的元素移除后，集合值为：");
		for(int index=0;index<list.size();index++) {
			System.out.print(list.get(index)+" ");
		}
		System.out.println();
	}

}
