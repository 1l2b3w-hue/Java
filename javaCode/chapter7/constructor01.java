public class constructor01 {

	public static void main(String[] args) {
		// ��newһ������ʱ��ͨ����������ָ�������ĵĶ��������ֵ
		// Person p = new Person("С��",20);
		Person p = new Person("С��");
		System.out.println(p.name + p.age);
	}
}
class Dog {
	/*
		��һ��Ĭ�Ϲ�����
		public Dog() {
	
		}
	*/
}

class Person {
	String name;
	int age;
	// ��������û�з���ֵ��Ҳ����дvoid
	// ���������Ʊ���������һ��
	public Person(String pName,int pAge) {
		System.out.println("��������������~");
		name = pName;
		age = pAge;
	}

	// ������������
	public Person(String pName){
		System.out.println("������2��������~");
		name = pName;
	}
}