import java.util.Scanner;
public class exercise02 {

	public static void main(String[] args) {

		// int sum = 0;
		// int start = 1;
		// int end = 100;
		// int i = start;
		// for(; i <= end; i++) {
		// 	sum += i;
		// 	if(sum >= 20) {
		// 		break;
		// 	}
		// }
		// System.out.println("和第一次大于20时，当前数为 ： " + i);

		// Scanner sc = new Scanner(System.in);
		// for(int i = 1; i <= 3; i++) {
		// 	System.out.println("请输入用户名 ： ");
		// 	String name = sc.next();
		// 	System.out.println("请输入密码 ： ");
		// 	String password = sc.next();
		// 	System.out.println(name + password);
		// 	if("丁真".equals(name) && "666".equals(password)) {
		// 		System.out.println("登录成功");
		// 		break;
		// 	}
		// 	else {
		// 		System.out.println("输入错误，请重新输入，还有" +( 3 - i) + "机会" );
		// 	}
		// }

		// String name = "张三";
		// System.out.println(name.equals("李四"));
		// System.out.println(name.equals("张三"));
		// System.out.println("张三".equals(name)); //推荐，避免空指针

		// 1.
		// double cash = 100000;
		// int num = 0;
		// while(true) {
		// 	if(cash > 50000) {
		// 		cash =cash - (cash * 0.05);
		// 		num++;
		// 	}
		// 	else if(cash <= 50000) {
		// 		if(cash >= 1000) {
		// 			cash -= 1000;
		// 			num++;
		// 		}
		// 		else {
		// 			break;
		// 		}
		// 	}
		// }
		// System.out.println("该人可以经过"+ num + "次路口");

		// 2.
		// Scanner sc = new Scanner(System.in);
		// System.out.println("请输入你要判断的整数 ：");
		// int num = sc.nextInt();
		// if(num > 0) {
		// 	System.out.println("大于0");
		// }
		// else if(num == 0) {
		// 	System.out.println("等于0");
		// }
		// else {
		// 	System.out.println("小于0");
		// }
		//3.
		// Scanner sc = new Scanner(System.in);
		// System.out.println("请输入你要判断的年份 ： ");
		// int year = sc.nextInt();
		// if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
		// 	System.out.println(year + "是闰年");
		// }
		// else {
		// 	System.out.println(year + "不是闰年");
		// }

		//4.
		// Scanner sc = new Scanner(System.in);
		// System.out.println("请输入你要判断的三位数 ： ");
		// int num = sc.nextInt();
		// int a = num / 100; //百位
		// int b = num / 10 % 10 ; //十位
		// int c = num % 10; //个位
		// if(num == a* a * a + b * b * b + c * c * c) {
		// 	System.out.println(num + "是水仙花数");
		// }
		// else {
		// 	System.out.println(num + "不是水仙花数");
		// }

		//5.啥都不执行
		// int m = 0,n = 3;
		// if(m > 0) {
		// 	if(n > 2)
		// 		System.out.println("OK1");
		// 	else 
		// 		System.out.println("OK2");
		// }

		// 6.
		// int num = 0;
		// for(int i = 1; i <= 100; i++) {
		// 	if( i % 5 != 0) {
		// 		System.out.print(i+ "\t");
		// 		num++;
		// 	}
		// 	if(num == 5) {
		// 		System.out.println();
		// 		num = 0;
		// 	}
		// }

		// 7.
		// for(int i = 97; i < 123; i++) {
		// 	System.out.print((char)i);
		// }
		// System.out.println();
		// for(int i = 90 ; i >= 65; i--) {
		// 	System.out.print((char)i);
		// }

		//8.
		// double sum = 0;
		// int flag = 1;
		// for(int i = 1; i <= 100; i++) {
		// 	sum = sum + flag * 1.0 / i;
		// 	flag = -flag;
		// }
		// System.out.println(sum);

		// 9.
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 1; i <= 100; i++) {
			for(int j = i; j <= i; j++){
				sum2 += j;
			}
			sum1 += sum2;
		} 
		System.out.println(sum1);
	}
}