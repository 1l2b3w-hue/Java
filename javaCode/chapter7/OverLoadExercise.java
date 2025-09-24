public class OverLoadExercise{

	public static void main(String[] args) {
		/*
			编写程序，类Methods中定义三个重载方法并调用。方法名为m。三个方法分
			别接收一个int参数、两个int参数、一个字符串参数。分别执行平方运算并输出
			结果，相乘并输出结果，输出字符串信息。在主类的main0方法中分别用参数
			区别调用三个方
		*/
		Method method = new Method();
		method.m(6);
		method.m(6,5);
		method.m("OverLoadExercise");
		/*
			在Methods类，定义三个重载方法max0，第一个方法，返回两个int值中的最
			大值，第二个方法，返回两个double值中的最大值，第三个方法，返回三个
			double值中的最大值，并分别调用三个方法
		*/
		System.out.println(method.max(10,15));
		System.out.println(method.max(10.8,10.9));
		System.out.println(method.max(10.6,15.7,9.9));

	}
}
class Method{
	public void m(int n){
		System.out.println(n * n);
	}
	public void m(int n1,int n2){
		System.out.println(n1 * n2);
	}
	public void m(String s1){
		System.out.println(s1);
	}
	public int max(int n1,int n2) {
		if(n1 > n2){
			return n1;
		}
		else {
			return n2;
		}
	}
	public double max(double n1,double n2) {
		if(n1 > n2){
			return n1;
		}
		else {
			return n2;
		}
	}
	public double max(double n1,double n2,double n3){
		double max1 = n1 > n2 ? n1 : n2;
		double max2 = max1 > n3 ? max1 : n3;
		return max2;
	}
}