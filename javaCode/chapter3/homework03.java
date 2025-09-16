public class homework03 {

	public static void main(String[] args) {
		String s1 = "红楼梦";
		String s2 = "西游记";
		System.out.println(s1 + s2);
		char c1 = '男';
		char c2 = '女';
		System.out.println(c1 + "" + c2); //应该先转换为字符串，否则会按数值计算
		double price1 = 100.00;
		double price2 = 88.88;
		String s3 = price1 + "";
		String s4 = price2 + "";
		System.out.println(s3 + s4);

	}
}