public class Exercise03{

	public static void main(String[] args) {
		// Dog dog1 = new Dog("赛虎","褐色",4);
		// dog1.show0();
		// Music music1 = new Music("谛听恶趣",1.0);
		// music1.play();
		// System.out.println(music1.getlnfo());

		T t = new T();
		t.test();
		Employee e1 = new Employee("jack",'男',22,"员工",4000.0);
		Employee e2 = new Employee("员工",4000.0);
		Employee e3 = new Employee("jack",'男',22);
		System.out.println(e1.name + e1.gender + e1.age + e1.position +
				e1.salary);

	}
}
// 设计一个Dog类，有名字、颜色和年龄属性，定义输出方法show0显示其信息。
// 并创建对象，进行测试
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
		System.out.println("名字 ：" + this.name + " 颜色 ：" +
				this.color  +" 年龄 ： "  + this.age);
	}
}

// 定义Music类，里面有音乐名name、音乐时长times属性，并有播放play功能和返
// 回本身属性信息的功能方法getlnfo
class Music {
	String name;
	double times;
	public Music(String name, double times) {
		this.name = name;
		this.times = times;
	}
	public void play() {
		System.out.println(this.name + "音乐开始播放~");
	}
	public String getlnfo() {
		return "歌曲名：" + this.name + " 播放时长 ：" +
			this.times + "分钟";
	}
}
// 在测试方法中，调用method方法，代码如下，编译正确，试写出method方法的
// 定义形式，调用语句为：System.out.println（method（method（10.0,20.0),100）;
// class T {
// 	public double method(double n1, double n2) {
// 		return n1 + n2;
// 	}
// 	public void test(){
// 		System.out.println(method(method(10.0,20.0),100));
// 	}
// }
// 创建一个Employee类，属性有（名字，性别，年龄，职位，薪水），提供3个构造
// 方法，可以初始化（1）（名字，性别，年龄，职位，薪水），（2）（名字，性别，年龄）（3）
// （职位，薪水），要求充分复用构造器（调用另一个构造器完成初始化）
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