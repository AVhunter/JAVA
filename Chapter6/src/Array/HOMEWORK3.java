package Array;
/**
 * 将位置2的元素替换为bb
 * @author nelson
 *
 */
import java.util.Arrays;
public class HOMEWORK3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"1","2","3","4","5"};
		Arrays.fill(arr, 1,2,"bb");
		for(String x:arr)
			System.out.print(x+"  ");
	}
	

}
