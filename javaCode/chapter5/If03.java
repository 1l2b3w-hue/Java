import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		// 1.
		// Scanner sc = new Scanner(System.in);
		// System.out.println("请输入你的芝麻信誉分： ");
		// // 当输入的数据不是整型时，输入会发生报错，后面可以通过异常处理机制来处理
		// int credit = sc.nextInt();
		// // 应该实现一个判断，来确定输入的内容是否符合范围
		// if(credit >=1 && credit <= 100) { //数据正确性判断
		// 	if(credit == 100) {
		// 		System.out.println("信用极好");
		// 	}
		// 	else if(credit > 80 && credit <= 99) {
		// 		System.out.println("信用优秀");
		// 	}
		// 	else if(credit >= 60 && credit <= 80) {
		// 		System.out.println("信用一般");
		// 	}
		// 	else {
		// 		System.out.println("信用不及格");
		// 	}
		// }
		// else {
		// 	System.out.println("输入错误,请输入1~100的整数");
		// }

		// 2.
		// boolean b = true;
		// if(b = false) 
		// 	System.out.println("a");
		// else if(b) 
		// 	System.out.println("b");
		// else if(!b) 
		// 	System.out.println("c");
		// else 
		// 	System.out.println("d"); 

		// 3.
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的初赛成绩：");
		double score = sc.nextDouble();
		System.out.println("请输入你的性别");
		char gender = sc.next().charAt(0);
		if(score > 8.0) {
			System.out.println("进入决赛");
			if(gender == '男') {
				System.out.println("进入男子组决赛");
			}
			else if(gender == '女') {
				System.out.println("进入女子组决赛");
			}
			else {
				System.out.println("性别错误");
			}
		}
		else {
			System.out.println("淘汰");
		}


	}
}
