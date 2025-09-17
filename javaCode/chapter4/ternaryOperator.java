public class ternaryOperator {

	public static void main(String[] args) {
		// int a = 10;
		// int b = 99;
		// int result = a < b ? a++ : b--;
 
		// System.out.println(result);
		// System.out.println(a);
		// System.out.println(b);

		//细节
		// 表达式1，2 要为可以赋值给接受变量的类型
		int a = 3;
		int b = 8;
		int c = a > b ? a : b;
		// int c  = a > b ? (int)1.1 : (int)3.4;
		// double d  = a > b ? a : b + 3; //自动转换
		// if(a > b) {
		// 	c = a;
		// }
		// else {
		// 	c = b;
		// }

		int abcclass = 19;//可以包含关键字和保留字
		int n = 20 ;
		int N = 30 ;
		System.out.println("n = " + n);
		System.out.println("N = " + N);
		int abc = 30;
		int aBc = 20;//abc 和aBc是不同的变量
	}
}