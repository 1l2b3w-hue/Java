import java.util.Scanner;
public class ArrayReduce {

	public static void main(String[] args) {
		// 根据用户要求是否删除最后的一个元素
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4,5};
		while(true) {
			System.out.println("是否删除数组最后一个元素 ： （y/n）");
			char key = sc.next().charAt(0);
			if(arr.length == 1) {
				System.out.println("不能在缩减了");
				break;
			}
			else {
				if(key == 'y') {
				int[] arr2 = new int[arr.length - 1];
				for(int i = 0; i < arr2.length; i++) {
					  arr2[i] = arr[i];
				}
				arr = arr2;
				System.out.println("现在数组元素为 ：");
				for(int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();
				}
				else {
					break;
				}
			}
		}
		System.out.println("退出删除最后一个元素~");
	}
}