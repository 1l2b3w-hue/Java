public class MethodExercise02 {

	public static void main(String[] args) {
		// 编写类MyTools类，编写一个方法可以打印二维数组的数据。
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		MyTools tool = new MyTools();
		tool.printArray(arr);

		// 编写一个方法copyPerson，可以复制一个Person对象，返回复制的对象。克隆对象
		// 注意要求得到新对象和原来的对象是两个独立的对象，只是他们的属性相同
		Person p = new Person();
		p.name = "Tom";
		p.age = 3;
		Person p2 = p.copyPerson(p);
		System.out.println("p的name ：" + p.name + " age :" + p.age);
		System.out.println("p2的name ：" + p2.name + " age :" + p2.age);
		System.out.println(p == p2);
	}
}
class MyTools {
	public void printArray(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
class Person {
	String name;
	int age;
	public Person copyPerson(Person p) {
		Person p2 = new Person();
		p2.name = p.name;
		p2.age = p.age;
		return p2;
	}
}