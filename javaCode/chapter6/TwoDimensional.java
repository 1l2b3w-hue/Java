public class TwoDimensional {

	public static void main(String[] args) {
		// 定义一个二维数组
		// int[][] arr = {{0,0,0,0,0,0},{0,0,1,0,0,0},{0,2,0,3,0,0},{0,0,0,0,0,0}};

		// for(int i = 0; i < arr.length; i++) { // 遍历获得二维数组的每个元素（这个元素是数组）
		// 	// arr[i].length 得到二维数组中一维数组元素的长度
		// 	for(int j = 0; j < arr[i].length; j++) {

		// 		System.out.print(arr[i][j] + " ");
		// 	}
		// 	System.out.println();
		// }
		// System.out.println(arr[2][3]); // 访问第三个一位数组的第四个元素

		// int[][] arr = new int[2][3];
		// arr[1][1] = 8;

		// for(int i = 0; i < arr.length; i++) {

		// 	for(int j = 0; j < arr[i].length; j++){

		// 		System.out.print(arr[i][j]);
		// 	}
		// 	System.out.println();
		// }

		//动态创建一维数组不一定的二维数组
		int[][] arr = new int[3][];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 1];
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + 1;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}