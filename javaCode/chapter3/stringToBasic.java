public class stringToBasic {

	public static void main(String[] args) {
		// 基本转String
		int n = 1234;
		float f1 = 1.1f;
		double d1 = 4.5;
		boolean b1 = true;

		String s1 = n + "";
		String s2 = f1 + "";
		String s3 = d1 + "";
		String s4 = b1 + "";
		// System.out.println(s1);
		// System.out.println(s2);
		// System.out.println(s3);
		// System.out.println(s4);

		// String 转基本
		// 使用基本数据类型对应的包装类的相应方法来实现转换
		String s5 = "123"; //抛出：只编译可以通过，但是执行会报错
		int n5 = Integer.parseInt(s5);
		System.out.println(n5);
		double d2 = Double.parseDouble(s5);
		System.out.println(d2);
		float f2 = Float.parseFloat(s5);
		System.out.println(f2);
		long l1 = Long.parseLong(s5);
		System.out.println(l1);
		byte b2 = Byte.parseByte(s5);
		System.out.println(b2);
		boolean pass = Boolean.parseBoolean("true");//只转true和false两个字符串
		System.out.println(pass);
		short s6 = Short.parseShort(s5);
		System.out.println(s6);

		// s5.charAt(0) ：  返回s5字符串上的第一个字符
		System.out.println(s5.charAt(0));
	}
}