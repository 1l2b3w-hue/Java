import java.util.Scanner;
public class exercise02 {

	public static void main(String[] args) {

		// int sum = 0;
		// int start = 1;
		// int end = 100;
		// int i = start;
		// for(; i <= end; i++) {
		// 	sum += i;
		// 	if(sum >= 20) {
		// 		break;
		// 	}
		// }
		// System.out.println("�͵�һ�δ���20ʱ����ǰ��Ϊ �� " + i);

		// Scanner sc = new Scanner(System.in);
		// for(int i = 1; i <= 3; i++) {
		// 	System.out.println("�������û��� �� ");
		// 	String name = sc.next();
		// 	System.out.println("���������� �� ");
		// 	String password = sc.next();
		// 	System.out.println(name + password);
		// 	if("����".equals(name) && "666".equals(password)) {
		// 		System.out.println("��¼�ɹ�");
		// 		break;
		// 	}
		// 	else {
		// 		System.out.println("����������������룬����" +( 3 - i) + "����" );
		// 	}
		// }

		// String name = "����";
		// System.out.println(name.equals("����"));
		// System.out.println(name.equals("����"));
		// System.out.println("����".equals(name)); //�Ƽ��������ָ��

		// 1.
		// double cash = 100000;
		// int num = 0;
		// while(true) {
		// 	if(cash > 50000) {
		// 		cash =cash - (cash * 0.05);
		// 		num++;
		// 	}
		// 	else if(cash <= 50000) {
		// 		if(cash >= 1000) {
		// 			cash -= 1000;
		// 			num++;
		// 		}
		// 		else {
		// 			break;
		// 		}
		// 	}
		// }
		// System.out.println("���˿��Ծ���"+ num + "��·��");

		// 2.
		// Scanner sc = new Scanner(System.in);
		// System.out.println("��������Ҫ�жϵ����� ��");
		// int num = sc.nextInt();
		// if(num > 0) {
		// 	System.out.println("����0");
		// }
		// else if(num == 0) {
		// 	System.out.println("����0");
		// }
		// else {
		// 	System.out.println("С��0");
		// }
		//3.
		// Scanner sc = new Scanner(System.in);
		// System.out.println("��������Ҫ�жϵ���� �� ");
		// int year = sc.nextInt();
		// if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
		// 	System.out.println(year + "������");
		// }
		// else {
		// 	System.out.println(year + "��������");
		// }

		//4.
		// Scanner sc = new Scanner(System.in);
		// System.out.println("��������Ҫ�жϵ���λ�� �� ");
		// int num = sc.nextInt();
		// int a = num / 100; //��λ
		// int b = num / 10 % 10 ; //ʮλ
		// int c = num % 10; //��λ
		// if(num == a* a * a + b * b * b + c * c * c) {
		// 	System.out.println(num + "��ˮ�ɻ���");
		// }
		// else {
		// 	System.out.println(num + "����ˮ�ɻ���");
		// }

		//5.ɶ����ִ��
		// int m = 0,n = 3;
		// if(m > 0) {
		// 	if(n > 2)
		// 		System.out.println("OK1");
		// 	else 
		// 		System.out.println("OK2");
		// }

		// 6.
		// int num = 0;
		// for(int i = 1; i <= 100; i++) {
		// 	if( i % 5 != 0) {
		// 		System.out.print(i+ "\t");
		// 		num++;
		// 	}
		// 	if(num == 5) {
		// 		System.out.println();
		// 		num = 0;
		// 	}
		// }

		// 7.
		// for(int i = 97; i < 123; i++) {
		// 	System.out.print((char)i);
		// }
		// System.out.println();
		// for(int i = 90 ; i >= 65; i--) {
		// 	System.out.print((char)i);
		// }

		//8.
		// double sum = 0;
		// int flag = 1;
		// for(int i = 1; i <= 100; i++) {
		// 	sum = sum + flag * 1.0 / i;
		// 	flag = -flag;
		// }
		// System.out.println(sum);

		// 9.
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 1; i <= 100; i++) {
			for(int j = i; j <= i; j++){
				sum2 += j;
			}
			sum1 += sum2;
		} 
		System.out.println(sum1);
	}
}