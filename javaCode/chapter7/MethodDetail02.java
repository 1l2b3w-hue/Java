public class MethodDetail02 {

	public static void main(String[] args) {
		A a = new A();
		// a.f2();
		a.m1();
	}
}
class A {
	// ͬһ�����еķ������ã�����ֱ�ӵ���
	public void f1(int n) {
		System.out.println("f1������ִ���ˣ�n = " + n);
	}
	public void f2() { //ֱ�ӵ��÷���f1
		f1(10);
		System.out.println("f2��������ִ��~");
	}
	// ���෽������ʱ����Ҫͨ�����������е���
	public void m1() {
		System.out.println("m1������ʼִ��~");
		B b = new B();//�ȴ�������ʵ��
		b.hi();

	}

}
class B {
	public void hi() {
		System.out.println("hi()����ִ��");
	}
}
