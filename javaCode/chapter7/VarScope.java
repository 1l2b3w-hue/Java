public class VarScope {

	public static void main(String[] args) {
		Person p1 = new Person();
		T t = new T();
		p1.say();
		t.say(); //ͨ�������д���һ��������ʵ�ֲ�ͬ����ʹ����һ���������
		t.say2(p1); //�ڶ��ֿ���ʹ��ȫ��
	}
}
class T {
	Person p = new Person();
	public void say(){
		// ͨ���������ʵ���ڲ�ͬ����ʹ����һ�����������
		System.out.println(p.name);
	}
	public void say2(Person p1) {
		System.out.println(p1.name);
	}
}
class Person {
	String name = "jack";
	public void say() {
		// �ֲ���������������ʱ����ѭ�ͽ�ԭ��
		String name = "king";
		System.out.println("say() = " + name);
	}
	public void hi() {
		String address = "����";
		// String address = "�Ϻ�";
	}
}