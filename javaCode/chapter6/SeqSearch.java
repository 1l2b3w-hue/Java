import java.util.Scanner;
public class SeqSearch {

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// String[] arr = {"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"};
		// System.out.println("请输入你要查找的名字 ：");
		// String name = sc.next();
		// int index = 0;
		// for(int i = 0; i < arr.length; i++) {
		// 	if(name.equals(arr[i])) {
		// 		index = i;
		// 		break;
		// 	}
		// }
		// if(index != 0) {
		// 	System.out.println("找到了，下标为：" + index);
		// }
		// else {
		// 	System.out.println("没有找到你输入的名字");
		// }
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int left = 0;
		int right = arr.length - 1;
		boolean flag = true;
		System.out.println("请输入你要查找的数字 :");
		int number = sc.nextInt();
		while(left <= right) {
			int mid = (left + right) / 2;
			if(number > mid ){
				left = mid + 1;
			}
			else if(number < mid) {
				right = mid - 1;
			}
			else {
				System.out.println("找到了，下标为：" + mid);
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("没有找到你输入的数字");
		}
	}
}