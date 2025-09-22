public class Maze {

	public static void main(String[] args) {
		//�������Թ�
		// ˼· �� 
		// 1.�����Թ�����λ���飬8��7�У�
		// 2.�涨��ֵ �� 0 Ϊ���ϰ���1��ʾ���ϰ���������

		int[][] map = new int[8][7];
		// 3.���ñ߿���������������������Ϊ1�� //ֱ��ָ��ȥ��ֵ����Ҫ������������
		for(int i = 0; i < map.length; i++) { //̫�鷳�ˣ�������������ά����
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
			System.out.println("�ҵ���");
		}
		else {
			System.out.println("����ȥ");
		}
		// �����ǰ��ͼ
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
	// 1.findWay��������ר�����ҳ��Թ���·��
	//2������ҵ����ͷ��� true �����򷵻�false
	//3��map ���Ƕ�ά���飬����ʾ�Թ�
	//4��i,j ���������λ�ã���ʼ����λ��Ϊ(1,1)
	//5����Ϊ�����ǵݹ����·���������ȹ涨map����ĸ���ֵ�ĺ���
	// 0 ��ʾ������,��û�߹�; 1 ��ʾ�ϰ���; 2 ��ʾ�����ߣ���ǰ�߹�; 3��ʾ�߹��������߲�ͨ����·
	//6����map[6][5]=2 ��˵���ҵ�ͨ·���Ϳ��Խ���������ͼ����ҡ�
	//7����ȷ��������·������->��->��->��
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