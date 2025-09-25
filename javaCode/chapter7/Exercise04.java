public class Exercise04 {

	public static void main(String[] args) {
		PassObject obj1 = new PassObject();
		Circle c = new Circle();
		obj1.printAreas(c,5);
	}
}
// （1）定义一个Circle类，包含一个double型的radius属性代表圆的半径，一findArea()
// 方法返回圆的面积。
// （2）定义一个类PassObject，在类中定义一个方法printAreasO，该方法的定义如下：
// publicvoid printAreas(Circle c,inttimes)//方法签名
// （3）在printAreas方法中打印输出1到times之间的每个整数半径值，以及对应的面积。
// 例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。
// （4）在main方法中调用printAreas0方法，调用完毕后输出当前半径值。程序运行结果
class Circle {
	double radius;
	public double findArea() {
		return this.radius * this.radius * Math.PI;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
}
class PassObject {
	// Circle c = new Circle();
	public void printAreas(Circle c, int times) {
		System.out.println("Radius" + "\t" + "Area");
		for(double i = 1; i <= times; i++) {
			// c.radius = i;//不推荐直接修改属性值，通过特定的方法进行修改
			c.setRadius(i);
			System.out.println(i + "\t" + c.findArea());
		}
	}	
}