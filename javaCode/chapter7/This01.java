public class This01 {

	public static void main(String[] args){
		Dog d1 = new Dog("С��",5);
		System.out.println("d1��hashCode = " + d1.hashCode());
		d1.info();
		Dog d2 = new Dog("����",5);
		System.out.println("d2��hashCode = " + d2.hashCode());
		d2.info();
	}
}
class Dog{
	String name;
	int age;
	// public Dog(String dName,int dAge) {
	// 	name = dName;
	// 	age = dAge;
	// }
	// ��û��һ�ַ����������ù��������βξ���������
	//	�������������˹������е�name��age����һ���ֲ��������������ԣ���ȫ���ܸ�ֵ��
	public Dog(String name, int age) {
		// this.name �� ���ǵ�ǰ�����name����
		this.name = name ;
		this.age = age;
		System.out.println("this��hashCode = " + this.hashCode());
	}
	public void info() {
		System.out.println("this��hashCode = " + this.hashCode());
		System.out.println(name + "\t" + age + "\t");
	}
}