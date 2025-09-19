import java.util.Scanner;
public class Arrayadd {

	public static void main(String[] args) {
		// Scanner input = new Scanner(System.in);
		// int[] arr = {1,2,3};
		// while(true) {
		// 	int len = arr.length; //确认原数组的长度
		// 	System.out.println("是否继续添加元素 ： y/n");
		// 	char verifty = input.next().charAt(0);
		// 	if(verifty == 'y') { 
		// 		int[] arr2 = new int[len + 1]; //创建一个新的数组准备接受新的元素
		// 		for(int i = 0; i < arr2.length; i++) {
		// 			if(i < len) {
		// 				arr2[i] = arr[i]; //保持原有数组的元素
		// 			} 
		// 			else {
		// 				System.out.println("请输入你要添加的元素 ：");
		// 				arr2[i] = input.nextInt(); //保存增加的新元素
		// 			}
		// 		}
		// 		arr = arr2; //替换原有数组，形成新的数组
		// 	}
		// 	else {
		// 		System.out.println("退出添加元素");
		// 		break;//根据用户输入情况退出该数组
		// 	}
		// }

		// for(int i = 0; i < arr.length; i++) {
		// 	System.out.print(arr[i] + "\t");
		// }


		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3};
		do{

			int[] arr2 = new int[arr.length + 1];
			for(int i = 0; i < arr.length; i++) {
				arr2[i] = arr[i];
			}
			System.out.println("请输入你要添加的元素 ： ");
			arr2[arr.length] = sc.nextInt();
			arr = arr2;
			System.out.println("添加成功，当前数组为 ：");
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println("是否继续添加元素 (y/n)： ");
			char key = sc.next().charAt(0);
			if(key != 'y') {
				break;
			}
		}while(true);
		System.out.println("退出添加元素~");
	}
}