import java.util.Scanner; // ��ʾ��java.util���µ�Scanner�����뵽��ǰ�ļ���
public class Input {

	public static void main(String[] args) {
		// �ӿ���̨�л�ȡ�û�����Ϣ�� ���������䣬нˮ
		// 1.����Scanner�����ڵİ� Scaner�� ��һ�����ı�ɨ��������java.util����
		// ����һ��Scannerʵ������ new����һ������
		// Scanner myScanner = new Scanner(System.in);
		// // 3.���Խ����û����룬ʹ��ʵ������ķ��� 
		// System.out.println("���������֣�");
		// String name = myScanner.next(); //�����û�����String��������
		// System.out.println("���������䣺");
		// int age = myScanner.nextInt(); //�����û������int��������
		// System.out.println("������нˮ��");
		// double allwance = myScanner.nextDouble(); //�����û������double��������

		// System.out.println("���� �� " + name +" ���� �� " + 
		// 					age + " нˮ �� " + allwance );

		Scanner myScanner = new Scanner(System.in);
		System.out.println("���������� �� ");
		String name = myScanner.next();
		System.out.println("���������� ��");
		byte age = myScanner.nextByte();
		System.out.println("������нˮ �� ");
		double allwance = myScanner.nextDouble();

		System.out.println("����\t����\tнˮ\n" + name + "\t" + age +
						"\t" + allwance);
	}
}