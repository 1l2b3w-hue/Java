import java.util.Scanner;
public class Exercise05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tom tom = new Tom();
		System.out.println("请输入局数 : ");
		int bureau = sc.nextInt();
		tom.game(bureau);
	}
}
// 有个人Tom设计他的成员变量.成员方法，，可以电脑猜拳
// 电脑每次都会随机生成0，1，2
// 0表示石头1表示剪刀2表示布
// 并要可以显示Tom的输赢次数（清单）
class Tom {
	public void game(int n) {
		int win = 0;
		int lose = 0;
		Scanner sc = new Scanner(System.in);
		int i = 0;
		for(i = 0; i < n; i++) {
			int randoms =(int)(Math.random() * 3);
			System.out.println("请决定你的出拳 : ");
			int m  = sc.nextInt();
			switch(m) {
				case 0 :
					if(randoms == 1) {
						System.out.println("石头对剪刀，Tom赢");
						win++;
					}
					else if(randoms == 2){
						System.out.println("石头对布，电脑赢");
						lose++;
					}
					else if(randoms == 0) {
						System.out.println("石头对石头，平局");
					}
					break;
				case 1 :
					if(randoms == 1) {
						System.out.println("剪刀对剪刀，平局");
						
					}
					else if(randoms == 2){
						System.out.println("剪刀对布，Tom赢");
						win++;
					}
					else if(randoms == 0) {
						System.out.println("剪刀对石头，电脑赢");
						lose++;
					}
					break;

				case 2 :
					if(randoms == 1) {
						System.out.println("布对剪刀，电脑赢");
						lose++;
					}
					else if(randoms == 2){
						System.out.println("布对布，平局");
					}
					else if(randoms == 0) {
						System.out.println("布对石头，Tom赢");
						win++;
					}
					break;

				default :
					System.out.println("输入数字错误");
					i--;
			}
		}
		System.out.println("一共" + i + "局，Tom赢" + win + "输" + lose);
		
	}
}