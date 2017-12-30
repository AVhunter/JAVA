package Array;
/**
 * 反转排序
 * @author nelson
 *
 */
public class ReverseSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50,60};
		ReverseSort sorter = new ReverseSort();
		sorter.sort(arr);
	}
	public void sort(int[] arr) {
		/**
		 * 反转排序核心算法
		 */
		System.out.println("数组原始内容:");
		showArray(arr);
		int temp;
		int len = arr.length;
		for(int i=0;i<len/2;i++) {
			temp=arr[i];
			arr[i]=arr[len-i-1];
			arr[len-i-1]=temp;
		}
		
		System.out.println("\n数组反转过后的内容是:");
		showArray(arr);
	}
	public void showArray(int[] arr) {
		for(int x:arr)
			System.out.print(x+"  ");
	}

}
