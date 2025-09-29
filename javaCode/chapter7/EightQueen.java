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
// 0 ��ʾ���ԷŻʺ� 1 ��ʾ���ܷŻʺ� 8 ��ʾ�ʺ��λ��
	public void printBoard(int[][] arr) {
		System.out.println("------------��������-------------");
		for(int i  = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public void putQueen(int[][] arr, int n, int m,int k) {
		// �Żʺ󣬾������ܴ�ŵ�λ��
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