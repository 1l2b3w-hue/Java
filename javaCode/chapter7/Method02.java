public class Method02 {

	public static void main(String[] args) {
		int[][] map = {{0,0,0},{1,1,1},{1,1,3}};
		MyTools tool = new MyTools(); //使用成员方法时，先创建一个实例对象
		tool.printArray(map);
		tool.printArray(map);
		tool.printArray(map);

		// for(int i = 0; i < map.length; i++) {
		// 	for(int j = 0; j < map[i].length; j++) {
		// 		System.out.print(map[i][j] + " ");
		// 	}
		// 	System.out.println();
		// }

		// //再次要求遍历
		// for(int i = 0; i < map.length; i++) {
		// 	for(int j = 0; j < map[i].length; j++) {
		// 		System.out.print(map[i][j] + " ");
		// 	}
		// 	System.out.println();
		// }


		// // 再次遍历
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


