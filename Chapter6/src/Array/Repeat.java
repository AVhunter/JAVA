package Array;
/**
 * 
 * @author nelson
 *复制数组
 */
import java.util.Arrays;
public class Repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =new int[] {23,42,12,84,10};
		int newarr[] = Arrays.copyOfRange(arr, 0, 3);
		for(int x:newarr)
			System.out.println(x);
	}

}
