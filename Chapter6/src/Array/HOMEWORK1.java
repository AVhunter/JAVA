package Array;
import java.util.Arrays;
public class HOMEWORK1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = Arrays.copyOfRange(arr1, 0, 3);
		System.out.println("arr1的元素：");
		for(int x:arr1)
			System.out.print(x+"  ");
		System.out.println("\narr2的元素");
		for(int y:arr2)
			System.out.print(y+"  ");
	}

}
