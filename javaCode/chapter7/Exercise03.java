public class Exercise03{

	public static void main(String[] args) {
		// Dog dog1 = new Dog("����","��ɫ",4);
		// dog1.show0();
		// Music music1 = new Music("������Ȥ",1.0);
		// music1.play();
		// System.out.println(music1.getlnfo());

		T t = new T();
		t.test();
		Employee e1 = new Employee("jack",'��',22,"Ա��",4000.0);
		Employee e2 = new Employee("Ա��",4000.0);
		Employee e3 = new Employee("jack",'��',22);
		System.out.println(e1.name + e1.gender + e1.age + e1.position +
				e1.salary);

	}
}
// ���һ��Dog�࣬�����֡���ɫ���������ԣ������������show0��ʾ����Ϣ��
// ���������󣬽��в���
class Dog {
	String name;
	String color;
	int age;
	public Dog(String name,String color,int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}
	public void show0() {
		System.out.println("���� ��" + this.name + " ��ɫ ��" +
				this.color  +" ���� �� "  + this.age);
	}
}

// ����Music�࣬������������name������ʱ��times���ԣ����в���play���ܺͷ�
// �ر���������Ϣ�Ĺ��ܷ���getlnfo
class Music {
	String name;
	double times;
	public Music(String name, double times) {
		this.name = name;
		this.times = times;
	}
	public void play() {
		System.out.println(this.name + "���ֿ�ʼ����~");
	}
	public String getlnfo() {
		return "��������" + this.name + " ����ʱ�� ��" +
			this.times + "����";
	}
}
// �ڲ��Է����У�����method�������������£�������ȷ����д��method������
// ������ʽ���������Ϊ��System.out.println��method��method��10.0,20.0),100��;
// class T {
// 	public double method(double n1, double n2) {
// 		return n1 + n2;
// 	}
// 	public void test(){
// 		System.out.println(method(method(10.0,20.0),100));
// 	}
// }
// ����һ��Employee�࣬�����У����֣��Ա����䣬ְλ��нˮ�����ṩ3������
// ���������Գ�ʼ����1�������֣��Ա����䣬ְλ��нˮ������2�������֣��Ա����䣩��3��
// ��ְλ��нˮ����Ҫ���ָ��ù�������������һ����������ɳ�ʼ����
class Employee {
	String name;
	char gender;
	int age;
	String position;
	double salary;
	public Employee(String name,char gender,int age, String position,double salary) {
		this(name,gender,age);
		this.position = position;
		this.salary = salary;
		
	}
	public Employee(String name,char gender,int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public Employee(String position,double salary) {
		this.position = position;
		this.salary = salary;
		
	}
}