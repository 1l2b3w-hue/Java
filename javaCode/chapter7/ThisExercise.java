public class ThisExercise {

	public static void main(String[] args){
		Person p1 = new Person("jack",12);
		Person p2 = new Person("kangkang",12);
		Person p3 = new Person("jack",12);
		if(p1.compareTo(p3)) {
			System.out.println("��ͬһ����");
		}
		else {
			System.out.println("����ͬһ����");
		}
	}
}
class Person {
	// ����Person�࣬������name��age���ԣ����ṩcompareTo�ȽϷ����������ж�
	// �Ƿ����һ������ȣ��ṩ������TestPerson���ڲ��ԣ����ֺ�������ȫһ������
	// ����true.���򷵻�false
	String name;
	int age;
	public Person(String pName,int pAge) {
		this.name = pName;
		this.age = pAge;
	}
	public boolean compareTo(Person p) {
		// if(this.name.equals(p.name) && this.age == p.age) {
		// 	return true;
		// }
		// else {
		// 	return false;
		// }
		return this.name.equals(p.name) && this.age == p.age;
	}
}
class TestPerson {

}