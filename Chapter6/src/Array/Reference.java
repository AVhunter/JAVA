package Array;
/**
 * 二分查找
 * @author nelson
 *
 */
import java.util.Arrays;
public class Reference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ia[] = new int[] {1,8,9,4,5};
		Arrays.sort(ia);
		int index=Arrays.binarySearch(ia, 4);
		System.out.println("4的索引位置是: "+index);
	}	

}
