package Homework;
/**
 * 分别向Set集合以及List集合中添加"A"、“a”、“c”、“C”、“a” 5个元素
 * 观察重复值“a”是否能在List集合以及Set集合中成功添加
 * @author nelson
 *
 */
import java.util.*;
public class Homework2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("a");
		list1.add("c");
		list1.add("C");
		list1.add("a");
		System.out.println("List集合中的元素");
		System.out.println(list1);
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("a");
		set.add("c");
		set.add("C");
		set.add("a");
		System.out.println("set集合中的元素");
		System.out.println(set);
	}

}
