import java.util.Scanner;
public class ArrayReduce {

	public static void main(String[] args) {
		// �����û�Ҫ���Ƿ�ɾ������һ��Ԫ��
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4,5};
		while(true) {
			System.out.println("�Ƿ�ɾ���������һ��Ԫ�� �� ��y/n��");
			char key = sc.next().charAt(0);
			if(arr.length == 1) {
				System.out.println("������������");
				break;
			}
			else {
				if(key == 'y') {
				int[] arr2 = new int[arr.length - 1];
				for(int i = 0; i < arr2.length; i++) {
					  arr2[i] = arr[i];
				}
				arr = arr2;
				System.out.println("��������Ԫ��Ϊ ��");
				for(int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();
				}
				else {
					break;
				}
			}
		}
		System.out.println("�˳�ɾ�����һ��Ԫ��~");
	}
}