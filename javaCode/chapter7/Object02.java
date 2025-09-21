public class Object02 {

	public static void main(String[] args) {
		// Person p1 = new Person();
		// p1.age = 22;
		// p1.name = "小明";
		// Person p2 = p1;
		// System.out.println(p2.age);
		Person a = new Person();
		a.age  = 10;
		a.name = "小明";
		Person b;
		b = a;
		System.out.println(b.name);
		b.age = 200;
		b = null;
		System.out.println(a.age);
		System.out.println(b.age);
	}
} 
class Person {
	String name;
	int age;
}