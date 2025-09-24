public class Overload01 {

	public static void main(String[] args) {

		// System.out.println(100);
		// System.out.println("123");
		// System.out.println('1');
		// System.out.println(1.1);
		// System.out.println(true);
		MyCalculator cal = new MyCalculator();
		int result1 = cal.calculate(1,2);
		double result2 = cal.calculate(1,2.5);
		double result3 = cal.calculate(1.5,2);
		int result4 = cal.calculate(1,2,3);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
}
class MyCalculator {
	public int calculate(int num1,int num2) {
		return (num1 + num2);
	}
	public double calculate(int num1,double num2){
		return (num1 + num2);
	}
	public double calculate(double num1,int num2) {
		return (num1 + num2);
	}
	public int calculate(int num1,int num2,int num3) {
		return (num1 + num2 + num3);
	}

}