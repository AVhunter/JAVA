package Array;
/**
 * 二分查找
 * @author nelson
 *
 */
import java.util.Arrays;
public class Rakel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = new String[] {"ab","cd","ef","yz"};
		Arrays.sort(str);
		int index = Arrays.binarySearch(str, 0,2,"cd");
		System.out.println(index);
	}

}
