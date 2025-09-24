public class This01 {

	public static void main(String[] args){
		Dog d1 = new Dog("小花",5);
		System.out.println("d1的hashCode = " + d1.hashCode());
		d1.info();
		Dog d2 = new Dog("赛虎",5);
		System.out.println("d2的hashCode = " + d2.hashCode());
		d2.info();
	}
}
class Dog{
	String name;
	int age;
	// public Dog(String dName,int dAge) {
	// 	name = dName;
	// 	age = dAge;
	// }
	// 有没有一种方法，可以让构造器的形参就是属性名
	//	但现在有问题了构造器中的name、age就是一个局部变量，不是属性，完全不能赋值啊
	public Dog(String name, int age) {
		// this.name ： 就是当前对象的name属性
		this.name = name ;
		this.age = age;
		System.out.println("this的hashCode = " + this.hashCode());
	}
	public void info() {
		System.out.println("this的hashCode = " + this.hashCode());
		System.out.println(name + "\t" + age + "\t");
	}
}