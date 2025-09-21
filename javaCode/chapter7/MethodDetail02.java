public class MethodDetail02 {

	public static void main(String[] args) {
		A a = new A();
		// a.f2();
		a.m1();
	}
}
class A {
	// 同一个类中的方法调用，可以直接调用
	public void f1(int n) {
		System.out.println("f1函数被执行了，n = " + n);
	}
	public void f2() { //直接调用方法f1
		f1(10);
		System.out.println("f2函数继续执行~");
	}
	// 跨类方法调用时，需要通过对象名进行调用
	public void m1() {
		System.out.println("m1函数开始执行~");
		B b = new B();//先创建对象实例
		b.hi();

	}

}
class B {
	public void hi() {
		System.out.println("hi()函数执行");
	}
}
