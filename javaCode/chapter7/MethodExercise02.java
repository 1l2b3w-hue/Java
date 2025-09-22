public class MethodExercise02 {

	public static void main(String[] args) {
		// ��д��MyTools�࣬��дһ���������Դ�ӡ��ά��������ݡ�
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		MyTools tool = new MyTools();
		tool.printArray(arr);

		// ��дһ������copyPerson�����Ը���һ��Person���󣬷��ظ��ƵĶ��󡣿�¡����
		// ע��Ҫ��õ��¶����ԭ���Ķ��������������Ķ���ֻ�����ǵ�������ͬ
		Person p = new Person();
		p.name = "Tom";
		p.age = 3;
		Person p2 = p.copyPerson(p);
		System.out.println("p��name ��" + p.name + " age :" + p.age);
		System.out.println("p2��name ��" + p2.name + " age :" + p2.age);
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