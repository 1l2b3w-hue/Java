public class ThisExercise {

	public static void main(String[] args){
		Person p1 = new Person("jack",12);
		Person p2 = new Person("kangkang",12);
		Person p3 = new Person("jack",12);
		if(p1.compareTo(p3)) {
			System.out.println("是同一个人");
		}
		else {
			System.out.println("不是同一个人");
		}
	}
}
class Person {
	// 定义Person类，里面有name、age属性，并提供compareTo比较方法，用于判断
	// 是否和另一个人相等，提供测试类TestPerson用于测试，名字和年龄完全一样，就
	// 返回true.否则返回false
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