public class autoConvertDetail {

	public static void main(String[] args) {
		// 当多种类型数据进行运算时，会自动转换为数据类型容量最大再运算
		int num = 10;
		// float f1 = num + 1.1; //错误，后面自动转换为double
		// double f1 = num + 1.1;
		float f1 = num + 1.1f; 
		//当把精度大（容量大）的数据转换为精度小（容量小）会报错，反之自动转换
		// int num1 = 1.1;

		//byte short 与 char不会自动转换
		byte b1 = 10;
		// byte b2 = 128;//超出范围
		// int n1 = 1;
		// byte b2 = n1;//变量赋值时，会判断类型
		// char c1 = b1;

		//byte short 与 char 进行运算时，会首先转换为int类型
		byte b2 = 10;
		byte b3 = 11;
		short s1 = 11;
		int s2 = s1 + b2;//错误
		// byte b4 = b2 + b3;//也是int

		//boolean 不参与转换
		boolean pass = true;
		// int n4 = pass;

		//自动提升原则 ： 表达式结果的类型将会自动提升为操作数中最大的类型

		byte b4 = 10;
		short s4 = 100;
		int n4 = 1;
		float d5 = 1.1F;
		double d6 = b4 + s4 + n4 + d5;
	}
}