import java.util.Scanner;
public class Object01 {

	public static void main(String[] args) {
		// 使用单个变量存储数据  ————把一个猫的信息拆开了，不利于数据管理
		// String name1 = "小白";
		// int age1 = 3;
		// String color1 = "白色";
		// String name2 = "小花";
		// int age2 = 100;
		// String color2 = "花色";
		// // 输入名字
		// System.out.println("请输入小猫的名字 ： ");
		// Scanner sc = new Scanner(System.in);
		// String input = sc.next();
		// // 进行判断 
		// if(input.equals(name1)) {
		// 	System.out.println("猫的名字：" +name1+ " 年龄：" + age1 +
		// 			" 颜色 ：" + color1);
		// }
		// else if(input.equals(name2)){
		// 	System.out.println("猫的名字：" +name2+ " 年龄：" + age2+
		// 			" 颜色 ：" + color2);
		// }
		// else {
		// 	System.out.println("张老太没有这只猫猫");
		// }

		// 采用数组来存放信息
		// 数据类型无法体现出来；通过下标获取信息，造成变量名与内容的对应关系（见名知意）；
		// 不能体现一只猫的行为
		// String[] cat1 = {"小白","3","白色"};
		// String[] cat2 = {"小花","100","花色"};

		// 综上所诉 ： 以前知识存在不利于数据管理和效率低
		// java设计者引入类与对象(OOP),就是为了解决现有技术无法完美的解决现有需求

		// 面向对象来解决 ：
		// 实例化一只猫  new Cat()：创建一只猫的对象
		Cat cat1 = new Cat();
		cat1.name = "小白";
		cat1.age = 3;
		cat1.color = "白色";
		cat1.weight = 10.0;

		Cat cat2 = new Cat();
		cat2.name = "小花";
		cat2.age = 100;
		cat2.color = "花色";
		cat2.weight = 20.0;

		System.out.println("第一只猫的信息为 ： " + cat1.name + " " 
			+ cat1.age + " " + cat1.color + " " + cat1.weight);
		System.out.println("第二只猫的信息为 ： " + cat2.name + " " 
			+ cat2.age + " " + cat2.color + " " + cat2.weight);
	}
}

// 定义一种猫类 ——自定义数据类型
class Cat {
	String name;
	int age;
	String color;
	// 可以添加属性
	double weight;
}

class Car {
	String name; //属性
	double price;
	String[] masters; //可以是引用类型
}