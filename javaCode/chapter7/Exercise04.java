public class Exercise04 {

	public static void main(String[] args) {
		PassObject obj1 = new PassObject();
		Circle c = new Circle();
		obj1.printAreas(c,5);
	}
}
// ��1������һ��Circle�࣬����һ��double�͵�radius���Դ���Բ�İ뾶��һfindArea()
// ��������Բ�������
// ��2������һ����PassObject�������ж���һ������printAreasO���÷����Ķ������£�
// publicvoid printAreas(Circle c,inttimes)//����ǩ��
// ��3����printAreas�����д�ӡ���1��times֮���ÿ�������뾶ֵ���Լ���Ӧ�������
// ���磬timesΪ5��������뾶1��2��3��4��5���Լ���Ӧ��Բ�����
// ��4����main�����е���printAreas0������������Ϻ������ǰ�뾶ֵ���������н��
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
			// c.radius = i;//���Ƽ�ֱ���޸�����ֵ��ͨ���ض��ķ��������޸�
			c.setRadius(i);
			System.out.println(i + "\t" + c.findArea());
		}
	}	
}