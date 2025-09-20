public class TwoDimensionalExercise {

	public static void main(String[] args) {
		// int[][] arr = {{4,6},{1,4,5,7},{-2}};
		// int sum = 0;
		// for(int i = 0; i < arr.length; i++) {
		// 	for(int j = 0; j < arr[i].length;j++) {
		// 		sum += arr[i][j];
		// 	}
		// }
		// System.out.println(sum);

		// 10行杨辉三角
		// int n = 10;
		// int[][] arr = new int[n][];

		// for(int i = 0; i < arr.length; i++) {
		// 	arr[i] = new int[i];
		// 	for(int j = 0; j < arr[i].length; j++) {
		// 		if(j == 0 || j == arr[i].length - 1) {
		// 			arr[i][j] = 1;
		// 		}
		// 		else {
		// 			arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
		// 		}
		// 		System.out.print(arr[i][j] + "\t");
		// 	}
		// 	System.out.println();
		// }

		// String[] arr = new String[3]{"123","234","345"};

		// 插入一个23，保持排序
		// int[] arr = {10,12,45,90};
		// int num = 23;
		// int[] arr2 = new int[arr.length + 1];
		// int count = 0;
		// for(int i = 0; i < arr2.length; i++) {
		// 	if(num < arr[i - count] && count ==0) {
		// 		arr2[i] = num;
		// 		count++; 
		// 	}
		// 	else {
		// 		arr2[i] = arr[i - count];
		// 	}
		// }
		// arr = arr2;
		// for(int i = 0; i < arr.length; i++){
		// 	System.out.print(arr[i] + "\t");
		// }
		// 先定位，后扩容
		// int[] arr = {10,12,45,90};
		// int insertNum = 23;
		// int index = -1;
		// for(int i = 0; i < arr.length; i++) {
		// 	if(insertNum < arr[i]) {
		// 		index = i;
		// 		break;
		// 	}
		// }
		// if(index == -1) {
		// 	index = arr.length;
		// }
		// System.out.println("index = " + index);
		// int[] arr2 = new int[arr.length + 1];
		// // 赋值，跳过index的位置
		// for(int i = 0,j = 0; i < arr2.length; i++) {
		// 	if(i == index) {
		// 		arr2[i] = insertNum;
		// 	}
		// 	else {
		// 		arr2[i] = arr[j];
		// 		j++;
		// 	}
		// }
		// arr = arr2;
		// for(int i = 0; i < arr.length; i++) {
		// 	System.out.print(arr[i] + "\t");
		// }

		//
		// int[] arr = new int[10];
		// for(int i = 0; i < arr.length; i++){
		// 	arr[i] =(int)(Math.random() * 100 )+ 1;
		// }
		// double sum = 0;
		// int maxIndex = 0;
		// boolean verify = false;
		// for(int i = arr.length - 1; i >= 0; i--) {
		// 	sum += arr[i];
		// 	if(arr[maxIndex] < arr[i]) {
		// 		maxIndex = i;
		// 	}
		// 	if(arr[i] == 8) {
		// 		verify = true;
		// 	}
		// 	System.out.print(arr[i] + "\t");
		// }
		// System.out.println();
		// if(verify) {
		// 	System.out.println("随机生成的元素中有8");
		// }
		// else {
		// 	System.out.println("随机生成的元素中没有8");
		// }
		// System.out.print("平均值为 ：" + (sum / arr.length) + " 最大值为 ：" +
		// 		arr[maxIndex] + " 最大值的下标为 " + maxIndex);

		// 
		int[] arr = {20,-1,89,2,890,7};

		for(int i = 0; i < arr.length - 1 ; i++) {
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] < arr[j + 1]){
					arr[j] = arr[j] ^ arr[j + 1];
					arr[j + 1] = arr[j] ^ arr[j + 1];
					arr[j] = arr[j] ^ arr[j + 1];
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}