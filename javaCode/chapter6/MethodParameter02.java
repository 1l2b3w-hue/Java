public class MethodParameter02 {

	public static void main(String[] args) {
		B  b = new B();
		// int[] arr = {1,2,3,5};
		// b.test100(arr);
		// System.out.println("main ���");
		// for(int i = 0; i < arr.length; i++) {
		// 	System.out.print(arr[i] + "\t");
		// }
		Person p1 = new Person();
		p1.age = 10;
		p1.name = "С��";
		System.out.println("���� �� " + p1.name + " ���� �� " + p1.age);
		b.test200(p1);
		System.out.println("���� �� " + p1.name + " ���� �� " + p1.age);
	}
}
class Person {
	String name;
	int age;
}
class B {
	public void test100(int[] arry) {
		arry[0] = 200;
		System.out.println("test100 ���");
		for(int i = 0; i < arry.length; i++) {
			System.out.print(arry[i] + "\t");
		}
		System.out.println();
	}

	public void test200(Person p) {
		p.age = 30;
		p.name = "����";
		System.out.println("���� �� " + p.name + " ���� �� " + p.age);
	}
}
