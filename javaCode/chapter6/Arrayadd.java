import java.util.Scanner;
public class Arrayadd {

	public static void main(String[] args) {
		// Scanner input = new Scanner(System.in);
		// int[] arr = {1,2,3};
		// while(true) {
		// 	int len = arr.length; //ȷ��ԭ����ĳ���
		// 	System.out.println("�Ƿ�������Ԫ�� �� y/n");
		// 	char verifty = input.next().charAt(0);
		// 	if(verifty == 'y') { 
		// 		int[] arr2 = new int[len + 1]; //����һ���µ�����׼�������µ�Ԫ��
		// 		for(int i = 0; i < arr2.length; i++) {
		// 			if(i < len) {
		// 				arr2[i] = arr[i]; //����ԭ�������Ԫ��
		// 			} 
		// 			else {
		// 				System.out.println("��������Ҫ��ӵ�Ԫ�� ��");
		// 				arr2[i] = input.nextInt(); //�������ӵ���Ԫ��
		// 			}
		// 		}
		// 		arr = arr2; //�滻ԭ�����飬�γ��µ�����
		// 	}
		// 	else {
		// 		System.out.println("�˳����Ԫ��");
		// 		break;//�����û���������˳�������
		// 	}
		// }

		// for(int i = 0; i < arr.length; i++) {
		// 	System.out.print(arr[i] + "\t");
		// }


		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3};
		do{

			int[] arr2 = new int[arr.length + 1];
			for(int i = 0; i < arr.length; i++) {
				arr2[i] = arr[i];
			}
			System.out.println("��������Ҫ��ӵ�Ԫ�� �� ");
			arr2[arr.length] = sc.nextInt();
			arr = arr2;
			System.out.println("��ӳɹ�����ǰ����Ϊ ��");
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println("�Ƿ�������Ԫ�� (y/n)�� ");
			char key = sc.next().charAt(0);
			if(key != 'y') {
				break;
			}
		}while(true);
		System.out.println("�˳����Ԫ��~");
	}
}