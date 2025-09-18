public class for01 {

	public static void main(String[] args ) {
		// System.out.println("你好，韩顺平教育");
		// System.out.println("你好，韩顺平教育");
		// System.out.println("你好，韩顺平教育");
		// System.out.println("你好，韩顺平教育");
		// System.out.println("你好，韩顺平教育");
		// System.out.println("你好，韩顺平教育");
		// System.out.println("你好，韩顺平教育");
		// System.out.println("你好，韩顺平教育");
		// System.out.println("你好，韩顺平教育");
		// System.out.println("你好，韩顺平教育");

		// for(int i = 1; i <= 10; i++) {
		// 	System.out.println("你好，韩顺平教育" + i);
		// }

		//循环条件是一个返回布尔值类型的表达式
		// for循环中的初始化循环变量和循环变量迭代可以写在别的地方，但分号不能省略
		// int i = 1;
		// for(; i <= 10;) {
		// 	System.out.println("你好，韩顺平教育" + i);
		// 	 i++;
		// }
		// System.out.println(i);

		// for(;;) { //表示一个死循环
		// 	System.out.println("你好，韩顺平教育"); 
		// }
		// 循环变量的初始化可以有多条语句，但要类型相同；
		// 循环变量的迭代可以有多条语句；多条语句都由逗号隔开
		int count = 3;
		for(int i = 0, j = 0; i < count; i++, j += 2) {
			System.out.println("i = " + i + " j = " + j);
		}
	}
}