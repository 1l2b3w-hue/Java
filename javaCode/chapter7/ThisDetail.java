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
	// ��������
	public void f3() {
		String name = "����";
		// ��ͳ ���þͽ�ԭ�����Ҿֲ�����������������
		System.out.println("name= "+ name + " age=" + age); //�ֲܾ�����nameӰ��
		// this���ʣ� ֱ���ҵ��������ԣ������ֲܾ�����Ӱ��
		System.out.println("name= "+ this.name + " age=" + this.age);


	}

	// ϸ�� �� ���ʹ������﷨ ��this(�����б�)
	// ֻ���ڹ�������ʹ�ã�����һ���������е�����һ����������
	// this(�����б�)��һ���������е�����һ��������ʱ��������ڵ�һ�����
	public T() {
		this("jack", 12); //���÷��ϲ����б��еĲ����Ĺ�����
		System.out.println("T() ������");
	}
	public T(String name, int age) {
		System.out.println("T(String name, int age) ��������");
	}

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