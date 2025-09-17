public class arithmeticOperatorExercise {

	public static void main(String[] args) {
		// int i1 = 10;
		// int i2 = 20;
		// int i = i1++;
		// System.out.println("i = " + i); //i = 10;
		// // System.out.print : 不换行输出
		// System.out.println("i2 = " + i2); // i2 = 20
		// i = --i2;
		// System.out.println("i = " + i); // i =19
		// System.out.println("i2 = " + i2);// i = 19
		int days = 59;
		int week = days / 7;
		int day = days % 7;
		System.out.println(days +"天 合" + week + "个星期零" + day + "天");

		double huashi = 234.5;
		double temperature = 5.0 / 9 * (huashi - 100);
		System.out.print("华氏温度为 ： " + huashi +  "转换成摄氏温度为： " + temperature);
	}
}