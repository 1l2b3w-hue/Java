import java.util.Scanner;
public class array01 {

	public static void main(String[] args) {
		// ����Ҫ����ܶ�
		// double a1 = 3;
		// double a2 = 5;
		// double a3 = 1;
		// double a4 = 3.4;
		// double a5 = 2;
		// double a6 = 50;
		// double sum = a1 + a2 + a3 + a4 + a5 + a6;
		// System.out.println("��ֻ������Ϊ �� " + sum + "ǧ��" + " ƽ������Ϊ �� " + 
		// 		(sum / 6) + "ǧ��");

		// ��������
		// double[] : ��ʾһ��double���͵����飬������Ϊ �� hen
		// {3, 5, 1, 3.4, 2, 50} �� ��ʾ�����ֵ/Ԫ�أ����α�ʾ����ĵڼ���Ԫ��
		// double[] hen = {3, 5, 1, 3.4, 2, 50, 7.8, 88.9};
		// double totalWeight = 0;
		// // ����ͨ��������.length����ȡһ������ĳ���
		// int number = hen.length;
		// System.out.println("����ĳ���Ϊ ��" + number);
		// //����ͨ��forѭ������������
		// for(int i = 0; i < number; i++) {
		// 	// ���ǿ���ͨ��hen[�±�]�����������е�Ԫ��
		// 	// �±��Ǵ�0��ʼ
		// 	// System.out.println("��" + i + "��Ԫ�ص�ֵΪ��" + hen[i]);

		// 	totalWeight += hen[i];
		// }
		// System.out.println("��ֻ������Ϊ �� " + totalWeight + "ǧ��" + " ƽ������Ϊ �� " + 
		// 		(totalWeight / number) + "ǧ��");

		// ѭ������5������������double���鲢���
		// Scanner input = new Scanner(System.in);
		// double[] scores = new double[5];

		// for(int i = 0; i < scores.length; i++) {
		// 	System.out.println("�������"+ (i + 1) +  "���˵ĳɼ� ��");
		// 	scores[i] = input.nextDouble();
		// }
		// System.out.println("�ɼ���� ��");
		// for(int i = 0; i < scores.length; i++) {
		// 	System.out.print(scores[i] + "\t");
		// }

		// Scanner input = new Scanner(System.in);
		// double[] scores;
		// scores = new double[5];
		// for(int i = 0; i < scores.length; i++) {
		// 	System.out.println("�������"+ (i + 1) +  "���˵ĳɼ� ��");
		// 	scores[i] = input.nextDouble();
		// }
		// System.out.println("�ɼ���� ��");
		// for(int i = 0; i < scores.length; i++) {
		// 	System.out.println(scores[i]);
		// }

		// 1.�����Ƕ����ͬ�������͵���ϣ�ʵ�ֶ���Щ���ݵĲ���
		// int[] arr = {1,2,3,4,5,6};
		// // int[] arr = {1,2,3,4,5,6,1.1,"hello"};//��ͼ��double��String���͸�ֵ��int
		// double[] arr1 = {1,2,3,5}; //�Զ�ת������ʵ��

		// 2.�����е�Ԫ�ؿ������κ��������ͣ��������ͺ��������Ͷ�����
		// String[] arr = {"|","����","123"};

		// 3.���鱻���������û�и�ֵ�����ḳֵĬ��ֵ �� 
		//  int byte short long : 0; float double : 0.0 boolean : false String: null char :\u0000(0�ַ�)
		// short[] arr2 = new short[4];
		// for(int i = 0; i < arr2.length; i++) {
		// 	System.out.println(arr2[i]);
		// }

		//4.�����±�����ڹ涨��Χ��ʹ�ã�Խ�������±�Խ���쳣��
		// int[] arr4 = new int[5];
		// System.out.println(arr4[5]);

		// 5.�������������������ݣ������������Ƕ������鱾�¾���һ������

		//1.
		// char[] arr = new char[26];
		// for(int i = 0; i < arr.length; i++) {
		// 	arr[i] = (char)('A' + i);
		// }
		// for(int i = 0; i < arr.length; i++) {
		// 	System.out.print(arr[i] + " ");
		// }

		// 2.
		// int[] arr = {4,-1,9,10,23};
		// int max = 0;
		// for(int i = 1; i < arr.length; i++) {
		// 	if(arr[i] > arr[max]) {
		// 		max = i;
		// 	}
		// }
		// System.out.println("���ֵΪ" + arr[max] + " ���±�Ϊ�� " + max);

		//3.
		// double[] arr = {4,1,9,10,23};
		// double sum = 0;
		// for(int i = 0; i < arr.length; i++) {
		// 	sum += arr[i];
		// }
		// System.out.println("��Ϊ ��"+ sum + " ƽ��ֵΪ ��" + (sum / arr.length));

		// �����������͸�ֵ ,��ֵ��ʽ��ֵ���� �� һ�������ı仯����Ӱ�쵽��������
		// int n1 = 2;
		// int n2 = n1;
		// n2 = 80;
		// System.out.println("n1 = " + n1);
		// System.out.println("n2 = " + n2);
		// // ���鸳ֵ��Ĭ������������ô��ݣ���ֵ��ʽ�����ø�ֵ����ֵ���ǵ�ַ
		// int[] arr1 = {1,2,3};
		// int[] arr2 = arr1; //arr2�ı仯��Ӱ�쵽arr1������
		// arr2[0] = 0;
		// for(int i = 0; i < arr1.length; i++) {
		// 	System.out.print(arr1[i]);
		// }

		//����Ŀ���
		// int[] arr1 = {1,2,3};
		// int[] arr2 = new int[arr1.length]; //��������2������1��Сһ��
		// for(int i = 0; i < arr1.length; i++) {
		// 	arr2[i] = arr1[i];
		// }
		// for(int i = 0; i < arr1.length; i++) {
		// 	System.out.print(arr1[i]);
		// }
		// System.out.println();
		// for(int i = 0; i < arr2.length; i++) {
		// 	System.out.print(arr2[i]);
		// }
		// arr2[0] = 10;
		// System.out.println();
		// for(int i = 0; i < arr1.length; i++) {
		// 	System.out.print(arr1[i]);
		// }
		// System.out.println();
		// for(int i = 0; i < arr2.length; i++) {
		// 	System.out.print(arr2[i]);
		// }

		//����ķ�ת
		int[] arr = {11,22,33,44,55,66};
		// int right = arr.length - 1;
		// int left = 0;
		// while(left < right) {
		// 	arr[left] = arr[left] ^ arr[right];
		// 	arr[right] = arr[left] ^ arr[right];
		// 	arr[left] = arr[left] ^ arr[right];
		// 	left++;
		// 	right--;
		// }
		// for(int i = 0; i < arr.length / 2; i++){ //һ��Ҫ��2����Ȼ���������������±��ȥ��
		// 	int tempt = arr[i];
		// 	arr[i] = arr[arr.length - 1 - i]; 
		// 	arr[arr.length - 1 - i] = tempt;
		// }
		int[] arr2 = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = arr[arr.length - 1 -i];
		}
		arr = arr2; //ԭ������ռ�û�б����ã�������
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}