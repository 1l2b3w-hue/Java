public class Method02 {

	public static void main(String[] args) {
		int[][] map = {{0,0,0},{1,1,1},{1,1,3}};
		MyTools tool = new MyTools(); //ʹ�ó�Ա����ʱ���ȴ���һ��ʵ������
		tool.printArray(map);
		tool.printArray(map);
		tool.printArray(map);

		// for(int i = 0; i < map.length; i++) {
		// 	for(int j = 0; j < map[i].length; j++) {
		// 		System.out.print(map[i][j] + " ");
		// 	}
		// 	System.out.println();
		// }

		// //�ٴ�Ҫ�����
		// for(int i = 0; i < map.length; i++) {
		// 	for(int j = 0; j < map[i].length; j++) {
		// 		System.out.print(map[i][j] + " ");
		// 	}
		// 	System.out.println();
		// }


		// // �ٴα���
		// for(int i = 0; i < map.length; i++) {
		// 	for(int j = 0; j < map[i].length; j++) {
		// 		System.out.print(map[i][j] + " ");
		// 	}
		// 	System.out.println();
		// }
	}
}
class MyTools {
	public void printArray(int[][] map) {
		System.out.println("===========");
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}


