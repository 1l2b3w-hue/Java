public class EightQueen {

	public static void main(String[] args) {

		int[][] chessBoard = new int[8][8];
		int queenNum = 0;
		Queen queen = new Queen();
		queen.printBoard(chessBoard);
		queen.putQueen(chessBoard,3,6,queenNum);
		queen.printBoard(chessBoard);
	}
}

class Queen {
// 0 表示可以放皇后， 1 表示不能放皇后， 8 表示皇后的位置
	public void printBoard(int[][] arr) {
		System.out.println("------------棋盘如下-------------");
		for(int i  = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public void putQueen(int[][] arr, int n, int m,int k) {
		// 放皇后，决定不能存放的位置
		if(arr[n][m] != 1) {
			for(int i  = 0; i < arr.length; i++) {
				arr[i][m] = 1;
				for(int j = 0; j < arr[i].length; j++) {
					arr[n][j] = 1;
					if(j - m == i - n || j + i == n + m) {
						arr[i][j] = 1;
					}
				}
			}
			arr[n][m] = 8;
		
		}
		else {
			
		}
		
		
	}
}