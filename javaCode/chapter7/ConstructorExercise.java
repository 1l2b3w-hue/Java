public class ConstructorExercise {

	public static void main(String[] args) {
		// Person p1 = new Person();
		// Person p2 = new Person();
		// System.out.println(p1.name + p1.age);
		// System.out.println(p2.name + p2.age);

		// Person p3 = new Person("小明" , 20);
		// Person p4 = new Person("小王" , 22);
		// System.out.println(p3.name + p3.age);
		// System.out.println(p4.name + p4.age);
		Person p = new Person();
		System.out.println(p.age);
	}
}
class Person {
	// 第一个无参构造器：利用构造器设置所有人的age属性初始值都为18
	String name;
	int age = 18;
	// public Person() {
	// 	age = 18;
	// }

	// 第二个带pName和pAge两个参数的构造器：使得每次创建Person对象的同
	// 时初始化对象的age属性值和name属性值。分别使用不同的构造器，创建对
	// 象.
	// public Person(String pName,int pAge){
	// 	name = pName;
	// 	age = pAge;
	// }
}