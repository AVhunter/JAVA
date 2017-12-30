package Array;
/**
 * 输出最小的数
 * @author nelson
 *
 */
public class HOMEWORK2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,3,4,5};
		int pos=0;
		for(int i=0;i<arr.length;i++)
			if(arr[i]<arr[pos])
				pos=i;
		System.out.println(arr[pos]);
	}

}
