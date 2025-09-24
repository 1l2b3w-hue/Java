public class TowerOfHanoi {

	public static void main(String[] args){
		Tower tower = new Tower();
		tower.move(3,'A','B','C');
	}
}
class Tower {
	// num 表示数量，a,b,c表示着ABC三个塔
	public void move(int num,char a,char b, char c){
		if(num == 1){
			System.out.println(a + " -> " + c);
		}
		else {
			move(num - 1, a, c, b);//借助c塔将上面的所有盘移动到c塔
			System.out.println(a + " -> " + c);
			move(num - 1, b, a, c); // 借助a塔，将b上面的所有盘移动到c塔
		}
	}
}