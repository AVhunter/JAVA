package 集合类;

import java.util.*;

/**
 * Map集合
 * Map集合类没有继承Collection接口,其提供的是key到value的映射
 * @author nelson
 *
 */

public class UpdateStu2{
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();//创建Map实例
		map.put("01", "李同学");//向集合中添加元素
		map.put("02", "未同学");
		map.put("03", "陈同学");
		
		Set<String> set = map.keySet();//构建Map集合中所有key对象的集合
		Iterator<String> it =set.iterator();
		System.out.println("key集合中的元素");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Collection <String> coll = map.values();//构建Map集合中所有values对象的集合
		it = coll.iterator();
		System.out.println("values集合中的元素");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}