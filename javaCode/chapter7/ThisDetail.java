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
	// ϸ�� �� ʹ��this���ʳ�Ա���� �� this.������(�����б�)
	public void f1() {
		System.out.println("f1��������~");
	}

	public void f2() {
		// ����f1���ַ�ʽ
		f1();
		this.f1();
	}
}