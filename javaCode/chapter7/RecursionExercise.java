import java.util.Scanner;
public class RecursionExercise {

	public static void main(String[] args) {
		MyTools tools = new MyTools();
		Scanner sc = new Scanner(System.in);
	// 请使用递归的方式求出斐波那契数1，1，2,3，5，8，13...给你一个整数n，求出它的值是多
		// System.out.println("请输入你要的第几个斐波那契数 ： ");
		// int n = sc.nextInt();
		// int result = tools.Fibonacci(n);
		// if(result != -1) {
		// System.out.println("第" + n + "个斐波那契数为：" + result);
		// }
		


	// 2.猴子吃桃子问题：有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！以后
	// 每天猴子都吃其中的一半，然后再多吃一个。当到第10天时，想再吃时（即还没吃）
	// 发现只有1个桃子了。问题：最初共多少个桃子？
		int count = 9;
		int result = tools.peachs(count,1);
		System.out.println("最初共有" + result + "个桃子");

	}
}
class MyTools {
	public int Fibonacci(int n) {
		if(n > 0) {
			if(n == 2 || n == 1) {
			return 1;
			} 
			else {
				return Fibonacci(n - 1) + Fibonacci(n - 2);
			}
		}
		else {
			System.out.println("你的输入有误，要求输入一个大于0的数");
			return -1;
		}
	}

	public int peachs(int count, int n) {
		if(count == 0) {
			return n;
		}
		else {
			return peachs(count - 1, 2 * (n + 1));
		}
	}
}