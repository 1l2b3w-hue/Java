public class AttributeDefault {

	public static void main(String[] args) {
		Person person = new Person();
		System.out.println("δ��ֵ����µ���Ϣ��" + person.name +" " +
				person.age + " " + " " + person.salary +
				" " + person.gender + " " + person.rich);
	}
}
class Person {
	String name;
	int age;
	double salary;
	char gender;
	boolean rich;
}