public class TwoDimensional {

	public static void main(String[] args) {
		// ����һ����ά����
		// int[][] arr = {{0,0,0,0,0,0},{0,0,1,0,0,0},{0,2,0,3,0,0},{0,0,0,0,0,0}};

		// for(int i = 0; i < arr.length; i++) { // ������ö�ά�����ÿ��Ԫ�أ����Ԫ�������飩
		// 	// arr[i].length �õ���ά������һά����Ԫ�صĳ���
		// 	for(int j = 0; j < arr[i].length; j++) {

		// 		System.out.print(arr[i][j] + " ");
		// 	}
		// 	System.out.println();
		// }
		// System.out.println(arr[2][3]); // ���ʵ�����һλ����ĵ��ĸ�Ԫ��

		// int[][] arr = new int[2][3];
		// arr[1][1] = 8;

		// for(int i = 0; i < arr.length; i++) {

		// 	for(int j = 0; j < arr[i].length; j++){

		// 		System.out.print(arr[i][j]);
		// 	}
		// 	System.out.println();
		// }

		//��̬����һά���鲻һ���Ķ�ά����
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