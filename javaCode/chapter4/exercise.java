import java.util.Scanner;
public class exercise {

	public static void main(String[] args) {
		// logicOperatorExercise
		// int x = 5;
		// int y = 5;
		// if(x++ == 6 & ++y == 6){
		// 	x =11;
		// }
		// System.out.println("x = " + x + " y = " + y); //x = 6 y = 6

		// int x = 5 ,y = 5;
		// if(x++ == 6 && ++y == 6) {
		// 	x = 11;
		// }
		// System.out.println("x = " + x + " y = " + y); // x = 6 y = 5

		// int x = 5 ,y = 5;
		// if(x++ == 5 || ++y == 5) {
		// 	x = 11;
		// }
		// System.out.println("x = " + x + " y = " + y);//x = 11 y = 5;

		// int x = 5, y = 5;
		// if(x++ == 5 | ++y == 5) {
		// 	x = 11;
		// }
		// System.out.println("x = " + x + " y = " + y ); //x = 11 y = 6

		// boolean x = true;
		// boolean y = false;
		// short z = 46 ;
		// if((z++ == 46) && (y =true)) z++; 
		// if((x = false) || (++z == 49)) z++; // x = false Ϊ��
		// System.out.println("z = " + z); 

		//TernaryExercise 
		//�����������ֵ
		// int a = 100; 
		// int b = 54;
		// int c = 777;
		// int max1 =  a > b ? a : b;
		// int max2 = max1 > c ? max1 : c;
		// System.out.println(max2);
		// int max = a > b ? (a > c ? a : c) :(b > c ? b : c);
		// System.out.println(max);
		
		// ������ ��
		// 1.
		// byte a = 10;
		// short b = 11;
		// int c  = 100;
		// long d = 1000;
		// float e = 1.2f;
		// double f = 1.4;
		// char g = 'a';
		// boolean h = true;
		// System.out.println("byte = " + a + " short =" + b + " int = " +  c +
		// 			" long = " + d + " float = " + e + " double =" + f + 
		// 			" char = " + g + " bollean = " + h);
		// 2.
		// int num1 = 100;
		// double num2 = num1; 
		// //���100.0�� ��Ϊdouble�������ݵľ��Ⱥͷ�Χ����int�������Զ�ת�������両������.0 ��100.0
		// System.out.println(num2);
		// 3.
		// double price = 99.9;
		// int intPrice = (int)price;
		// System.out.println(intPrice); 
		//���99����Ϊǿ������ת��ʱ������־��ȶ�ʧ������������ﶪʧ�˾���0.9
		// 4.
		// int num1 = Integer.parseInt("2024");
		// double num2 = Double.parseDouble("3.14");
		// double result = num1 * num2 ;
		// System.out.println(result); //����6355.36
		// 5.����,��Ϊboolean������int���ͷ�������ʱ�����ն������������㣬��ת��Ϊ��Χ����������㣬
		// booleanӦ�÷���ת��������boolean�޷�ת��Ϊ��������
		// 6.
		// int a = 15;
		// int b = 25;
		// System.out.println(a > b); //false
		// System.out.println(a < b); //true
		// System.out.println(a == b); //fasle
		// System.out.println(a != b); //true
		// 7.
		// boolean isSunny = true;
		// boolean isWeekend = false;
		// System.out.println(isSunny && isWeekend); // false
		// System.out.println(isSunny || isWeekend); // true
		// System.out.println( !isSunny); // false
		// System.out.println( !isWeekend); // true
		// ����
		// 1.
		// byte b1 = 10;
		// byte b2 = 20;
		// // byte b3 = b1 + b2; 
		// //����д���Ǵ���ģ���byte��short,char�������ͽ�������ʱ����ת��Ϊint���ͣ���int����
		// // ��ֵ��byte�Ǵ����
		// //�޸����� ��
		// // int b3 = b1 + b2;
		// // byte b3 = (byte)(b1 + b2);
		// System.out.println(b3);
		// 2.
		// Scanner myScanner = new Scanner(System.in);
		// String s1 = myScanner.next();
		// String s2 = myScanner.next();
		// int n1 = Integer.parseInt(s1);
		// int n2 = Integer.parseInt(s2);
		// int result = n1 > n2 ? n1 : n2;
		// System.out.println("�ϴ������ �� " + result);
		// 3.
		// int x = 8;
		// int y = 3;
		// System.out.println(x + y); //11
		// System.out.println(x - y); //5
		// System.out.println(x * y); //24
		// System.out.println(x / y); //2
		// // ���� �� ��Ϊ�������ߵĲ���������Ϊint����������Ȼ��int���ͣ��������С��
		// System.out.println(1.0 * x / y); //ת��һ��������Ϊdouble���;���
		// System.out.println(x % y); //2
		// 4.
		// int age = 22;
		// int score = 88;
		// if(age > 18 && score >= 80) {
		// 	System.out.println("��������");
		// }
		// else {
		// 	System.out.println("����������");
		// }
		// 5.
		// double weight = 65.5;
		// double height = 1.75;
		// double result = weight /( height * height) ;
		// boolean a = result < 18.5 ? true : false;
		
		// if(a) {
		// 	System.out.println("ƫ��");
		// }
		// else {
		// 	boolean b = result < 24 ? true : false;
		// 	if(b) {
		// 		System.out.println("����");
		// 	}
		// 	else {
		// 		System.out.println("ƫ��");
		// 	}
		// }
		// 6.
		char ch = 'A';
		System.out.println((char)(ch+32)); //a
		// ʵ����ʲô���ܣ� ��д��ĸתСд�� ������� 

		System.out.println(2 & 3);
		System.out.println(~-2 );
		System.out.println(~2);
		System.out.println(2 | 3);
		System.out.println(2 ^ 3);
		System.out.println(~-5);
		System.out.println(13 & 7);
		System.out.println(5 | 4);
		System.out.println(-3 ^ 3);
		System.out.println(1 >> 2);
		System.out.println(1 << 2);
		System.out.println(4 << 3);
		System.out.println(15 >> 2);
		System.out.println(3 >> 2);
		System.out.println(-1 >> 2);
		System.out.println(-1 << 2);
		System.out.println("--------");
		System.out.println(10 / 3);
		System.out.println(10 / 5);
		System.out.println(10 % 2);
		System.out.println(-10.4 % 3);
		int i = 66;
		System.out.println(++i + i );

		System.out.println("--------");

		double b = Double.parseDouble("2.3");
		String s = 'a' +"" ;
		System.out.println(b + s);

		
	}
}