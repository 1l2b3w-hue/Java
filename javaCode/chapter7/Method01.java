public class Method01 {

	public static void main(String[] args) {
		//������ʹ�ã�
		// ����д�ú󣬲�ȥ���ã�Ҳ��Ϊʹ�ã��������޷�ִ��
		// �ȴ���һ�������ٵ��÷���
		Person p1 = new Person();
		p1.speak();//���÷���
		p1.cal01();
		p1.cal02(5); //����cal02����������һ������5����n = 5
		p1.cal02(10);

		// ����getSum��������������������ʹnum1 = 20, num2 = 10;
		// ��������ֵ��ֵ��returnRes
		int returnRes = p1.getSum(20,10);
		System.out.println("getSum�������ص�ֵΪ��" + returnRes);
	}
}
class Person {

	String name;
	int age;
	// ��� ��
	// public ��ʾ��������ǹ�����
	// void ��ʾ�÷���û�з���ֵ
	// speak() : ��ʾ�÷�������Ϊspeak��() : �β��б�������ʾû���β�
	// {} �� �����壬�����Ҫִ�еĴ���
	public void speak() {
		System.out.println("����һ������");
	}

	public void cal01() {
		int sum = 0;
		for(int i = 1; i <= 1000; i++) {
			sum += i;
		}
		System.out.println("cal01 : ���������� �� " + sum);
	}
	// (int n) : ��ʾ��ǰһ���β�n�������û�����
	public void cal02(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("cal02 : ���������� �� " + sum);
	}
	// int : ��ʾ�÷���ִ�к󣬻᷵��һ��int���͵�����
	// return result ��ʾ��result��ֵ����
	public int getSum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
}