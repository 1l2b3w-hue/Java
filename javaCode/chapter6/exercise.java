import java.util.Scanner;
public class exercise {

	public static void main(String[] args) {
		// 1.
		// int a = 6;
		// int b = 3;
		// // a : 0110
		// // b : 0011
		// System.out.println(a & b); //ȫ1Ϊ1����˽��Ϊ �� 0010��2
		// System.out.println(a | b); //��1Ϊ1����˽��Ϊ �� 0111��7
		// System.out.println(a ^ b); //��ͬΪ1����˽��Ϊ �� 0101��5
		// System.out.println( ~a ); //��λȡ������8λ����1111 1001 ���������룩
	 // 	//תԭ�� �� 1000 0111  ���Ϊ2 -7
	 // 	System.out.println(a << 2); // �൱��*2*2�� ���Ϊ24
	 // 	System.out.println(a >> 2); // �൱��/2/2�� ���Ϊ1
	 // 	System.out.println(a >>> 2); // ���Ϊ1

		//2.
		// int a = 10;
		// int b = 20; 
		// //��a ^ 0 = a ,a ^ a = 0;
		// a = a ^ b;
		// b = a ^ b;
		// a = a ^ b;
		// System.out.println("a = " + a + " b = " + b);

		//3.
		//���˰ɣ�ȷ��Ҫ���Լ�ʵ��ת����
		// int num = 25;
		// String a = " ";
		// String b = " ";
		// String c = " ";
		// while(num != 0) {
		// 	int yu = num % 2;
		// 	a = yu + a;
		// 	num /= 2;
		// }
		// System.out.println(a); // ������
		// num = 25;
		// while(num != 0) {
		// 	int yu = num % 8;
		// 	b = yu + b;
		// 	num /= 8;
		// }
		// System.out.println(b);//�˽���
		// num = 25;
		// while(num != 0) {
		// 	int yu = num % 16;
		// 	if(yu > 9) {
		// 		switch(yu - 9) {
		// 			case 1: c = 'a' + c; break;
		// 			case 2: c = 'b' + c; break;
		// 			case 3: c = 'c' + c; break;
		// 			case 4: c = 'd' + c; break;
		// 			case 5: c = 'e' + c; break;
		// 			case 6: c = 'f' + c; break;
		// 		}
		// 	}
		// 	else {
		// 		c = yu + c;
		// 	}
			
		// 	num /= 16;
		// }
		// System.out.println(c);//ʮ������

		//4.


		//5.
		// Scanner sc = new Scanner(System.in);
		// System.out.println("������ɼ� ��");
		// double score = sc.nextDouble();
		// if(score >= 90 && score <= 100) {
		// 	System.out.println("A");
		// }
		// else if(score >= 80 && score <= 89) {
		// 	System.out.println("B");
		// }
		// else if(score >= 70 && score <= 79) {
		// 	System.out.println("C");
		// }
		// else if(score >= 60 && score <= 69) {
		// 	System.out.println("D");
		// }
		// else if(score >= 0 && score <= 59) {
		// 	System.out.println("E");
		// }
		// else {
		// 	System.out.println("�ɼ��������");
		// }

		//6.
		// Scanner sc = new Scanner(System.in);
		// System.out.println("������һ���ַ� ��");
		// char a = sc.next().charAt(0);
		// if(a < 90) {
		// 	a = (char)(a + 32);
		// }
		// switch(a) {
		// 	case 'a' :
		// 	case 'e' :
		// 	case 'i' :
		// 	case 'o' :
		// 	case 'u' :	System.out.println("��Ԫ���ַ�");
		// 		break; //�㾹Ȼ������һһ�оٳ������21����ĸ���ж���
		// 	case 'b': case 'c': case 'd': case 'f': case 'g': case 'h': case 'j': case 'k': case 'l': case 'm':
		// 	case 'n': case 'p': case 'q': case 'r': case 's': case 't': case 'v': case 'w': case 'x': case 'y':
		// 	case 'z' : 	System.out.println("�Ǹ����ַ�");
		// 		break;
		// 	default : System.out.println("����Ƿ�");
		// }
	}
}