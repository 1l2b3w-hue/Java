public class ThisDetail {
	T t = new T();
	public static void main(String[] args) {
		new ThisDetail().f4();
		
	}
	public void f4() {
		this.t.f2();
	}
}

class T {
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