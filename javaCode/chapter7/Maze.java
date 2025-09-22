public class Maze {

	public static void main(String[] args) {
		//老鼠走迷宫
		// 思路 ： 
		// 1.创建迷宫（二位数组，8行7列）
		// 2.规定数值 ： 0 为无障碍，1表示有障碍，不能走

		int[][] map = new int[8][7];
		// 3.设置边框（最上最下最左最右设置为1） //直接指定去赋值，不要遍历整个数组
		for(int i = 0; i < map.length; i++) { //太麻烦了，遍历了整个二维数组
			for(int j = 0; j < map[i].length; j++) {
				if(i == 0 || i == map.length -1 )  {
					map[i][j] = 1;
				}
				else if(j == 0 || j == map[i].length -1){
					map[i][j] = 1;
				}
			}
		}
		map[3][1] = 1;
		map[3][2] = 1;
		T t = new T();
		boolean is_find = t.findway(map,1,1);
		if(is_find) {
			System.out.println("找到了");
		}
		else {
			System.out.println("出不去");
		}
		// 输出当前地图
		for(int i = 0; i < map.length; i++){
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
// 
class T {
	// 1.findWay方法就是专内来找出迷宫的路径
	//2。如果找到，就返回 true ，否则返回false
	//3。map 就是二维数组，即表示迷宫
	//4。i,j 就是老鼠的位置，初始化的位置为(1,1)
	//5。因为我们是递归的找路，所以我先规定map数组的各个值的含义
	// 0 表示可以走,但没走过; 1 表示障碍物; 2 表示可以走，以前走过; 3表示走过，但是走不通是死路
	//6。当map[6][5]=2 就说明找到通路，就可以结束，否则就继续找。
	//7。先确定老鼠找路策略下->右->上->左
	public boolean findway(int[][] map, int i,int j) {
		if(map[6][5] == 2) {
			return true;
		}
		else if(map[i][j] == 0) {
			map[i][j] = 2;
			if(findway(map,i+1,j)) {
				return true;
			}
			else if(findway(map,i,j + 1)) {
				return true;
			}
			else if(findway(map,i-1,j)) {
				return true;
			}
			else if(findway(map,i,j-1)) {
				return true;
			}
			else {
				map[i][j] = 3;
				return false;
			}
		}
		else {
			return false;
		}
	}
}