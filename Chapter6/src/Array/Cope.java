package Array;
/**
 * 
 * @author nelson
 *对数组的复制
 */
import java.util.Arrays;
public class Cope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {23,42,12};
		int newarr[] = Arrays.copyOf(arr, 5);
		for(int x:newarr)
			System.out.println(x);
	}

}
