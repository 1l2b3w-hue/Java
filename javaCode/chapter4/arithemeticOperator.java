public class arithemeticOperator {
	// ���������
	public static void main(String[] args) {
		//  / ��ʹ��
		System.out.println(10 / 4);// 2,���������໥���㣬�������������� ʡ������ 
		System.out.println(10.0 / 4);// 2.5,
		double d = 10 / 4; //2.0 ��������
		System.out.println(d);

		//  % ��ʹ�� 
		// ��java�У�ȡ�౾�ʾ��� �� a % b = a - a / b * b;
		// -10 % 3 == -10 - (-10) / 3 * 3 == -10 - (-9) == -1
		System.out.println(10 % 3); //1 
		System.out.println(-10 % 3); //-1 
		System.out.println(10 % -3); // 1
		System.out.println(-10 % -3); // -1  -10 - [(-10) / (-3) * (-3)]

		// ++ ��ʹ��
		int i = 10;
		i++;
		++i;
		System.out.println(i); // 11

		int j = 8;
		// int k = ++j; //�ȼ���j = j + 1; k = j;
		int k = j++; //�ȼ��� k = j; j = j + 1;
		System.out.println(k); //8  9
		System.out.println(j); //9  9
	}
}