public class floatDetail {

	public static void main(String[] args) {

		// float a = 1.2; //double���͸�ֵ��float����ʱ���ᶪʧ���ȣ�����
		float a = 1.2f;
		double b = 2.5;
		double c = 3.2f; //���Էţ����Ǿ�������һ������ֵ
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(5.12e2);

		double d = 3.123456789;
		float e = 3.123456789f; //�ᶪʧ�����λ��
		System.out.println(d);
		System.out.println(e);

		double f = 2.7;
		double g = 8.1 / 3; //Ӧ����2.7�������2.699999....��һ���ӽ�2.7��С��
		System.out.println(f);
		System.out.println(g);

		System.out.println(Math.abs(f - g));

		//��ȷ�ж�Ӧ��ͨ����ֵ�ľ���ֵ���ж�
		if(Math.abs(f - g ) < 0.000001) {
			System.out.println("������������ȵ�");

		}
	}
}