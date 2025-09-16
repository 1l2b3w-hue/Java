public class forceConvertDetail {

	public static void main(String[] args) {

		//强转符号只会针对最近的操作数有效，对于整个表达式来讲，需要（）提升优先级
		// int x = (int)10 * 3.5 + 6 * 1.5;//错误，结果是double
		// double x = (int)10 * 3.5 + 6 * 1.5;
		int x = (int)(10 * 3.5 + 6 * 1.5);
		System.out.println(x);

		// char类型可以保存int常量值，但是无法保存变量值，需强转
		char c1 = 100;
		int num = 100;
		char c2 = (char)num;//报错
		System.out.println(c2);
	}
}