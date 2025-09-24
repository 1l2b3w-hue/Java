public class constructor01 {

	public static void main(String[] args) {
		// 当new一个对象时，通过构造器来指定创建的的对象的属性值
		// Person p = new Person("小明",20);
		Person p = new Person("小明");
		System.out.println(p.name + p.age);
	}
}
class Dog {
	/*
		有一个默认构造器
		public Dog() {
	
		}
	*/
}

class Person {
	String name;
	int age;
	// 构造器中没有返回值，也不能写void
	// 构造器名称必须与类名一致
	public Person(String pName,int pAge) {
		System.out.println("构造器被调用了~");
		name = pName;
		age = pAge;
	}

	// 构造器的重载
	public Person(String pName){
		System.out.println("构造器2被调用了~");
		name = pName;
	}
}