public class assignOperator {

	public static void main(String[] args) {
		// 演示赋值运算符
		int n = 10;
		n += 4; // n = n + 4;
		System.out.println(n);
		n /= 3; // n = n / 3;
		System.out.println(n);

		byte c = 3;
		c += 4; // 等价于  c =  (byte)(c + 4);
		c++ ;// c = (byte)(c + 1) 
		System.out.println(c);
	}
}