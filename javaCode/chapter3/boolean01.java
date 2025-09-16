public class boolean01 {

	public static void main(String... args) { //...可变参数本质是一个数组
		boolean pass = false;
		if(pass) {
			System.out.println("通过");
		}
		else {
			System.out.println("未通过");
		}
	}
}