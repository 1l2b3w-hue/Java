public class ThisDetail {
	
	public static void main(String[] args) {
		// T t = new T();
		// t.f2();
		T t2 = new T();
		t2.f3();

	}

}


class T {
	String name = "jack";
	int age = 30;
	// 访问属性
	public void f3() {
		String name = "张三";
		// 传统 采用就近原则，先找局部变量，最后才是属性
		System.out.println("name= "+ name + " age=" + age); //受局部变量name影响
		// this访问， 直接找到就是属性，不会受局部变量影响
		System.out.println("name= "+ this.name + " age=" + this.age);


	}

	// 细节 ： 访问构造器语法 ：this(参数列表)
	// 只能在构造器中使用（即在一个构造器中调用另一个构造器）
	// this(参数列表)在一个构造器中调用另一个构造器时，必须放在第一条语句
	public T() {
		this("jack", 12); //调用符合参数列表中的参数的构造器
		System.out.println("T() 调用了");
	}
	public T(String name, int age) {
		System.out.println("T(String name, int age) 被调用了");
	}

	// 细节 ： 使用this访问成员方法 ： this.方法名(参数列表)
	public void f1() {
		System.out.println("f1被调用了~");
	}

	public void f2() {
		// 调用f1两种方式
		f1();
		this.f1();
	}
}