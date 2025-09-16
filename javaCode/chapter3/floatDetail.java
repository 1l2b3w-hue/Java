public class floatDetail {

	public static void main(String[] args) {

		// float a = 1.2; //double类型赋值给float类型时，会丢失精度，报错
		float a = 1.2f;
		double b = 2.5;
		double c = 3.2f; //可以放，但是具体存放是一个近似值
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(5.12e2);

		double d = 3.123456789;
		float e = 3.123456789f; //会丢失后面的位数
		System.out.println(d);
		System.out.println(e);

		double f = 2.7;
		double g = 8.1 / 3; //应该是2.7，但输出2.699999....，一个接近2.7的小数
		System.out.println(f);
		System.out.println(g);

		System.out.println(Math.abs(f - g));

		//正确判断应该通过差值的绝对值来判断
		if(Math.abs(f - g ) < 0.000001) {
			System.out.println("这两个数是相等的");

		}
	}
}