public class forceConvertDetail {

	public static void main(String[] args) {

		//ǿת����ֻ���������Ĳ�������Ч�������������ʽ��������Ҫ�����������ȼ�
		// int x = (int)10 * 3.5 + 6 * 1.5;//���󣬽����double
		// double x = (int)10 * 3.5 + 6 * 1.5;
		int x = (int)(10 * 3.5 + 6 * 1.5);
		System.out.println(x);

		// char���Ϳ��Ա���int����ֵ�������޷��������ֵ����ǿת
		char c1 = 100;
		int num = 100;
		char c2 = (char)num;//����
		System.out.println(c2);
	}
}