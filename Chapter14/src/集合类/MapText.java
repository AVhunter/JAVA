package 集合类;
/**
 * HashMap与TreeMap类的不同点
 * @author nelson
 *
 */
import java.util.*;
public class MapText {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<>();//由HashMap实现的Map对象
		Emp emp =new Emp("001","张飞");
		Emp emp2 = new Emp("002","刘备");
		Emp emp3 = new Emp("003","关羽");
		map.put(emp.getId(),emp.getName());
		map.put(emp2.getId(), emp2.getName());
		map.put(emp3.getId(), emp3.getName());
		
		Set<String> set = map.keySet();
		Iterator <String> it = set.iterator();
		System.out.println("HashMap类实现的Map集合,无序号");
		while(it.hasNext()) {
			String str = (String)it.next();
			String name = (String)map.get(str);
			System.out.println(str+" "+name);
		}
		TreeMap<String,String> treemap = new TreeMap<>();
		treemap.putAll(map);
		Iterator <String> iter = treemap.keySet().iterator();
		System.out.println("TreeMap类实现的集合，键对象升序");
		while(iter.hasNext()) {
			String str = (String)iter.next();
			String name = (String)treemap.get(str);
			System.out.println(str+" "+name);
		}
		
	}

}
