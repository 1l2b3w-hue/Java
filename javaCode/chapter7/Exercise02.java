public class Exercise02 {

	public static void main(String[] args) {
		// A03 a = new A03();
		// // int[] arr = {1,2,3,4,5,6};
		// // int[] arr2 = a.copyArr(arr);
		// // for(int i = 0; i < arr2.length; i++) {
		// // 	System.out.println(arr2[i]);
		// // }
		// double[] arr = {34.6,234.56,32.65,32.5,32.67};
		// double[] arr2 = a.copyArr(arr);
		// for(int i = 0; i < arr2.length; i++) {
		// 	System.out.println(arr2[i]);
		// }
		// Circle circle = new Circle(5);
		// circle.circumference();
		// circle.circleArea(); 
		Cale cale1 = new Cale(12.5,6.5);
		cale1.add();
		cale1.sub();
		cale1.mul();
		cale1.division();
		Cale cale2 = new Cale(12.5,0);
		cale2.add();
		cale2.sub();
		cale2.mul();
		cale2.division();
	}
}
// 编写类A03，实现数组的复制功能copyArr，输入旧数组，返回一个新数组，元素和旧数组一样
// class A03 {
// 	public int[] copyArr(int[] arr) {
// 		int[] newArr = new int[arr.length];
// 		for(int i = 0; i < arr.length; i++){
// 			newArr[i] = arr[i];
// 		}
// 		return newArr;
// 	}
// 	public double[] copyArr(double[] arr) {
// 		double[] newArr = new double[arr.length];
// 		for(int i = 0; i < arr.length; i++){
// 			newArr[i] = arr[i];
// 		}
// 		return newArr;
// 	}
// 	// 其他类型数组一样，使用方法重载
// }
// 定义一个圆类Circle，定义属性：半径，提供显示圆周长功能的方法，提供显示圆
// 面积的方
// class Circle {
// 	double radius;
// 	public Circle(double radius) {
// 		this.radius = radius;
// 	}
// 	public void circumference() {
// 		double result = 2 * this.radius * Math.PI;
// 		System.out.println("该圆的周长为 ：" + result);
// 	}
// 	public void circleArea() {
// 		double result = Math.PI * this.radius * this.radius;
// 		System.out.println("该圆的面积为" + result); 
// 	}
// }
// 编程创建一个Cale计算类，在其中定义2个变量表示两个操作数，定义四个方法实
// 现求和、差、乘、商（要求除数为0的话，要提示）并创建两个对象，分别测试
class Cale {
	double num1;
	double num2;
	public Cale(double num1,double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public void add() {
		double result = this.num1 + this.num2;
		System.out.println("两数相和为 ：" + result);
	}
	public void sub() {
		double result = this.num1 - this.num2;
		System.out.println("两数相减为 ：" + result);
	}
	public void mul() {
		double result = this.num1 * this.num2;
		System.out.println("两数相乘为 ：" + result);
	}
	public void division() {
		if(num2 == 0) {
			System.out.println("除数为0，不能进行除法运算！");
		}
		else {
			double result = this.num1 / this.num2;
			System.out.println("两数相除为 ：" + result);
		}
	}
}