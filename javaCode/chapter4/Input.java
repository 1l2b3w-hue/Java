import java.util.Scanner; // 表示将java.util包下的Scanner类引入到当前文件中
public class Input {

	public static void main(String[] args) {
		// 从控制台中获取用户的信息： 姓名，年龄，薪水
		// 1.引入Scanner类所在的包 Scaner类 是一个简单文本扫描器，在java.util包中
		// 创建一个Scanner实例对象 new创建一个对象
		// Scanner myScanner = new Scanner(System.in);
		// // 3.可以接受用户输入，使用实例对象的方法 
		// System.out.println("请输入名字：");
		// String name = myScanner.next(); //接受用户输入String类型数据
		// System.out.println("请输入年龄：");
		// int age = myScanner.nextInt(); //接受用户输入的int类型数据
		// System.out.println("请输入薪水：");
		// double allwance = myScanner.nextDouble(); //接受用户输入的double类型数据

		// System.out.println("名字 ： " + name +" 年龄 ： " + 
		// 					age + " 薪水 ： " + allwance );

		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入名字 ： ");
		String name = myScanner.next();
		System.out.println("请输入年龄 ：");
		byte age = myScanner.nextByte();
		System.out.println("请输入薪水 ： ");
		double allwance = myScanner.nextDouble();

		System.out.println("名字\t年龄\t薪水\n" + name + "\t" + age +
						"\t" + allwance);
	}
}