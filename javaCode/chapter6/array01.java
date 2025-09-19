import java.util.Scanner;
public class array01 {

	public static void main(String[] args) {
		// 变量要定义很多
		// double a1 = 3;
		// double a2 = 5;
		// double a3 = 1;
		// double a4 = 3.4;
		// double a5 = 2;
		// double a6 = 50;
		// double sum = a1 + a2 + a3 + a4 + a5 + a6;
		// System.out.println("六只鸡总重为 ： " + sum + "千克" + " 平均重量为 ： " + 
		// 		(sum / 6) + "千克");

		// 引入数组
		// double[] : 表示一个double类型的数组，数组名为 ： hen
		// {3, 5, 1, 3.4, 2, 50} ： 表示数组的值/元素，依次表示数组的第几个元素
		// double[] hen = {3, 5, 1, 3.4, 2, 50, 7.8, 88.9};
		// double totalWeight = 0;
		// // 可以通过数组名.length来获取一个数组的长度
		// int number = hen.length;
		// System.out.println("数组的长度为 ：" + number);
		// //可以通过for循环来遍历数组
		// for(int i = 0; i < number; i++) {
		// 	// 我们可以通过hen[下标]来访问数组中的元素
		// 	// 下标是从0开始
		// 	// System.out.println("第" + i + "个元素的值为：" + hen[i]);

		// 	totalWeight += hen[i];
		// }
		// System.out.println("六只鸡总重为 ： " + totalWeight + "千克" + " 平均重量为 ： " + 
		// 		(totalWeight / number) + "千克");

		// 循环输入5个数，保存在double数组并输出
		// Scanner input = new Scanner(System.in);
		// double[] scores = new double[5];

		// for(int i = 0; i < scores.length; i++) {
		// 	System.out.println("请输入第"+ (i + 1) +  "个人的成绩 ：");
		// 	scores[i] = input.nextDouble();
		// }
		// System.out.println("成绩输出 ：");
		// for(int i = 0; i < scores.length; i++) {
		// 	System.out.print(scores[i] + "\t");
		// }

		// Scanner input = new Scanner(System.in);
		// double[] scores;
		// scores = new double[5];
		// for(int i = 0; i < scores.length; i++) {
		// 	System.out.println("请输入第"+ (i + 1) +  "个人的成绩 ：");
		// 	scores[i] = input.nextDouble();
		// }
		// System.out.println("成绩输出 ：");
		// for(int i = 0; i < scores.length; i++) {
		// 	System.out.println(scores[i]);
		// }

		// 1.数组是多个相同数据类型的组合，实现对这些数据的操作
		// int[] arr = {1,2,3,4,5,6};
		// // int[] arr = {1,2,3,4,5,6,1.1,"hello"};//妄图将double和String类型赋值给int
		// double[] arr1 = {1,2,3,5}; //自动转换可以实现

		// 2.数组中的元素可以是任何数据类型，基本类型和引用类型都可以
		// String[] arr = {"|","北京","123"};

		// 3.数组被创建后，如果没有赋值，将会赋值默认值 ： 
		//  int byte short long : 0; float double : 0.0 boolean : false String: null char :\u0000(0字符)
		// short[] arr2 = new short[4];
		// for(int i = 0; i < arr2.length; i++) {
		// 	System.out.println(arr2[i]);
		// }

		//4.数组下标必须在规定范围内使用，越出报错（下标越界异常）
		// int[] arr4 = new int[5];
		// System.out.println(arr4[5]);

		// 5.数组属于引用类型数据，数组型数据是对象（数组本事就是一个对象）

		//1.
		// char[] arr = new char[26];
		// for(int i = 0; i < arr.length; i++) {
		// 	arr[i] = (char)('A' + i);
		// }
		// for(int i = 0; i < arr.length; i++) {
		// 	System.out.print(arr[i] + " ");
		// }

		// 2.
		// int[] arr = {4,-1,9,10,23};
		// int max = 0;
		// for(int i = 1; i < arr.length; i++) {
		// 	if(arr[i] > arr[max]) {
		// 		max = i;
		// 	}
		// }
		// System.out.println("最大值为" + arr[max] + " 其下标为： " + max);

		//3.
		// double[] arr = {4,1,9,10,23};
		// double sum = 0;
		// for(int i = 0; i < arr.length; i++) {
		// 	sum += arr[i];
		// }
		// System.out.println("和为 ："+ sum + " 平均值为 ：" + (sum / arr.length));

		// 基本数据类型赋值 ,赋值方式是值拷贝 ： 一个变量的变化不会影响到其他变量
		// int n1 = 2;
		// int n2 = n1;
		// n2 = 80;
		// System.out.println("n1 = " + n1);
		// System.out.println("n2 = " + n2);
		// // 数组赋值，默认情况下是引用传递，赋值方式是引用赋值，赋值的是地址
		// int[] arr1 = {1,2,3};
		// int[] arr2 = arr1; //arr2的变化会影响到arr1的内容
		// arr2[0] = 0;
		// for(int i = 0; i < arr1.length; i++) {
		// 	System.out.print(arr1[i]);
		// }

		//数组的拷贝
		// int[] arr1 = {1,2,3};
		// int[] arr2 = new int[arr1.length]; //保持数组2于数组1大小一致
		// for(int i = 0; i < arr1.length; i++) {
		// 	arr2[i] = arr1[i];
		// }
		// for(int i = 0; i < arr1.length; i++) {
		// 	System.out.print(arr1[i]);
		// }
		// System.out.println();
		// for(int i = 0; i < arr2.length; i++) {
		// 	System.out.print(arr2[i]);
		// }
		// arr2[0] = 10;
		// System.out.println();
		// for(int i = 0; i < arr1.length; i++) {
		// 	System.out.print(arr1[i]);
		// }
		// System.out.println();
		// for(int i = 0; i < arr2.length; i++) {
		// 	System.out.print(arr2[i]);
		// }

		//数组的反转
		int[] arr = {11,22,33,44,55,66};
		// int right = arr.length - 1;
		// int left = 0;
		// while(left < right) {
		// 	arr[left] = arr[left] ^ arr[right];
		// 	arr[right] = arr[left] ^ arr[right];
		// 	arr[left] = arr[left] ^ arr[right];
		// 	left++;
		// 	right--;
		// }
		// for(int i = 0; i < arr.length / 2; i++){ //一定要除2，不然遍历到后面又重新变回去了
		// 	int tempt = arr[i];
		// 	arr[i] = arr[arr.length - 1 - i]; 
		// 	arr[arr.length - 1 - i] = tempt;
		// }
		int[] arr2 = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = arr[arr.length - 1 -i];
		}
		arr = arr2; //原有数组空间没有被引用，被销毁
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}