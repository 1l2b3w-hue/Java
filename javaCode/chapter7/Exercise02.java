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
// ��д��A03��ʵ������ĸ��ƹ���copyArr����������飬����һ�������飬Ԫ�غ;�����һ��
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
// 	// ������������һ����ʹ�÷�������
// }
// ����һ��Բ��Circle���������ԣ��뾶���ṩ��ʾԲ�ܳ����ܵķ������ṩ��ʾԲ
// ����ķ�
// class Circle {
// 	double radius;
// 	public Circle(double radius) {
// 		this.radius = radius;
// 	}
// 	public void circumference() {
// 		double result = 2 * this.radius * Math.PI;
// 		System.out.println("��Բ���ܳ�Ϊ ��" + result);
// 	}
// 	public void circleArea() {
// 		double result = Math.PI * this.radius * this.radius;
// 		System.out.println("��Բ�����Ϊ" + result); 
// 	}
// }
// ��̴���һ��Cale�����࣬�����ж���2��������ʾ�����������������ĸ�����ʵ
// ����͡���ˡ��̣�Ҫ�����Ϊ0�Ļ���Ҫ��ʾ���������������󣬷ֱ����
class Cale {
	double num1;
	double num2;
	public Cale(double num1,double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public void add() {
		double result = this.num1 + this.num2;
		System.out.println("�������Ϊ ��" + result);
	}
	public void sub() {
		double result = this.num1 - this.num2;
		System.out.println("�������Ϊ ��" + result);
	}
	public void mul() {
		double result = this.num1 * this.num2;
		System.out.println("�������Ϊ ��" + result);
	}
	public void division() {
		if(num2 == 0) {
			System.out.println("����Ϊ0�����ܽ��г������㣡");
		}
		else {
			double result = this.num1 / this.num2;
			System.out.println("�������Ϊ ��" + result);
		}
	}
}