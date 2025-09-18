import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的年龄 ：");
		int age  = sc.nextInt();
		if(age > 18) {
			System.out.println("你年龄大于18，要对自己的行为负责，不然进监狱");
		}
	}
}0