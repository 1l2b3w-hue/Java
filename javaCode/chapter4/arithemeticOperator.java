public class arithemeticOperator {
	// 算术运算符
	public static void main(String[] args) {
		//  / 的使用
		System.out.println(10 / 4);// 2,两个整数相互运算，保留到整数精度 省略余数 
		System.out.println(10.0 / 4);// 2.5,
		double d = 10 / 4; //2.0 精度提升
		System.out.println(d);

		//  % 的使用 
		// 在java中，取余本质就是 ： a % b = a - a / b * b;
		// -10 % 3 == -10 - (-10) / 3 * 3 == -10 - (-9) == -1
		System.out.println(10 % 3); //1 
		System.out.println(-10 % 3); //-1 
		System.out.println(10 % -3); // 1
		System.out.println(-10 % -3); // -1  -10 - [(-10) / (-3) * (-3)]

		// ++ 的使用
		int i = 10;
		i++;
		++i;
		System.out.println(i); // 11

		int j = 8;
		// int k = ++j; //等价于j = j + 1; k = j;
		int k = j++; //等价于 k = j; j = j + 1;
		System.out.println(k); //8  9
		System.out.println(j); //9  9
	}
}