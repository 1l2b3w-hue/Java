public class autoConvertDetail {

	public static void main(String[] args) {
		// �������������ݽ�������ʱ�����Զ�ת��Ϊ���������������������
		int num = 10;
		// float f1 = num + 1.1; //���󣬺����Զ�ת��Ϊdouble
		// double f1 = num + 1.1;
		float f1 = num + 1.1f; 
		//���Ѿ��ȴ������󣩵�����ת��Ϊ����С������С���ᱨ����֮�Զ�ת��
		// int num1 = 1.1;

		//byte short �� char�����Զ�ת��
		byte b1 = 10;
		// byte b2 = 128;//������Χ
		// int n1 = 1;
		// byte b2 = n1;//������ֵʱ�����ж�����
		// char c1 = b1;

		//byte short �� char ��������ʱ��������ת��Ϊint����
		byte b2 = 10;
		byte b3 = 11;
		short s1 = 11;
		int s2 = s1 + b2;//����
		// byte b4 = b2 + b3;//Ҳ��int

		//boolean ������ת��
		boolean pass = true;
		// int n4 = pass;

		//�Զ�����ԭ�� �� ���ʽ��������ͽ����Զ�����Ϊ����������������

		byte b4 = 10;
		short s4 = 100;
		int n4 = 1;
		float d5 = 1.1F;
		double d6 = b4 + s4 + n4 + d5;
	}
}