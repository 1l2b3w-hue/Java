public class Method01 {

	public static void main(String[] args) {
		//方法的使用：
		// 方法写好后，不去调用（也称为使用），将会无法执行
		// 先创建一个对象，再调用方法
		Person p1 = new Person();
		p1.speak();//调用方法
		p1.cal01();
		p1.cal02(5); //调用cal02方法，传递一个参数5，让n = 5
		p1.cal02(10);

		// 调用getSum方法，传递两个参数，使num1 = 20, num2 = 10;
		// 并将返回值赋值给returnRes
		int returnRes = p1.getSum(20,10);
		System.out.println("getSum方法返回的值为：" + returnRes);
	}
}
class Person {

	String name;
	int age;
	// 解读 ：
	// public 表示这个方法是公开的
	// void 表示该方法没有返回值
	// speak() : 表示该方法名称为speak，() : 形参列表，这里显示没有形参
	// {} ： 方法体，里面放要执行的代码
	public void speak() {
		System.out.println("我是一个好人");
	}

	public void cal01() {
		int sum = 0;
		for(int i = 1; i <= 1000; i++) {
			sum += i;
		}
		System.out.println("cal01 : 计算结果等于 ： " + sum);
	}
	// (int n) : 表示当前一个形参n，接受用户输入
	public void cal02(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("cal02 : 计算结果等于 ： " + sum);
	}
	// int : 表示该方法执行后，会返回一个int类型的数据
	// return result 表示将result的值返回
	public int getSum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
}