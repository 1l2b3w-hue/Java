import java.util.Scanner;
public class SeqSearch {

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// String[] arr = {"��üӥ��","��ëʨ��","��������","��������"};
		// System.out.println("��������Ҫ���ҵ����� ��");
		// String name = sc.next();
		// int index = 0;
		// for(int i = 0; i < arr.length; i++) {
		// 	if(name.equals(arr[i])) {
		// 		index = i;
		// 		break;
		// 	}
		// }
		// if(index != 0) {
		// 	System.out.println("�ҵ��ˣ��±�Ϊ��" + index);
		// }
		// else {
		// 	System.out.println("û���ҵ������������");
		// }
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int left = 0;
		int right = arr.length - 1;
		boolean flag = true;
		System.out.println("��������Ҫ���ҵ����� :");
		int number = sc.nextInt();
		while(left <= right) {
			int mid = (left + right) / 2;
			if(number > mid ){
				left = mid + 1;
			}
			else if(number < mid) {
				right = mid - 1;
			}
			else {
				System.out.println("�ҵ��ˣ��±�Ϊ��" + mid);
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("û���ҵ������������");
		}
	}
}