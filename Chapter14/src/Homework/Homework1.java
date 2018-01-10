package Homework;
/**
 * 将1～100之间所有正整数放在一个List集合中，并将集合中索引位置是10的对象从集合中移除
 * @author nelson
 *
 */
import java.util.*;
public class Homework1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<101;i++)
			list.add(i);
		list.remove(10);
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i)+" ");
	}

}
