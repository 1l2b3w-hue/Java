public class VarScope {

	public static void main(String[] args) {
		Person p1 = new Person();
		T t = new T();
		p1.say();
		t.say(); //通过在类中创建一个对象来实现不同类中使用另一个类的属性
		t.say2(p1); //第二种跨类使用全局
	}
}
class T {
	Person p = new Person();
	public void say(){
		// 通过对象调用实现在不同类中使用另一个对象的属性
		System.out.println(p.name);
	}
	public void say2(Person p1) {
		System.out.println(p1.name);
	}
}
class Person {
	String name = "jack";
	public void say() {
		// 局部变量与属性重名时，遵循就近原则
		String name = "king";
		System.out.println("say() = " + name);
	}
	public void hi() {
		String address = "北京";
		// String address = "上海";
	}
}