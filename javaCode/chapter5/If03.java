import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		// 1.
		// Scanner sc = new Scanner(System.in);
		// System.out.println("���������֥�������֣� ");
		// // ����������ݲ�������ʱ������ᷢ�������������ͨ���쳣�������������
		// int credit = sc.nextInt();
		// // Ӧ��ʵ��һ���жϣ���ȷ������������Ƿ���Ϸ�Χ
		// if(credit >=1 && credit <= 100) { //������ȷ���ж�
		// 	if(credit == 100) {
		// 		System.out.println("���ü���");
		// 	}
		// 	else if(credit > 80 && credit <= 99) {
		// 		System.out.println("��������");
		// 	}
		// 	else if(credit >= 60 && credit <= 80) {
		// 		System.out.println("����һ��");
		// 	}
		// 	else {
		// 		System.out.println("���ò�����");
		// 	}
		// }
		// else {
		// 	System.out.println("�������,������1~100������");
		// }

		// 2.
		// boolean b = true;
		// if(b = false) 
		// 	System.out.println("a");
		// else if(b) 
		// 	System.out.println("b");
		// else if(!b) 
		// 	System.out.println("c");
		// else 
		// 	System.out.println("d"); 

		// 3.
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ĳ����ɼ���");
		double score = sc.nextDouble();
		System.out.println("����������Ա�");
		char gender = sc.next().charAt(0);
		if(score > 8.0) {
			System.out.println("�������");
			if(gender == '��') {
				System.out.println("�������������");
			}
			else if(gender == 'Ů') {
				System.out.println("����Ů�������");
			}
			else {
				System.out.println("�Ա����");
			}
		}
		else {
			System.out.println("��̭");
		}


	}
}
