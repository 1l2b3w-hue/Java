public class VarParameterExercise {

	public static void main(String[] args) {

		// 有三个方法，分别实现返回姓名和两门课成绩（总分），返回姓名和三门课成绩（总
		// 分），返回姓名和五门课成绩（总分）。封装成一个可变参数的方法
		HspMethod printScore = new HspMethod();
		String s1 = printScore.showScore("小明",75.7,66);
		String s2 = printScore.showScore("小张",75.7,66,78.9);
		String s3 = printScore.showScore("小王",75.7,66,67,98,77);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
class HspMethod {
	public String showScore(String name, double... scores) {
		double scoreSum = 0;
		for(int i = 0; i < scores.length; i++) {
			scoreSum += scores[i];
		}
		// System.out.println("姓名 ： " + name + scores.length +
		//  "门总成绩为" + scoreSum);
		String ret = name + "成绩 :" + scoreSum;
		return ret;
	}
}