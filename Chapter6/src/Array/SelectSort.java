package Array;
/**
 * 直接选择排序
 * @author nelson
 *
 */
public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {63,4,24,1,3,15};
		SelectSort sorter = new SelectSort();
		sorter.sort(arr);
	}
	public void sort(int[] arr) {
		/**
		 * 选择排序核心算法
		 */
		int index;
		for(int i=1;i<arr.length;++i) {
			index=0;
			for(int j=1;j<=arr.length-i;j++)
				if(arr[j]>arr[index])
					index=j;
			int temp=arr[arr.length-i];
			arr[arr.length-i]=arr[index];
			arr[index]=temp;
		}
		showArray(arr);
	}
	public void showArray(int[] arr) {
		for(int x:arr)
			System.out.print(x+"<");
		System.out.println();
	}

}
