import java.util.Scanner;

public class switch01 {

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// System.out.println("��������ĸ ��");
		// char a = sc.next().charAt(0);
		// switch(a) {
		// 	case 'a' : System.out.println("����һ");
		// 		break;
		// 	case 'b' : System.out.println("���ڶ�");
		// 		break;
		// 	case 'c' : System.out.println("������");
		// 		break;
		// 	case 'd' : System.out.println("������");
		// 		break;
		// 	case 'e' : System.out.println("������");
		// 		break;
		// 	case 'f' : System.out.println("������");
		// 		break;
		// 	case 'g' : System.out.println("������");
		// 		break;
		// 	default :  System.out.println("�������");
		// }	
		// switch ϸ�� ��
		// ���ʽ�е���������Ӧ����case�����е��������ͱ���һ�£������ǿ���ת��Ϊ�ɱȽϵ���������
		// ���ʽ���ص���������ֻ����byte,short,int,char,String,enum
		// case �Ӿ��е�ֵ�����ǳ��������ǳ������ʽ�������Ǳ���
		char c = 'a';
		// double c = 1.1;
		// char c1 = 'a';
		switch(c) {
			case 'a' : 
				System.out.println("OK1");
				break;
			case 'b' + 1 : 
				System.out.println("OK2");
				break;
			// case 20 :  // char ����ת��Ϊint
			// 	System.out.println("OK2");
			// 	break;
			// case "hello" :  //��ʾ��ƥ��
			// 	System.out.println("OK2");
			// 	break;
			// default : 
			// 	System.out.println("OK3"); 
		}
	}
}