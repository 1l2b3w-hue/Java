public class ConstructorExercise {

	public static void main(String[] args) {
		// Person p1 = new Person();
		// Person p2 = new Person();
		// System.out.println(p1.name + p1.age);
		// System.out.println(p2.name + p2.age);

		// Person p3 = new Person("С��" , 20);
		// Person p4 = new Person("С��" , 22);
		// System.out.println(p3.name + p3.age);
		// System.out.println(p4.name + p4.age);
		Person p = new Person();
		System.out.println(p.age);
	}
}
class Person {
	// ��һ���޲ι����������ù��������������˵�age���Գ�ʼֵ��Ϊ18
	String name;
	int age = 18;
	// public Person() {
	// 	age = 18;
	// }

	// �ڶ�����pName��pAge���������Ĺ�������ʹ��ÿ�δ���Person�����ͬ
	// ʱ��ʼ�������age����ֵ��name����ֵ���ֱ�ʹ�ò�ͬ�Ĺ�������������
	// ��.
	// public Person(String pName,int pAge){
	// 	name = pName;
	// 	age = pAge;
	// }
}